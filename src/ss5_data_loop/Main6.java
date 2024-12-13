package ss5_data_loop;

public class Main6 {
    public static void main(String[] args) {
        int n = 20;
        int count = 0;
        int khoancach = 1;
        for (int i = 2; i <= n; i+=2) {
            if(count == khoancach) {
                System.out.println(-i);
                count = 0;
                khoancach ++;
            }
            else {
                System.out.println(i);
                count++;
            }
        }
    }
}
