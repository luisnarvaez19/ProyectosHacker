package com.rappi;

public class ReachingPoints {
    /*
     * Complete the 'canReach' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER y1
     *  3. INTEGER x2
     *  4. INTEGER y2
     */

    public static String canReach(int x1, int y1, int x2, int y2) {
        // Write your code here
        if(x1==x2 && y1==y2)
            return "Yes";
        if(x1>x2 || y1>y2 )
            return "No";

        if(x1==x2) {
            if ((y2-y1) % x2 == 0) return "Yes";
            else return "No";
        }
        if(y1==y2) {
            if ((x2-x1) % y2 == 0) return "Yes";
            else return "No";
        }
        if (x2>y2) x2=x2%y2;
        else y2=y2%x2;
        return canReach(x1,y1,x2,y2);

    }

    public static void main(String[] args) {
        System.out.println("CanReach: "+ canReach(1,1,5,2));
        System.out.println("CanReach: "+ canReach(10,5,100,5));
        System.out.println("CanReach: "+ canReach(1,1,5,2));
        System.out.println("CanReach: "+ canReach(3,7,24,7));
    }
}
