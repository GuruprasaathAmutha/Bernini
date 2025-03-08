package org.npci.upi.urcs.Practise;

public class SlidingWindow {

    public static void main(String[] args) {
        System.out.println(maximumSumSubarray(new int[]{100, 200, 300, 400}, 1));
    }


    public static int maximumSumSubarray(int[] arr, int k) {
        if (k > arr.length) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <= k - 1; i++) {
            sum += arr[i];
        }
        int res = sum;
        int ptr1 = 0;
        int ptr2 = k;
        for (int i = 0; i <= arr.length - k - 1; i++) {
            sum += arr[ptr2] - arr[ptr1];
            res = Math.max(res, sum);
            ptr1++;
            ptr2++;
        }
        return res;
    }
}
