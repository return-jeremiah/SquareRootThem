package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int[] numbers = new int [5];

        for (int i = 0; i < 5; i ++) {
            System.out.print(i+1 + ". ");
            numbers[i]=input.nextInt();
        }
        for(int num : numbers){
            int rootNumber = num / num;
            System.out.println(rootNumber + "\t");
        }
    }
}
