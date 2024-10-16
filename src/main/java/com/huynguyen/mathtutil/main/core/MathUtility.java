package com.huynguyen.mathtutil.main.core;

public class MathUtility {
    //cung cấp các hàm tiện ích cho mọi nơi sử dụng
    public static long getFactorial(int n){
        //hàm tính n!=1.2.3...n
        //< 0! và > 21! ta không tính, không có âm giai thừa. 20! vừa đủ kiểu long
        //0! và 21! ném ra ra ngoại lệ
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20!");

        if (n == 0 || n == 1)
            return 1;

        //n = 2, 3, 4,... 20
        long result = 1; //tích ban đầu =1
        for (int i = 2; i <= n ; i++)
            result *= i;

        return result;

    }
}
