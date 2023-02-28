package actions;

import com.google.inject.Inject;
import date.Date;

public class Subtraction {

    public void subtraction(Date date){
        if (date.getAction().equals("-")){
            System.out.println("Result: " + (date.getA() - date.getB()));
        }
    }

}
