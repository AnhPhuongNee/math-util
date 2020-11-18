/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuong.util.test;

import static phuong.util.Mathutility.*;
// chỉ có từ JDK5?, hàm static gọi mà hong cần tên class chấm 
// do mình đã chơi trò khai báo sẵn tên claas và tên hàm static qua lệnh
// import static
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author AlvinTu
 */
public class MathUtilityTest {
    // viết ra những tình huống xài hàm getFactorial()
    // kiểm tra xem actual==expected hay không?? như truyền thống bên main()
    // nhưng ở đây xịn sò hơn, show ra Xanh Đỏ
    // ngoài ra nó còn dùng cho việc CI = Continuous Delivery
    //                               CT = Continuous Test
    //                               DevOps= Development & Operation
    // ngoài doanh nghiệp đang xài 
    // app liên tục đc kiểm tra chất lượng code, build ra file .jar .war
    // đảy lên 1 server trung gian - Staging Environment để cho nhóm test
    // sẵn sàng test kĩ
    // sau đó có thể đẩy thẳng lên PRODUCTION SERVER, máy chạy thật ở nơi khách hàng
    // mọi việc sẽ bắt đầu kể từ lúc Developer push code lên GitHub
    
    @Test // từ khóa này tương đương biến hàm này thành public static void main()\
    // trong hàm này mình sẽ show ra màu xanh dỏ dựa trên sự khóp nhau của expected và actual qua hàm asserEquals()... mà thư viện cung cấp
    // asser...() đủ các loại assert trên đời, assert(v) so sánh
    // thay vò sao sánh banwfh mắt, ta nhờ hàm so sánh giùm, thảy về màu giùm ta
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120,getFactorial(5));
        assertEquals(24,getFactorial(4));
        assertEquals(720,getFactorial(6));
        assertEquals(1,getFactorial(0));
        assertEquals(0,getFactorial(0));
                // hãy tính dùm tui 5! coi nó có là 120 hong?
        // có thì báo xanh, không thì báo đỏ 
    }
}
