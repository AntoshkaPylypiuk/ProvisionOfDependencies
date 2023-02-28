package actions;

import date.Date;

public class Division {
    public  void division(Date date){
        if (date.getAction().equals("/")){
            System.out.println("Result:" + (date.getA() / date.getB()));
        }
    }
}
