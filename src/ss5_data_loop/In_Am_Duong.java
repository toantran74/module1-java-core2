package ss5_data_loop;

public class In_Am_Duong {
    public static void main(String[] args) {
        int number = 9;
        for (int i = 2; i <= number; i+=2) {
            if (i % 4 == 0) {
                System.out.println(-i + "\t");
            }
                else{
                    System.out.println(i + "\t");
                }
        }
    }
}
