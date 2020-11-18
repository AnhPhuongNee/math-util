/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuong.util;

/**
 *
 * @author AlvinTu
 */
public class Mathutility {
    //làm bộ thư viện fake giống y chang math
    //Math.pi, .abs(), .pow(a,b) a^b
    //phàm là thu viện thi phải xài static khi không cần lưu info cho riêng mình
    //còn thư viện mà vẫn cần lưu info riêng thì vẫn non-static như thường  

    public static final double PI = 3.1215;

    // tiện ích tính giai thừ n!=1,2,3,4,..........n
    //n phải là từ 0 trở lên
    //0! = 1!=1
    //âm gia thừa vô nghĩa
    //giai thừ tnawg cục nhanh,21! long ko chứa được
    // bài này mình sẽ chặn giai thừ từ 0..21
    //âm hoặc 21 chửi, không thèm tính
//        public static long getFactorial(int n) {
//            if (n < 0 || n > 20) {
//                throw new IllegalArgumentException("n must be between 0...20");
//            }
//            if (n == 0 || n == 1) {
//                return 1; // đặt biệt , return luôn
//            }        // đứa nào viết else ở đây, trừ điểm 
//             mặc nhiên ở đây hiểu rằng n= 2..20
//            long result = 1;
//            for (int i = 2; i <= n; i++) {
//                result *= i;
//            }
//            return result;
//        }
    public static long getFactorial(int n){
        if(n<0 || n>20)
                throw new IllegalArgumentException("n must be between 0..20");
        if(n == 0 || n == 1)
            return 1;// dk dừng
        return n * getFactorial(n - 1);// đây là đệ quy
        // gọi lại chính hàm của mình với quy mô khac, n-1
        // đi mãi sẽ về 1
    }
    //5! = 5*4!
    // đệ quy là gọi lại mình với quy mô nhỏ hơn
    // kết luận: n!=n*(n-1)!
    // phải có khái niệm dừng ko thì lặp vô tận
    
}