package com.example.lingard.ipctest.CommandandResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lingard on 2019/3/29.
 */

public abstract class Command {
    public abstract String execute(CommandVO vo);

    protected List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass){
        List<Class> classes = ClassUtils.getSonClass(abstractClass);
        List<CommandName> commandNameList = new ArrayList<CommandName>();
        for (Class c : classes){
            CommandName commandName = null;
            try {
                commandName = (CommandName)Class.forName (c.getName()) .newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
            if(commandNameList.size()>0){
                commandNameList.get(commandNameList.size()-1).setNext (commandName);
            }
            commandNameList.add(commandName);
        }
        return commandNameList;
    }
}
