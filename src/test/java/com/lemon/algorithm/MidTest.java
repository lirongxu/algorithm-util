package com.lemon.algorithm;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author lemon
 * @Date 2021/4/13
 */
@SpringBootTest
public class MidTest {

    /**
     * 非连续的int数组 查找给定的值
     * 二分查找
     */
    @Test
    public void midTest() {
        int[] arr = {1,4,6,7,9,12,35,67};
        int target = 35;
        int index = midSearch(arr, target);
        System.out.println(String.format("%s在数组中的下标是%s", target, index));
    }

    /**
     * 二分查找算法
     * 1、定义数组左右下标index
     * 2、找到左右下标的中间下标value
     * 3、如果中间值等于目标值就返回
     * 4、如果中间下标小于目标值 就从右边再次二分查找   如果中间下标大于目标值就从左边二分查找
     * @param arr
     * @param target
     * @return
     */
    private int midSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = left + ((right-left)>>>1);
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                left = left + 1;
            } else if (arr[mid] > target) {
                right = right - 1;
            }
        }
        return -1;
    }


}
