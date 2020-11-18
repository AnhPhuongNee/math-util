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
// mình muốn kết luận hàm ngon, mình phải test hết các trường hợp xài hàm
// trường hợp 5! 0! -5! .....
// mình phải thiết kế các test case, tình huống test để sau đó mình verify 
// giữa các giá trị trả về có khóp với expected cái mình dự đoán hàm chạy trả về
// và nếu mọi thư skhopws tức là actual==expected mình mới mạnh tay dám gáy hàm ngon
// cách nafuy có nhược điểm phải nhìn bằng mắt so sánh kết quả từng case 

// cách này ổn, nhưng tiềm ẩn nhiều sai sót do nhìn bằng mắt nhiều case
// cách nâng cao 
// cũng nhìn bằng mắt nhưng nhìn chỉ 2 màu xanh và đỏ cho mọi test case
// nếu bạn chạy hàm 100 tham số , chạy hamnf 100 tình huống khác nhau
// bản chỉ cần nhìn duy nhất 2 màu xanh đỏ
// xanh code ổn cho mọi test case mọi tình huống gọi hàm 
// mọi cas ohari có expected= actual thì mới xanh
// đỏ, mọi case màu xanhg chỉ ít nhất 1 thằng đỏ kết liaanj cả đám đỏ 
// hàm đúng cho 99 trường hợp,expected== actual cho mọi 99% tình huống
// chỉ có 1 tình huống sai , không khớp kết luận luôn hàm ko ổn đinhhj
// ai dám xài khi không ổn định , ổn định cà chỉnh xác cho mọi trường hợp

// MUỐN LÀM ĐƯỢC ĐIỀU NAY, CẦN SỰ PHỤ GIÚP CỦA CAC THƯ VIỆN BÊN NGOÀI JDK GỌI LÀ 
// UNIT TEST FRAMEWORK
// CÁC BỘ UNIT TEST NỔI TIẾNG
// bữa nay mình học xanh đỏ qua JUnit
// vẫn với mục tiêu test hàm có ngon không, nhưng chỉ nhìn đúng 2 màu, không care chi tiết các tình huống chạy hàm