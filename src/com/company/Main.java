package com.company;



public class Main {
    static Chisla c = new Chisla();


    public static void main(String[] args) {


        Chisla c = new Chisla();
        c.setNum1((c.setSumm(0, 1)));
        System.out.println("num1 = " + c.getNum1());
        c.setNum2(c.setSumm(c.getNum1(), c.getNum2()));


        System.out.println("num2 = " + c.getNum2());
        c.setNum3(c.setSumm(c.getNum1(), c.getNum2()));

        System.out.println("num3 = " + c.getNum3());
        for (int i = 0; i < 4; i++){
             c.setNum1(c.setSumm(c.getNum1(),c.getNum2()));//2
            System.out.println("num1 =+ " + c.getNum1());
             c.setNum2(c.setSumm(c.getNum2(), c.getNum3()));//3
            System.out.println("num2 =+ " + c.getNum2());
            c.setNum3(c.setSumm(c.getNum1(), c.getNum2()));//5
           System.out.println("num3 =+ " + c.getNum3());
        }
    }
}









