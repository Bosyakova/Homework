package Com.Home.Massiv;

import java.util.Scanner;

public class Masiv7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[7];
        System.out.println("Заполните массив числами");
        for (int i =0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
            for (int i = 0; i < array.length; i++) {
                int dublicat = array[i];
                int count = 0;
                for (int j = i+1; j < array.length; j++) {
                    if (dublicat == array[j]) {
                        count++;
                    }
                }
                if (count != 0) {
                    System.out.println(dublicat);
                }
            }
        }
    }

