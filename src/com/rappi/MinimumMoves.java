package com.rappi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumMoves {
    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY m   1 dia y 3 horas comence a las 11 20 am
     */

    public static int minimumMoves(List<Integer> a, List<Integer> m) {
        // Write your code here
        int resultado=0;
        for (int i=0; i<a.size(); i++) {
            String as= String.valueOf(a.get(i));
            String ms= String.valueOf(m.get(i));
            int length = as.length();
            for (int j=0;j<length; j++) {
                int num1=Integer.parseInt(as.substring(j,j+1));
                int num2=Integer.parseInt(ms.substring(j,j+1));
                resultado+=Math.abs(num1-num2);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> pri=  new ArrayList<>(Arrays.asList(1234, 4321));
        List<Integer> sec=  new ArrayList<>(Arrays.asList(2345, 3214));
        System.out.println("El numero es: "+minimumMoves(pri,sec));
    }
}
