package actions;

import com.google.inject.Inject;
import date.Date;

public class Multiplication {

    public void multiplication(Date date){
        if(date.getAction().equals("*")){
            System.out.println("Result: " + (date.getA() * date.getB()));
        }
    }

}
