package cn.edu.tsinghua.training.javase.classroom;

import java.util.Arrays;

/**
 * Created by ${NingRan} on 2016/7/1.
 */
public class Array2D {
    public static void main(String[] args) {
        String[][] strings = new String[3][5];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings [i][j] = i +":"+j;

            }
        }

        System.out.println(strings[2][4]);
        System.out.println(strings[0].length);
        System.out.println(strings[1].length);
        System.out.println(strings[2].length);

        int[][] ints = new int[3][];
        ints[0] = new int[3];
        ints[1] = new int[5];
        ints[2] = new int[7];

        double[][] doubles ={
                {1,2,3,},
                {4,5,6,7,8},
                {9,10,11,12,13,14,15},
        };
        System.out.println(doubles[doubles.length - 1][doubles[doubles.length - 1].length]);

        for (double[] aDouble : doubles) {
            for (double v : aDouble) {
                System.out.print(v  + "\t");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(doubles));
    }

}
