package org.npci.upi.urcs.Practise;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaVinci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//		nums1 = [1], m = 1, nums2 = [], n = 0
//		nums1 = [0], m = 0, nums2 = [1], n = 1
//		merge(new int[] {4,5,6,0,0,0}, 3, new int[] {1,2,3}, 3);
		merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);

	}

	public static void mergeNew(int[] nums1, int m, int[] nums2, int n) {

		int ptr1=m-1;
		int 



	}

	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int j=0;
        int temp =0;
    	int length=m-1;
		int ptr1=0;
		int[] dupe = nums1.clone();
		if(nums1.length!=0 && nums2.length!=0 ){
			if(m!=0){
				for(int i=0;i<=length;i++) {
					if(dupe[i] <= nums2[j]) {
						if(dupe[i]!=0) {
							length++;
						}else {
							nums1[i]=nums2[j];
							j++;
						}
					}else {
						temp = nums1[i];
						nums1[i]=nums2[j++];
						nums1[m+ptr1++]=temp;
					}
				}
			}else{
				nums1[0]=nums2[0];
			}
		}
    	System.out.println(Arrays.toString(nums1));
        
    }
	
	
	
	
	
	
	

	public static int searchInsert(int[] nums, int target) {

		int result=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=target) {
				if(nums[i]<target) {
					result=i+1;
				}
			}else {
				result=i;
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
