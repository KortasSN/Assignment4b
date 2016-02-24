package com.josh;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //ask how many training times to enter
        Scanner amountScanner = new Scanner(System.in);
        System.out.println("How many training runs do you want to enter?");
        int getcounter = amountScanner.nextInt();

        getInfo(getcounter);

        System.out.println("finished");
    }


    static HashMap getInfo(int counter) {

        HashMap<String, Double> lakeInfo = new HashMap();
        for (int x = 0; x< counter; x++) {
            Scanner lakeScanner = new Scanner(System.in);
        System.out.println("Enter the lake name:");
        String lakeName = lakeScanner.nextLine();
        Scanner runScanner = new Scanner(System.in);
            System.out.println("How long did it take you?");
            double runTime = runScanner.nextDouble();
            lakeInfo.put(lakeName, runTime);
        }
        return lakeInfo;
    }
}
