package ss4_condition;

public class Ex4_Swap {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println("=================");
        swap(a, b);
        // cach2: ko su dung bien tam
        a = a + b;
        b = a - b;
        a = a - b;
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
