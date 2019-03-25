package com.example.lingard.ipctest.MementoP;

/**
 * Created by lingard on 2019/3/18.
 * 不要在频繁建立备份的场景中使用备忘录模式（比如一个for循环中），原因有二：
 * 一是控制不了备忘录建立的对象数量；二是大对象的建立是要消耗资源的，系统的性能需要考虑。
 */

public class Client {
    public static void main(String[] args){
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento((Memento) boy.createMemento());
        boy.restoreMemento(caretaker.getMemento());
    }
}
