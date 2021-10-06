package com.xn2001.basic;

/**
 * @author 乐心湖
 * @version 1.0
 * @date 2021/10/2 20:21
 * <p>
 * 整数溢出
 */
public class IntegerOverflow {
    public static void main(String[] args) {

        int l = 0;
        int r = Integer.MAX_VALUE - 1;
        int m = (l + r) / 2;
        System.out.println(m);

        //此时查找的数在右侧
        l = m + 1;
        m = (l + r) / 2;
        //内存溢出，超过 Integer.MAX_VALUE
        System.out.println(m);

        //解决办法，让右减左即可，r-l 然后凑到跟本来 (l + r) / 2 相等就行。
        //这里就不会再溢出，假设 r 最大，l 为0，最大也不过是 r/2
        m = (r - l) / 2 + l;
        System.out.println(m);
    }
}
