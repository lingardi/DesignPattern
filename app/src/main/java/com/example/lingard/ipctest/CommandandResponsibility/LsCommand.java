package com.example.lingard.ipctest.CommandandResponsibility;

/**
 * Created by lingard on 2019/3/29.
 */

public class LsCommand extends Command {
    @Override
    public String execute(CommandVO vo) {
        return super.buildChain(AbstractLs.class).get(0).handleMessage(vo);
    }
}
