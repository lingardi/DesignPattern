package com.example.lingard.ipctest.CommandandResponsibility;

/**
 * Created by lingard on 2019/3/29.
 */

public class LS extends AbstractLs {
    @Override
    protected String getOperateParam() {
        return super.DEFAULT_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManger.ls(vo.toString());
    }
}
