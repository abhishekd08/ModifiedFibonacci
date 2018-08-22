package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int cases = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < cases; i++) {
                String[] in = br.readLine().split(" ");
                int n = Integer.parseInt(in[0]);
                int k = Integer.parseInt(in[1]);
                int[] numArr = new int[k];
                long[] output = new long[n];
                String[] numStr = br.readLine().split(" ");
                for (int j = 0; j < k; j++){
                    numArr[j] = Integer.parseInt(numStr[j]);
                    output[j] = numArr[j];
                }
                for (int j=k;j<n;j++){
                    long val = output[j-k];
                    for (int p=j-k+1;p<j;p++){
                        val = (val*output[p])%1000000007;
                    }
                    output[j] = val;
                }
                System.out.println(output[n-1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
