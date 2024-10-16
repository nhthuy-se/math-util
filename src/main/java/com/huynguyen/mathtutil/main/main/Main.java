package com.huynguyen.mathtutil.main.main;

import com.huynguyen.mathtutil.main.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        testFactorialGivenRightArgument0ReturnsWell();
        testFactorialGivenRightArgument5ReturnsWell();


        //TA SẼ TEST HÀM TA VIẾT RA, GỌI LÀ UNIT TESTING
        //CODE CƠ BẢN NHẤT
        //CẦN TEST HÀM GETFACTORIAL() VỚI CÁC BỘ DATA ĐI VÀO -> NHỮNG TEST CASE
        //NHỮNG BỘ DATA ĐƯA VÀO HÀM VÀO APP, VÀ CÁCH THỨC XÀI
        //                 BỘ DATA NÀY, VÀ KÈM THEO KẾT QUẢ KÌ VỌNG APP/HÀM SẼ TRẢ VỀ
        //TEST CASE SỐ 2
        //DESCRIPTION (MÔ TẢ MỤC ĐÍCH TEST CASE, TEST CASE DÙNG TEST ĐIỀU GÌ?)
        //TO CHECK, TO VERIFY THE getfactorial() method with correct given argument, e.g n = 5
        //STEPS/PROCEDURES: (Các bước test HÀM/APP, nhấn gì nhập gì...)
        //Call getFactorial() method with valid arg: getFactorial(5)

        //Expected Result (Ta hy vọng hàm trả về gì với N = 5)
        // To have number 120 as the result of 5!

        //STATUS (TRẠNG THÁI CỦA TEST CASE LÀ GÌ SAU KHI CHẠY APP CHẠY HÀM)
        // PASSED/FAILED (BUG)
        // CHỜ XEM HÀM, APP XỬ LÝ ĐƯỢC SỐ MẤY - ACTUAL VALUE
        // VÀ ĐI SO SÁNH VỚI EXPECTED Ở TRÊN ĐỂ LUẬN ĐÚNG SAI

        //VIẾT CODE TEST ĐỂ TEST HÀM CHÍNH GETFACTORIAL() CHẠY ĐÚNG VỚI n = 5




    }

    static void testFactorialGivenRightArgument0ReturnsWell() {
        int n = 0;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);

        //so sánh
        System.out.println(n + "! = \n"
                + "expected value: " + expectedResult + "\n"
                + "actual value: " + actualResult);
    }
    static void testFactorialGivenRightArgument5ReturnsWell() {
        int n = 5;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(5);

        System.out.println(n + "! = \n"
                + "expected value: 120 " + expectedResult + "\n"
                + "actual value: " + actualResult);
        }
    }


