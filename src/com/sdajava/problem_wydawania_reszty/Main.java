package com.sdajava.problem_wydawania_reszty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwote, ktora chcesz wydac: ");

        int R = scanner.nextInt();


        int[] N = {200, 100, 50, 20, 10, 5, 2, 1};
        int L;

        for (int i = 0; i<N.length; i++){
            if(R < 0){
                break;
            }
            else if(R >= N[i]){
                L = R / N[i];
                R = R - (N[i] * L);
                System.out.println("Nominał " + N[i] + " zl x " + L);
            }else{
            }
        }
    }
}

        //lub

    /*Scanner scanner = new Scanner(System.in);
      System.out.println("Podaj kwote, ktora chcesz wydac: ");

                int R = scanner.nextInt();


                int[] N = {200, 100, 50, 20, 10, 5, 2, 1};
                int i = 0;

                while(R > 0) {
                    if (R >= N[i]) {
                        int L = R / N[i];
                        R = R - (N[i] * L);
                        System.out.println("Nominał " + N[i] + " x " + L);
                    } else {
                        i = i + 1;
                    }
                }*/
