import actions.Addition;
import actions.Division;
import actions.Multiplication;
import actions.Subtraction;
import com.google.inject.Guice;
import com.google.inject.Injector;
import date.Date;

import java.security.Guard;

public class Main {
    public static void main(String[] args) {
        Injector inject =  Guice.createInjector(new MainModule());

        Date date = inject.getInstance(Date.class);
        
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        date.scn();
        System.out.println(date.getA() + " " + date.getAction() + " " + date.getB());
        addition.addition(date);
        subtraction.subtraction(date);
        multiplication.multiplication(date);
        division.division(date);

    }
}
