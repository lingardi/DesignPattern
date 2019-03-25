package com.example.lingard.ipctest.DecoratorP;

/**
 * Created by lingard on 2019/3/11.
 */

public class HighScoreDecorator extends Decorator{
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
        // TODO Auto-generated constructor stub
    }

    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    //我要在老爸看成绩单前告诉他最高成绩，否则等他一看，就抡起扫帚揍我，我哪里还有机会说啊
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
