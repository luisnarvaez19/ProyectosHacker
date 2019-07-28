package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {



    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        int lastAnswer = 0;
        List<Integer> resultado = new ArrayList<>();
        List<List<Integer>> seqList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<Integer>());
        }

        int j = 0;
        for (List<Integer> query : queries) {
            int secuenciasel = ((query.get(1) ^ lastAnswer) % n);

            if (query.get(0) == 1) {
                seqList.get(secuenciasel).add(query.get(2));
            } else {
                int length = seqList.get(secuenciasel).size();
                if (length>0)
                    lastAnswer = seqList.get(secuenciasel).get((query.get(2) % length)%n);
                System.out.println("lastAnswer: " + lastAnswer);
                resultado.add(lastAnswer);
            }

        }

        return resultado;
    }


    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>();

      /*  queries.add(Arrays.asList(1, 0, 5));
        queries.add(Arrays.asList(1, 1, 7));
        queries.add(Arrays.asList(1, 0, 3));
        queries.add(Arrays.asList(2, 1, 0));
        queries.add(Arrays.asList(2, 1, 1));
        dynamicArray(2, queries);*/

        queries.add(Arrays.asList(1, 345255357, 205970905));
        queries.add(Arrays.asList(1, 570256166, 75865401));
        queries.add(Arrays.asList(1, 94777800, 645102173));
        queries.add(Arrays.asList(2, 736380701, 402184046));
        queries.add(Arrays.asList(2, 798108301, 416334323));
        dynamicArray(100, queries);

         /* for (List<Integer> secuencia3 : seqList) {
                for (int valor : secuencia3)
                    System.out.print( valor + " ");
                System.out.println(" ");
            }*/

    }

}
