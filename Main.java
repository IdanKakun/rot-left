package com.idan;
import java.util.Arrays;
public class Main {

    public static int[] rotLeft(int[] a, int d){
        int n=a.length;
        for (int j = 0; j < d ; j++) {
            int tmp= a[0];
            for (int i = 0  ; i < n-1  ; i ++) {
                a[i]=a[i+1];
            }
            a[n-1]=tmp;

        }
        return a;
    }

    public static void main(String[] args) {
        int[] a= {4,5,7,8,2,3};
        System.out.println(Arrays.toString(rotLeft(a,6)));
    }
}
