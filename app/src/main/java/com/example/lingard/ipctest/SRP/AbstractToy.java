package com.example.lingard.ipctest.SRP;

import com.example.lingard.ipctest.SRP.AbstractGun;

/**
 * Created by lingard on 2019/2/28.
 */

public abstract class AbstractToy {
    private AbstractGun gun;
    public AbstractToy(AbstractGun gun){
        this.gun=gun;
    }

    public abstract void shoot();
}
