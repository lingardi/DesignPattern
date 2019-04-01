package com.example.lingard.ipctest.CommandandResponsibility;

/**
 * Created by lingard on 2019/3/29.
 */

public class LS_L extends AbstractLs {
    @Override
    protected String getOperateParam() {
        return L_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManger.ls_l(vo.toString());
    }
}
