package com.fu.matutil;

public class MathUtilLive {

    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5); //hàm tính đi coi là mấy
        
        System.out.println("5! = 120; actual: " + result);
        
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        
        System.out.println("0! = 1 ;actual: " + MathUtil.getFactorial(0));
      
        
        //MathUtil.getFactorial(-5); ném ngoại lệ thật rồi, ai biểu đwua cà chớn
        
        //kỹ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        //expected value: 5! = 120
        //if expected == actual, hàm ngon trong tình huống này
        
    }
    
}
