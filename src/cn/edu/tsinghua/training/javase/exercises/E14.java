package cn.edu.tsinghua.training.javase.exercises;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/22.
 */
//输入某年某月某日，判断这一天是这一年的第几天？(闰年： 西元年份除以400余数为0的，或者除以4为余数0且除以100不为余数0的，为闰年。)
public class E14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "input year:" );
        int year = scanner.nextInt ();
        System.out.println ( "input month:" );
        int month = scanner.nextInt ();
        System.out.println ( "input day:" );
        int day = scanner.nextInt ();



        E14 e14 = new E14 ();

        int sum = 0;
        switch (month - 1){
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                if (e14.isLeapYear(year)){
                    sum += 29;
                }else{
                    sum += 28;
                }
            case 1:
                sum += 31;
        }
        sum += day;
        System.out.println (year + "-"+ month + "-" + day + "是" + year + "年的第" + sum + "天。");
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0 ) && (year % 100 != 0));
    }
}

