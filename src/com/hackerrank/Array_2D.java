package com.hackerrank;

public class Array_2D {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max= Integer.MIN_VALUE;
        int sumatoria=0;

        int[][] arr_to_sum = new int[3][3];
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                 sumatoria = (arr[i][j]+arr[i][j+1]+arr[i][j+2])+
                        (arr[i+1][j+1])+
                        (arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
                //sumatoria = sum_matrix(arr_to_sum);
                if (sumatoria > max)
                    max = sumatoria;
            }
        }
        return max;
    }

    static int hourglassSum2(int[][] arr) {
        int max= Integer.MIN_VALUE;
        int sumatoria=0;

        int[][] arr_to_sum = new int[3][3];
        for (int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        arr_to_sum[k][l] = arr[k+i][l+j];
                    }
                }
                sumatoria = sum_matrix(arr_to_sum);
                if (sumatoria > max)
                    max = sumatoria;
            }
        }
        return max;
    }

    static int sum_matrix(int[][] arr_to_sum){
        int resultado=0;
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
            {
                if (i!=1)
                    resultado+=arr_to_sum[i][j];
                else {
                    if (j==1)
                        resultado+=arr_to_sum[i][j];
                }
            }
        return resultado;
    }

    public static void main(String[] args) {
        int[][] prueba={
                {1 ,1 ,1, 0, 0, 0},
                {0 ,1 ,0 ,0 ,0 ,0},
                {1 , 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
       // System.out.println("El valor es: "+hourglassSum(prueba));
        int numTries = 10000000;
        long begTime = System.currentTimeMillis();
        for (int i = 0; i < numTries; ++i) {
            hourglassSum(prueba);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Total time for %10d tries: %d ms\n", numTries, (endTime-begTime));
    }
}
