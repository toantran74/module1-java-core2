package ss5_data_loop;

public class DoiXung {
    public static void main(String[] args) {
        int n = 1200921;
        String str = String.valueOf(n);
        boolean isDoiXung = true;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                System.out.println("not");
                isDoiXung = false;
                break; // toi ưu
            }
        }
        if (isDoiXung) {
            System.out.println("DoiXung");
        }
    }
}
