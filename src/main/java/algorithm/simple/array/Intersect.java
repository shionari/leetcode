package algorithm.simple.array;

import java.util.Collections;

/**
 *
 * 给定两个数组，写一个方法来计算它们的交集。
 *
 * Created by shionari on 2018/5/11
 */
public class Intersect {
    public int[] solution(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return nums1;
        }
        if (nums2.length == 0) {
            return nums2;
        }
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] arr1;
        int[] arr2;
        int[] temp;
        if (length1 > length2) {
            arr1 = nums1;
            arr2 = nums2;
            temp = new int[length2];
        } else {
            arr1 = nums2;
            arr2 = nums1;
            temp = new int[length1];
        }

        for (int i = 0; i < temp.length; i++) {
            temp[i] = -1;
        }
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                // 相等且未匹配
                if (arr1[i] == arr2[j] && temp[j] == -1) {
                    temp[j] = i;
                    count++;
                    break;
                }
                boolean isComplete = true;
                for (int num : temp) {
                    if (num == -1) {
                        isComplete = false;
                        break;
                    }
                }
                if (isComplete) {
                    break;
                }
            }
        }
        int tag = 0;
        int[] result = new int[count];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > -1) {
                result[tag] = arr2[i];
                tag++;
            }
        }
        return result;
    }
}
