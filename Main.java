package com.idan;
import java.util.Arrays;
public class Main {

    public static int[] rotLeft(int[] a, int d){
        int n=a.length;
        for (int j = 0; j < d ; j++) {
            int tmp= a[a.length-1];
            for (int i = a.length-1  ; i >= 1  ; i --) {
                a[i]=a[i-1];
            }
            a[0]=tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a= {4,5,7,8,2,3};
        System.out.println(Arrays.toString(rotLeft(a,6)));
    }
}
