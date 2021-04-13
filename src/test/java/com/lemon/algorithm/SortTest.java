package com.lemon.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.rmi.runtime.Log;

/**
 * @Author lemon
 * @Date 2021/4/13
 */
@Slf4j
@SpringBootTest
public class SortTest {

    /**
     * 给出一个无序的int数组返回一个有序的数组
     */
    @Test
    public void sort(){
        int[] arr = {6,2,7,1,72,4,7};
        log.info("排序后:{}", bubbleSort(arr));
    }

    /**
     * 冒泡排序
     * 下标从左向右一词遍历如果 左边小于右边就交换位置
     * 1、拿到数组最大下标
     * 2、
     * @param arr
     * @return
     */
    private int[] bubbleSort(int[] arr) {
        int maxIndex = arr.length-1;
        for(int i=0; i<maxIndex; i++){
            for(int j=0; j<maxIndex-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 快排
     * @param arr
     * @return
     */
    private int[] fastSort(int[] arr) {


        return null;
    }

    /**
     * 插入排序
     * @param arr
     * @return
     */
    private int[] insertSort(int[] arr) {


        return null;
    }
}
