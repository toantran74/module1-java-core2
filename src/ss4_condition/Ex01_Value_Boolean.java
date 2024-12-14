package ss4_condition;

public class Ex01_Value_Boolean {
    public static void main(String[] args) {
        boolean a = true && false;
        boolean b = (3 > 100) || (25 % 5 == 0);
        boolean c = a && b;
        boolean d = !a || b;
        System.out.println(c);//False
        System.out.println(d);//True
    }
}
