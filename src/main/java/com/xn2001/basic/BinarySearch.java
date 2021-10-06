package com.xn2001.basic;

/**
 * @author 乐心湖
 * @version 1.0
 * @date 2021/10/2 20:13
 *
 * 二分查找
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {1, 5, 8, 9, 12, 15, 16, 19, 22, 44, 52, 66, 158};
        int i = binarySearch(ints, 66);
        System.out.println(i);
    }

    public static int binarySearch(int[] ints, int t) {
        //左
        int l = 0;
        //右
        int r = ints.length - 1;
        //中间
        int m;
        while (l <= r) {
            //m = (l + r) / 2; 可能内存溢出
            m = (r - l) / 2 + l;
            if (t > ints[m]) {
                l = m + 1;
            } else if (t < ints[m]) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
