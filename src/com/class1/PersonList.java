
        package com.class1;

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class PersonList extends Person {
    Wallet wallet;
    public PersonList(){
        this.wallet = new Wallet();
    }
    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customerCode");
        customerCode=input.nextLine();
        System.out.println("Enter customerName");
        customerName=input.nextLine();
        System.out.println("Enter accNumber");
        accNumber=input.nextInt();

    }


}