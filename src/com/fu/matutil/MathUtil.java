package com.fu.matutil;

//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI 
//KHI TA VIẾT CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ
//..CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {
    
    //n! = 1.2.3...n
    //0! = 1! = 1
    //ko tính giai thừa cho số âm
    //20! là vừa khớp kiểu long
    //21! lố kiểu long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        //hàm dừng liền éo cần return 
                    
        //xuống đây là n = 0..20 òi
        if (n == 0 || n == 1)
            return 1; //dừng ngay khi n đặc biệt
        
        //xuống đến đây, n = 2..20 òi
        //chơi for hoặc đệ quy - recursion 
        //kỹ thuật nhồi con heo đất, ốc bu nhồi thịt
        //i = 2, i = 3, i = 4, i = 5, i = n nhồi liên tục i vào tích 
        long product = 1; //tích khởi đầu bằng 1, nhồi 2 3 4 5 6...n
        for (int i = 2; i <= n; i++) 
            product *= i;
            //product = product * i; //nhồi liên tục product 
        return product; 
                  
    }
    
}
