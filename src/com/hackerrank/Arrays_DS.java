package com.hackerrank;

public class Arrays_DS {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        if (a==null) return null;
        int longitud=a.length;
        int[] res=new int[longitud];

        for (int i=0; i<longitud; i++)
            res[i]=a[longitud-1-i];
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {};
        int[] res = reverseArray(arr);
        for (int i=0; i<res.length; i++)
            System.out.println(res[i]);
    }
}
