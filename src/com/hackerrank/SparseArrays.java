package com.hackerrank;

/**
 * There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings.
 *
 * For example, given input  and , we find  instances of ',  of '' and  of ''. For each query, we add an element to our return array, .
 *
 * Function Description
 *
 * Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.
 *
 * matchingStrings has the following parameters:
 *
 * strings - an array of strings to search
 * queries - an array of query strings
 * Input Format
 *
 * The first line contains and integer , the size of .
 * Each of the next  lines contains a string .
 * The next line contains , the size of .
 * Each of the next  lines contains a string .
 */

public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] resul=new int[queries.length];
        int j = 0;
        for (int i = 0; i < queries.length; i++) {
            int contador=0;
            for (int k = 0; k < strings.length; k++) {
                if (strings[k].equals(queries[i]))
                    contador++;
            }
            resul[j++]=contador;
        }
        return resul;

    }

    public static void main(String[] args) {
        String[] str={"ab","ab","abc"};
        String[] quer={"ab","abc","bc"};
        int[] resultado=matchingStrings(str, quer);
        if (resultado!=null) {
            for (int i = 0; i < resultado.length; i++) {
                System.out.println(resultado[i]);
            }
        } else
            System.out.println("La matriz resultante es null");
    }

}
