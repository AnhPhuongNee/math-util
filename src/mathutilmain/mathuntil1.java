/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutilmain;

import phuong.util.Mathutility;

/**
 *
 * @author AlvinTu
 */
public class mathuntil1 {

    public static void main(String[] args) {
        long expected = 120;
        long actual = Mathutility.getFactorial(5);
        //in ra kieemr tra su khop nhau gia cai ta muon va cais ta lam
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);

        //tiếp tục cho các tình huống 6! 7! ......
        //             các tình huống cần phải test ta gọi là test cases
        // về lý thuyết ta phải test trước hết các tình huống.....
        System.out.println("6!: 720, actual:" + Mathutility.getFactorial(6));
        System.out.println("0!: 1, actual:" + Mathutility.getFactorial(1));

        System.out.println("expected:  IllegalArgumentException: " + Mathutility.getFactorial(-5));   
        //tao kì vọng mày ném về ngoại lệ, phải là ngoại lệ
        System.out.println("chuc cuoi tuan vui ve");

    }
}
