package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each of the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in your array.
 *
 * For example, the length of your array of zeros . Your list of queries is as follows:
 *
 *     a b k
 *     1 5 3
 *     4 8 7
 *     6 9 1
 * Add the values of  between the indices  and  inclusive:
 *
 * index->	 1 2 3  4  5 6 7 8 9 10
 * 	[0,0,0, 0, 0,0,0,0,0, 0]
 * 	[3,3,3, 3, 3,0,0,0,0, 0]
 * 	[3,3,3,10,10,7,7,7,0, 0]
 * 	[3,3,3,10,10,8,8,8,1, 0]
 * The largest value is  after all operations are performed.
 *
 * Function Description
 *
 * Complete the function arrayManipulation in the editor below. It must return an integer, the maximum value in the resulting array.
 *
 * arrayManipulation has the following parameters:
 *
 * n - the number of elements in your array
 * queries - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.
 * Input Format
 *
 * The first line contains two space-separated integers  and , the size of the array and the number of operations.
 * Each of the next  lines contains three space-separated integers ,  and , the left index, right index and summand.
 *
 * Constraints
 *
 * Output Format
 *
 * Return the integer maximum value in the finished array.
 *
 * Sample Input
 *
 * 5 3
 * 1 2 100
 * 2 5 100
 * 3 4 100
 * Sample Output
 *
 * 200
 */

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long resultado=0;
        //long[] zeros=new long[n];
        List<Integer> zeros= new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i].length ; j++) {
                zeros
            }

        }
        return resultado;
    }

    public List<String> getEvenIndexedStrings(String[] names) {
        List<String> evenIndexedNames = IntStream
                .range(0, names.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> names[i])
                .collect(Collectors.toList());

        return evenIndexedNames;
    }
    

    public static void main(String[] args) {
        int k=5;
        int[][] quer={{1,2,100},{2,5,100},{3,4,100},{1,2,0}};
        System.out.println("El numero maximo es: "+quer.length/**+arrayManipulation(k,quer**/);
    }

}
