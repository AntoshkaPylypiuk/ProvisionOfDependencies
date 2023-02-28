package actions;

import date.Date;

public class Addition {

    public void addition(Date date){
        if(date.getAction().equals("+")){
            System.out.println("Result:" + (date.getA() + date.getB()));
        }
    }
}
