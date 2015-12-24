package com.mycompany.app;

import java.util.Queue;

/**
 * Created by sgologuzov on 29/05/2015.
 */
class MenuItem {
    @FunctionalInterface
    public interface ItemAction {
        void invoke(OpenApiMessagesFactory msgFactory, Queue _writeQueue);
    }

    public char cmdKey;
    public String itemTitle;
    public ItemAction itemHandler;

    public MenuItem() {
    }

    public MenuItem(char _cmdKey, String _itemTitle, ItemAction _itemHandler) {
        cmdKey = _cmdKey;
        itemTitle = _itemTitle;
        itemHandler = (OpenApiMessagesFactory msgFactory, Queue _writeQueue) -> _itemHandler.invoke(msgFactory, _writeQueue);
    }

    public MenuItem clone() {
        MenuItem varCopy = new MenuItem();

        varCopy.cmdKey = this.cmdKey;
        varCopy.itemTitle = this.itemTitle;
        varCopy.itemHandler = this.itemHandler;

        return varCopy;
    }
}
