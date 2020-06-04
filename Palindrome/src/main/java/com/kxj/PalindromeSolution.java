package com.kxj;

/**
 * @author xiangjin.kong
 * @date 2020/6/4 19:20
 * @desc 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 */
public class PalindromeSolution {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(123);
//        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        for (int i = 0; i < str.length(); i++) {
            int temp = x % (str.length() * 10);
            System.out.println(x + " " + temp);
            x = x / 10;
        }

        return true;
    }

}
