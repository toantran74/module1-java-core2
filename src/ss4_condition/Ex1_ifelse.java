package ss4_condition;

public class Ex1_ifelse {
    public static void main(String[] args) {
        double score = 8;
        if(score < 0 || score > 10){
            System.out.println("ko hop le");
        }
        else if (score < 5) {
            System.out.println("Yeu");
        }
       else if (score < 6.5) {
            System.out.println("TB");
        }
       else if ( score < 8) {
            System.out.println("Kha");
        }
       else {
           System.out.println("Gioi");
        }


    }
}
