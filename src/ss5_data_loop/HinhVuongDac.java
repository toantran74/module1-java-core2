package ss5_data_loop;

public class HinhVuongDac {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){ // i: hang
            for(int j = 1; j <= n; j++){ // j: cot
                if(i == n || i == 1 || j == 1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                //System.out.print("* ");// in ra 25 lần
            }
            System.out.println();
        }
    }
}
