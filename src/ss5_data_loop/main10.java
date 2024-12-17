package ss5_data_loop;

public class main10 {
    public static void main(String[] args) {
        int x = 118;
        String binary = "";
        while (x > 0) {
            binary = x % 2 + binary;
            x = x / 2;
        }
        System.out.println(binary);
    }
}
