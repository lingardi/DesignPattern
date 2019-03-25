package com.example.lingard.ipctest.FacedeP;

/**
 * Created by lingard on 2019/3/15.
 */

public class Facede {
    ILetterProcess letterProcess = new LetterProcess();
    LetterProcessB letterProcessB = new LetterProcessB();
    LetterProcessC letterProcessC = new LetterProcessC();

    public void methodA(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }

    public void methodB(){
        letterProcessB.dosomethingB();
    }

    public void methodC(){
        letterProcessC.dosomethingC();
    }

}
