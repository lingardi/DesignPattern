package com.example.lingard.ipctest.ObserverandMediator;

import java.util.Observable;

/**
 * Created by lingard on 2019/4/4.
 */

public class ProductEvent extends Observable {
    private Product source;
    private ProductEventType type;

    public ProductEvent(Product product){
        this(product, ProductEventType.NEW_PRODUCT);
    }
    public ProductEvent(Product product, ProductEventType type){
        this.source = product;
        this.type = type;
        notifyEventDispatch();
    }

    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers();
    }

    public Product getSource(){
        return this.source;
    }

    public ProductEventType getType() {
        return type;
    }
}
