package onineStore.checkout.payment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JastProgram {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = n-1;
        int j = m-1;
        int k = n+m-1;
        // Traverse both array
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i = i - 1;
            }
            else{
                arr1[k] = arr2[j];
                j = j - 1;
            }
            k = k - 1;
        }
        while (i >= 0){
            arr1[k] = arr1[i];
            i = i - 1;
            k = k - 1;
        }
        while (j >= 0){
            arr1[k] = arr2[j];
            j = j - 1;
            k = k - 1;
        }

    }


        public static void main(String[] args) {
JastProgram jastProgram = new JastProgram();
jastProgram.merge(new int[]{3, 9, 10, 18, 23},5,new  int[]{5, 12, 15, 20, 21, 25} , 6);
    }
}
