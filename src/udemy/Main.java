package udemy;

import java.text.ParseException;

import java.util.Scanner;

public class Main {
public static Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) throws ParseException {

        System.out.println("Enter your product price");
        double productPrice=scanner.nextDouble();
        System.out.println("Enter amount you have to enter");
        double amount=scanner.nextDouble();
        double change=amount-productPrice;
        int twoHundred=200;
        int hundred=100;
        int fifty=50;
        int twenty=20;
        int ten =10;
        int five=5;
        int one=1;

        int fiveused=0;
        int tenUsed=0;
        int twentyUsed=0;
        int fiftyUsed=0;
        int hundredUsed=0;
        int twoHundredUsed=0;
        int oneUsed=0;


        System.out.println("the change is "+ change);
        while (change>0) {

            if (change >= twoHundred) {
                ++twoHundredUsed;
                change = change - twoHundred;


            }
            else if (change >= hundred) {
                ++hundredUsed;


                change = change - hundred;

            }
            else if (change >= fifty) {
                ++fiftyUsed;


                change = change - fifty;

            }
            else if (change >= twenty) {
                ++twentyUsed;

                change = change - twenty;

            }
            else if (change >= ten) {
                ++tenUsed;

                change = change - ten;

            }
            else if (change >= five) {
                ++fiveused;

                change = change - five;

            }
            else if (change>=1){
                ++oneUsed;
                change=change-one;

            }
            else{
                System.out.println("paraniz "+change+" ile eksik terar deneyiniz");
            }




        }
        System.out.println(oneUsed+"\t units of one has been used");
        System.out.println(fiveused+"\t units of five has been used");
        System.out.println(tenUsed+" \t units of ten has been used");
        System.out.println(twentyUsed+"\t units of twenty has been used");
        System.out.println(fiftyUsed+"\t units of fifty has been used");
        System.out.println(hundredUsed+"\t units of hundred has been used");
        System.out.println(twoHundredUsed+"\t units of two hundred has been used");


    }



    }








