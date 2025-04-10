package hyd.lucifer.practise;

import hyd.lucifer.builders.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class DaVinci {

    private static final Logger log = LoggerFactory.getLogger(DaVinci.class);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		mergeNew(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);  [3,9,7,2,1,7], k = 4
//        System.out.println(largestIntegerSlidingWindow(new int[]{3, 9, 2, 1, 7}, 3));
//        System.out.println(largestIntegerSlidingWindow(new int[]{3, 9, 7, 2, 1, 7}, 4));
//        System.out.println(largestIntegerSlidingWindow(new int[]{0, 0}, 2));
//        System.out.println(largestIntegerSlidingWindow(new int[]{6, 4, 5, 2, 11, 2, 9, 1, 0}, 7));
//        System.out.println(largestInteger(new int[]{4, 4, 2, 2, 2, 0, 5, 3, 4, 4}, 3));
//        System.out.println(largestInteger(new int[]{7, 5, 9, 10, 0, 12, 3, 12, 10}, 1));
////        System.out.println(largestInteger(new int[]{7, 11, 7, 7}, 1));
//        System.out.println(getRow(1));
//        System.out.println(getRow(2));
//        System.out.println(getRow(3));
//        System.out.println(getRow(4));
//        System.out.println(getRow(5));
//        System.out.println(getRow(6));
//        System.out.println(getRow(7));
//        System.out.println(getRow(8));
//        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 2,}));
//        System.out.println(majorityElement(new int[]{3, 2, 3}));
//        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
//        System.out.println(containsDuplicateII(new int[]{1, 0, 1, 1}, 1));
//        summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}).forEach(System.out::println);
//        System.out.println(missingnumberoptimal(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
//        Arrays.stream(moveZeroes(new int[]{0})).forEach(System.out::println);
//        System.out.println(removeDigit("1231", '1'));
//        System.out.println(minJumps(new int[]{9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1}));
//        System.out.println(minJumps(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
//        System.out.println(minJumps(new int[]{1, 4, 3, 2, 6, 7}));
//        System.out.println(minJumps(new int[]{0, 10, 20})); 4,9,5], nums2 = [9,4,9,8,4]
//        System.out.println(Arrays.toString(intersectionOne(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
//        System.out.println(Arrays.toString(intersectionOne(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));

//        System.out.println(thirdMaxNew(new int[]{3, 2, 1}));
//        System.out.println(thirdMax(new int[]{1, 2}));
//        System.out.println(thirdMaxNew(new int[]{2, 2, 3, 1}));
//        System.out.println(thirdMaxNew(new int[]{5, 2, 2}));
//        System.out.println(thirdMaxNew(new int[]{1, 2, 2, 5, 3, 5}));
//        System.out.println(1 / 3);
//        System.out.println(6 % 3);
//         g = [1,2,3], s = [1,1]
//         g = [1,2], s = [1,2,3]
//        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
//        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
//        System.out.println(findContentChildren(new int[]{10, 9, 8, 7, 10, 9, 8, 7}, new int[]{10, 9, 8, 7}));

        Person p = new Person.PersonBuilder().setFirstname("Guruprasaath").setPhoneNumber("6379923836").getPerson();
        System.out.println(p.toString());
    }


    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0;
        int si = 0;
        Set<Integer> slist = Arrays.stream(s).boxed().collect(Collectors.toSet());
        for (int i = 0; i < g.length; i++) {
            if (s[i] >= s[i]) {

            }
        }
        return count;
    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<Integer>();
        Set<Integer> nm = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        for (int i = 1; i <= nm.size(); i++) {
            if (!nm.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }

    public static int thirdMaxNew(int[] nums) {
        Stack<Integer> s = new Stack<>();
        Arrays.sort(nums);
        for (int i = nums.length - 1; i <= 0; i++) {
            if (!s.contains(nums[i])) {
                s.add(nums[i]);
            }
        }
        if (s.size() == 3) {
            int count = 1;
            for (Integer i : s) {
                if (count == 3) {
                    return i;
                }
                count++;
            }
        } else {
            int max = 0;
            int size = s.size();
            for (int i = 0; i <= size - 1; i++) {
                max = Math.max(max, s.pop());
            }
            return max;
        }
        return s.pop();
    }

    public static int thirdMax(int[] nums) {
        int ptr = 0;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (ptr == 2 && !s.contains(nums[i])) {
                return nums[i];
            }
            if (!s.contains(nums[i])) {
                s.add(nums[i]);
                ptr++;
            } else {
//                ptr--;
            }
        }
        return s.pop();
    }


    // Try to refactor this!
    public static int[] intersectionOne(int[] nums1, int[] nums2) {
        Set<Integer> numsone = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        Set<Integer> numstwo = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        List<Integer> res = new ArrayList<>();
        if (numsone.size() > numstwo.size()) {
            for (int i : numstwo) {
                if (numsone.contains(i)) {
                    res.add(i);
                }
            }
        } else {
            for (int i : numsone) {
                if (numstwo.contains(i)) {
                    res.add(i);
                }
            }
        }
        int[] rs = new int[res.size()];
        for (int i = 0; i <= res.size() - 1; i++) {
            rs[i] = res.get(i);
        }
        return rs;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ptr1 = 0;
        int ptr2 = 0;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i <= (Math.min(nums1.length, nums2.length)) - 1; i++) {
            if (nums1[ptr1] <= nums2[ptr2]) {
                if (nums1[ptr1] == nums2[ptr2]) {
                    if (!s.contains(nums1[ptr1])) {
                        s.add(nums1[ptr1]);
                    }
                    ptr1++;
                    ptr2++;
                } else {
                    ptr1++;
                }
            } else {
                i = i - 1;
                ptr2++;
            }
        }
        int size = s.size();
        int[] result = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            result[i] = s.pop();
        }

        return result;
    }


    static int minJumps(int[] arr) {
        int ptr1 = 0;
        int ptr2 = arr[0];
        int jumps = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (ptr2 != 0) {
                if (ptr1 + ptr2 >= arr.length - 1) {
                    return ++jumps;
                } else {
                    ptr1 = ptr1 + ptr2;
                    ptr2 = arr[ptr1];
                    jumps++;
                }
            } else {
                return -1;
            }
        }
        return 0;
    }


    public static String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder();
        char[] n = number.toCharArray();
        for (int i = 0; i <= n.length - 1; i++) {
            if (n[i] != digit) {

            } else {

            }
        }
        return sb.toString();
    }


    public static int[] moveZeroes(int[] nums) {
        int ptr1 = -1;
        int ptr2 = -1;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 0) {
                if (i == 0) {
                    ptr1 = i;
                    ptr2 = i + 1;
                } else if (nums[i - 1] == 0) {
                    ptr2++;
                } else {
                    ptr1 = i;
                    ptr2 = i + 1;
                }
            } else {
                if (ptr1 != -1 && ptr2 != -1) {
                    nums[ptr1] = nums[ptr2];
                    nums[ptr2] = 0;
                    ptr1++;
                    ptr2 = i + 1;
                }
            }
        }
        return nums;
    }

    public static int missingnumberoptimal(int[] nums) {
        int n = nums.length;
        int x1 = 0, x2 = 0;
        for (int i = 1; i <= n; i++) {
            x1 ^= i;
            x2 ^= nums[i - 1];
        }
        return x1 ^ x2;
    }


    public static int missingNumber(int[] nums) {
        Set<Integer> n = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int i = 1; i <= nums.length; i++) {
            if (n.contains(i)) {
                n.remove(i);
            } else {
                return i;
            }
        }
        return 0;
    }

    public static List<String> summaryRanges(int[] nums) {
        StringBuffer s;
        List<String> res = new ArrayList<>();
        int ptr1 = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (i != nums.length - 1) {
                if (nums[i] + 1 != nums[i + 1]) {
                    if (i != ptr1) {
                        s = new StringBuffer();
                        s.append(nums[ptr1]);
                        s.append("->");
                        s.append(nums[i]);
                        res.add(s.toString());
                        ptr1 = i + 1;
                    } else {
                        s = new StringBuffer();
                        s.append(nums[ptr1]);
                        res.add(s.toString());
                        ptr1 = i + 1;
                    }
                }
            } else {
                if (i != ptr1) {
                    if (nums[i] - 1 != nums[i - 1]) {
                        s = new StringBuffer();
                        s.append(nums[i]);
                        res.add(s.toString());
                    } else {
                        s = new StringBuffer();
                        s.append(nums[ptr1]);
                        s.append("->");
                        s.append(nums[i]);
                        res.add(s.toString());
                    }
                } else {
                    s = new StringBuffer();
                    s.append(nums[i]);
                    res.add(s.toString());
                }
            }
        }
        return res;
    }

    public static boolean containsDuplicateII(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (!res.containsKey(nums[i])) {
                res.put(nums[i], i);
            } else {
                if (Math.abs(res.get(nums[i]) - i) <= k) {
                    return true;
                }
                res.put(nums[i], i);
            }
        }
        return false;
    }


    public static int majorityElement(int[] nums) {
        int target = nums.length / 2;
        int res = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (!count.containsKey(nums[i])) {
                count.put(nums[i], 1);
            } else {
                count.put(nums[i], count.get(nums[i]) + 1);
            }
        }
