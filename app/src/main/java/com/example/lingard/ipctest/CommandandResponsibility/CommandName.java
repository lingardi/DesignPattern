package com.example.lingard.ipctest.CommandandResponsibility;

/**
 * Created by lingard on 2019/3/29.
 */

public abstract class CommandName {
    private CommandName nextOperator;
    public String handleMessage(CommandVO commandVO){
        String result = "";
        if (commandVO.getParam().size() == 0 || commandVO.getParam().contains(this.getOperateParam())){
            result = this.echo(commandVO);
        }else {
            if (this.nextOperator != null) {
                result = this.nextOperator.handleMessage(commandVO);
            }else {
                System.out.println("命令错误");
            }
        }
        return  result;
    }
    public void setNext(CommandName _operator){
        this.nextOperator = _operator;
    }
    //每个处理者都要处理一个后缀参数
    protected abstract String getOperateParam();
    //每个处理者都必须实现处理任务
    protected abstract String echo(CommandVO vo);
}
