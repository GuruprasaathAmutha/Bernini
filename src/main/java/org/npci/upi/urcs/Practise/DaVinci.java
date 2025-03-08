package org.npci.upi.urcs.Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaVinci {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		mergeNew(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);  [3,9,7,2,1,7], k = 4
//        System.out.println(largestInteger(new int[]{3, 9, 2, 1, 7}, 3));
//        System.out.println(largestInteger(new int[]{3, 9, 7, 2, 1, 7}, 4));
//        System.out.println(largestInteger(new int[]{0, 0}, 1));
//        System.out.println(largestInteger(new int[]{3, 1, 7, 10, 0}, 1));
//        System.out.println(largestInteger(new int[]{4, 4, 2, 2, 2, 0, 5, 3, 4, 4}, 3));
        System.out.println(largestInteger(new int[]{7, 5, 9, 10, 0, 12, 3, 12, 10}, 1));

    }

    public static int largestIntegerSlidingWindow(int[] nums, int k) {


        return -1;
    }


    public static int largestInteger(int[] nums, int k) {

        int[] almiss = new int[]{nums[0], nums[nums.length - 1]};

        int ptr1 = 0;
        int ptr2 = k - 1;
        int counter1 = 0;
        int counter2 = 0;
        int res = 0;

        if (k == 1 && almiss[0] != almiss[1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                
            }
        } else if (almiss[0] == almiss[1] && k != 1 && nums.length == k) {
            return almiss[0];
        } else if (nums.length == k) {
            res = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (res <= nums[i]) {
                    res = nums[i];
                }
            }
            return res;
        }

        for (int i = 0; i < nums.length - k + 1; i++) {
            for (int j = ptr1; j <= ptr2; j++) {
                if (nums[j] == almiss[0]) {
                    counter1++;
                } else if (nums[j] == almiss[1]) {
                    counter2++;
                }
            }
            ptr1++;
            ptr2++;
        }

        if (counter2 == counter1) {
            res = almiss[0] > almiss[1] ? almiss[0] : almiss[1];
        } else {
            if (counter1 == 1) {
                res = almiss[0];
            } else if (counter2 == 1) {
                res = almiss[1];
            } else {
                res = -1;
            }
        }


        return res;


    }


    public static void mergeNew(int[] nums1, int m, int[] nums2, int n) {


        int ptr1 = m - 1;
        int ptr2 = n - 1;

        int ptr3 = nums1.length - 1;


        if (m != 0) {
            for (int i = 0; i <= m - 1; i++) {
                if (nums1[ptr1] > nums2[ptr2]) {
                    nums1[ptr3] = nums1[ptr1];
                    nums1[ptr1--] = nums2[ptr2--];
                } else {
                    nums1[ptr3--] = nums2[ptr2--];
                    ptr1--;
                }
            }
        } else {
            nums1[0] = nums2[0];
        }

        System.out.println(Arrays.toString(nums1));

    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        int temp = 0;
        int length = m - 1;
        int ptr1 = 0;
        int[] dupe = nums1.clone();
        if (nums1.length != 0 && nums2.length != 0) {
            if (m != 0) {
                for (int i = 0; i <= length; i++) {
                    if (dupe[i] <= nums2[j]) {
                        if (dupe[i] != 0) {
                            length++;
                        } else {
                            nums1[i] = nums2[j];
                            j++;
                        }
                    } else {
                        temp = nums1[i];
                        nums1[i] = nums2[j++];
                        nums1[m + ptr1++] = temp;
                    }
                }
            } else {
                nums1[0] = nums2[0];
            }
        }
        System.out.println(Arrays.toString(nums1));

    }


    public static int searchInsert(int[] nums, int target) {

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                if (nums[i] < target) {
                    result = i + 1;
                }
            } else {
                result = i;
            }
        }


        return result;
    }

    static int removeElementfresh(int[] nums, int val) {
        for (int i : nums) {

        }
        return 0;
    }

    public static int removeElement(int[] nums, int val) {

        int j = 0;
//		int[] none = new int[nums.length];
        List<Integer> none = new ArrayList<Integer>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val) {
                none.add(nums[i]);
            }
        }
        nums = new int[none.size()];

        for (int k = 0; k <= none.size() - 1; k++) {
            nums[k] = none.get(k);
        }

        System.out.println(Arrays.toString(nums));

        return j;
    }

    public static boolean increasingTriplet(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + 1 <= nums.length - 1) {
                if (nums[i] < nums[i + 1]) {
                    count++;
                    if (count == 3)
                        return true;
                    if (i + 2 <= nums.length - 1) {
                        if (nums[i + 1] < nums[i + 2]) {
                            if (count == 3)
                                return true;
                        } else {
                            continue;
                        }

                    }
                } else {
                    continue;
                }
            }
        }

        return false;
    }

}
