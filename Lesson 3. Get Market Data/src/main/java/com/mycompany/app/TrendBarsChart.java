package com.mycompany.app;

import com.mycompany.app.model.TrendbarJson;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.ui.ApplicationFrame;

import java.util.Date;


/**
 * Created by sgologuzov on 18/05/2015.
 */
public class TrendBarsChart extends ApplicationFrame {
    private double minRange = Double.MAX_VALUE;
    private double maxRange = Double.MIN_VALUE;
    private OHLCDataset dataSet;

    /**
     * A demonstration application showing a candlestick trendbars chart.
     *
     * @param title  the frame title.
     */
    public TrendBarsChart(final String title, TrendbarJson[] data) {
        super(title);
        setData(title, data);
        JFreeChart chart = createChart(title, dataSet);
        chart.getXYPlot().setOrientation(PlotOrientation.VERTICAL);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }

    /**
     * Sets data and converts it to JFreeChart format
     * @param data Trendbars data
     */
    private void setData(String seriesKey, TrendbarJson[] data) {
        Date[] date = new Date[data.length];
        double[] high = new double[data.length];
        double[] low = new double[data.length];
        double[] open = new double[data.length];
        double[] close = new double[data.length];
        double[] volume = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            TrendbarJson trendbar = data[i];
            date[i] = new Date(trendbar.getTimestamp());
            if(trendbar.getHigh() > maxRange) {
                maxRange = trendbar.getHigh();
            }
            high[i] = trendbar.getHigh();
            low[i] = trendbar.getLow();
            if(trendbar.getLow() < minRange) {
                minRange = trendbar.getLow();
            }
            open[i] = trendbar.getOpen();
            close[i] = trendbar.getClose();
            volume[i] = trendbar.getVolume()/100.00;
        }
        this.dataSet = new DefaultHighLowDataset(seriesKey, date, high, low, open, close, volume);
    }

    /**
     * Creates a chart.
     *
     * @param dataset  the dataset.
     *
     * @return The dataset.
     */
    private JFreeChart createChart(String title, final OHLCDataset dataset) {
        final JFreeChart chart = ChartFactory.createCandlestickChart(
                title,
                "Time",
                "Value",
                dataset,
                true
        );
        XYPlot xyPlot = chart.getXYPlot();
        ValueAxis rangeAxis = xyPlot.getRangeAxis();
        rangeAxis.setRange(minRange, maxRange);
        return chart;
    }
}