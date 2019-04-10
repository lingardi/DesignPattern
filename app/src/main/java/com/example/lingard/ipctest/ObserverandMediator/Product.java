package com.example.lingard.ipctest.ObserverandMediator;

import com.example.lingard.ipctest.ObserverP.Observer;

/**
 * Created by lingard on 2019/4/4.
 * 单来源调用（Single Call）:在工厂类ProductManager中定义了一个私有变量isCreateProduct，该变量只有在工厂类的
 * createProduct函数中才能设置为true,它在产品类中限制必须是当前有效工厂才能生产该产品，而且也只有有效的工厂才能
 * 修改产品,采用单来源调用的两个对象一般是组合关系，两者有相同的生命期，它通常适用于有单例模式和工厂方法模式
 * 的场景中。
 */

public class Product implements Cloneable {
    private String name;
    private boolean canChanged = false;

    public Product(ProductManager manager, String name){
        if (manager.isCreateProduct()){
            canChanged = true;
            this.name = name;
        }
    }

    public void setName(String name) {
        if (canChanged)
            this.name = name;
    }

    public String getName() {
        return name;
    }

    public Product clone(){
        Product product = null;
        try {
            product = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
