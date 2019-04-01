package com.example.lingard.ipctest.CommandandResponsibility;

/**
 * Created by lingard on 2019/3/29.
 */

public class LS_A extends AbstractLs {
    @Override
    protected String getOperateParam() {
        return A_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManger.ls_a(vo.toString());
    }
}
