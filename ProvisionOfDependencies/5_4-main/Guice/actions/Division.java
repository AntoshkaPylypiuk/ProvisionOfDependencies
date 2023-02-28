package actions;

import com.google.inject.Inject;
import date.Date;

import javax.xml.crypto.Data;

public class Division {

    public  void division(Date date){
        if (date.getAction().equals("/")){
            System.out.println("Result:" + (date.getA() / date.getB()));
        }
    }

}
