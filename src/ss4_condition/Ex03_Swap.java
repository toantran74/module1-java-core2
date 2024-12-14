package ss4_condition;

public class Ex03_Swap {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        // cach1: ko su dung bien tam
//        a = a + b;
//        b = a - b;
//        a = a - b;
        //c2: sử dụng biến tạm
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
