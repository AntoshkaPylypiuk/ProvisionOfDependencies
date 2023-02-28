
import actions.Addition;
import actions.Division;
import actions.Multiplication;
import actions.Subtraction;
import date.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Date.class);
        Date date = context.getBean(Date.class);

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
