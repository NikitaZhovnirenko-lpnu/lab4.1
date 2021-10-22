package com.company;

public class Main {

    public static void main(String[] args) {


        //цикл for з використанням інкременту
        double prod = 1;
        double i;

        for (i = 1; i <= 15; i++) {
            prod *= ( Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(1 / i), 2)  ) / Math.pow(i, 2);
        }

        System.out.println("1) Результат: " + prod);
        //цикл do-while
        prod = 1;
        i = 1;

        do {

            prod *= ( Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(1 / i), 2)  ) / Math.pow(i, 2);
            i++;


        }while(i <= 15);

        System.out.println("2) Результат: " + prod);
        //цикл while
        i = 1;
        prod = 1;
        while(i <= 15)
        {
            prod *= ( Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(1 / i), 2)  ) / Math.pow(i, 2);
            i++;

        }
        System.out.println("3) Результат: " + prod);


        //цикл for з використанням декременту
        prod = 1;

        for (i = 15; i >= 1; i--) {
            prod *= ( Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(1 / i), 2)  ) / Math.pow(i, 2);
        }

        System.out.println("4) Результат: " + prod);



    }

}
