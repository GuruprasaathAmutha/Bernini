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

//		for (String a : args) {
//			long epochSeconds = Long.valueOf(a.trim());
//			Instant instant = Instant.ofEpochMilli(epochSeconds);
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
//					.withZone(ZoneId.systemDefault());
//			String formattedTimestamp = formatter.format(instant);
//e
//			System.out.println(formattedTimestamp);
//		}

//		System.out.println(removeElement(new int[] { 3, 2, 2, 3 }, 3));

//		System.out.println(searchInsert(new int[] { 3,6,7,8,10}, 5));
		merge(new int[] {4,5,6,0,0,0}, 3, new int[] {1,2,3}, 3);

	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int j=0;
        int temp =0;
    	

		if(nums1.length!=0 && nums2.length!=0 ){

			for(int i=0;i<=m+n-1;i++) {
    		
				if(nums1[i] <= nums2[j]) {
					if(nums1[i]!=0) {
					}else {
						nums1[i]=nums2[j];
						j++;
					}
					
				}else {
                    temp = nums1[i];
					nums1[i]=nums2[j++];
					nums1[i+1]=temp;
					i++;
				}
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