//        System.out.println(target);
        for (int i : count.keySet()) {
            if (count.get(i) > target) {
                res = i;
            }
        }
        return res;
    }


    public int singleNumber(int[] nums) {
        Stack<Integer> res = new Stack<>();
        for (int i : nums) {
            if (!res.contains(i)) {
                res.add(i);
            } else {
                res.removeElement(i);
            }
        }
        return res.pop();
    }

    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[buy] > prices[sell]) {
                buy = sell;
                sell = sell + 1;
            } else {
                if (prices[sell] - prices[buy] > profit) {
                    profit = prices[sell] - prices[buy];
                    sell++;
                } else {
                    sell++;
                }
            }
        }
        return profit;
    }


    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long val = 1;
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            val = val * (rowIndex - i + 1) / i;
            res.add((int) val);
        }
        return res;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<Integer> inner;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= numRows - 1; i++) {
            inner = new ArrayList<>();
            inner.add(1);
            for (int j = 1; j < i; j++) {
                inner.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            if (i >= 1) {
                inner.add(1);
            }
            result.add(inner);
        }
        return result;
    }

    public static int largestIntegerSlidingWindow(int[] nums, int k) {
        int sus = nums[0];
        int ptr1 = 0;
        int ptr2 = k - 1;
        Stack<Integer> result = new Stack<>();
        List<Integer> dupe = new ArrayList<>();
        for (int i = 0; i < nums.length - k + 1; i++) {
            for (int j = ptr1; j <= ptr2; j++) {
                if (sus <= nums[j]) {
                    if (!result.contains(nums[j]) || k == nums.length) {
                        result.push(nums[j]);
                        sus = nums[j];

                    } else {
                        dupe.add(nums[j]);
                        result.removeElement(nums[j]);
                        sus = result.isEmpty() ? -1 : result.peek();
                    }
                }
            }
            ptr1++;
            ptr2++;
        }
        for (int d : dupe) {
            result.removeElement(d);
        }
        return result.isEmpty() ? -1 : result.pop();
    }


    public static int largestInteger(int[] nums, int k) {

        int[] almiss = new int[]{nums[0], nums[nums.length - 1]};

        int ptr1 = 0;
        int ptr2 = k - 1;
        int counter1 = 0;
        int counter2 = 0;
        int res = 0;

        if (k == 1) {
            Stack<Integer> resStack = new Stack<>();
            res = nums[0];
            for (int i = 0; i <= nums.length - 1; i++) {
                if (res < nums[i]) {
                    if (!resStack.contains(nums[i])) {
                        resStack.push(nums[i]);
                    } else {
                        resStack.removeElement(nums[i]);
                    }

                }
            }
            return resStack.pop();
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
