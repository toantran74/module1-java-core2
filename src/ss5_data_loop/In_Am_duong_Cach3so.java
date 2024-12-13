package ss5_data_loop;

public class In_Am_duong_Cach3so {
    public static void main(String[] args) {
        int number = 15;
        //c1
//        for (int i = 2; i < number; i+=2) {
//            if(i%6==0){
//                System.out.println(-i);
//            }
//            else {
//                System.out.println(i);
//            }
//        }
        //c2
        int count = 0;
        for (int i = 2; i < number; i+=2) {
            count++;
            if(count % 3 == 0) {
                System.out.println(-i);
            }
            else {
                System.out.println(i);
            }
        }

    }
}
