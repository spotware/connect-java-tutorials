package com.mycompany.app;

import info.monitorenter.gui.chart.Chart2D;
import info.monitorenter.gui.chart.ITrace2D;
import info.monitorenter.gui.chart.traces.Trace2DLtd;

import java.awt.*;

public class SpotsChart extends Chart2D {
    private long startTime;
    private ITrace2D trace;

    public SpotsChart() {
        trace = new Trace2DLtd(200);
        trace.setColor(Color.RED);
        addTrace(trace);
    }

    public void addPoint(double value) {
        if (startTime == 0) {
            startTime = System.currentTimeMillis();
        }
        trace.addPoint(((double) System.currentTimeMillis() - this.startTime), value);
    }
}