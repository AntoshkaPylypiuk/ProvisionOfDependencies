package date;

import java.util.Scanner;

public class Date {
    private int a;

    private int b;

    private String action ;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getAction() {
        return action;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void scn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number ");
        setA(scanner.nextInt());

        System.out.println("Second number ");
        setB(scanner.nextInt());

        System.out.println("Action ");
        setAction(scanner.next());
    }

}
