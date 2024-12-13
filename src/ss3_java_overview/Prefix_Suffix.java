package ss3_java_overview;

public class Prefix_Suffix {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        //int a = i++ + j++;
//        System.out.println(a);//2
//        System.out.println(i);//2
//        System.out.println(j);//2
        System.out.println("================");
//        int b = i++ + ++j;
//        System.out.println(b);//3
//        System.out.println(i);//2
//        System.out.println(j);//2
//        int c= ++i + j++;
//        System.out.println(c);//3
//        System.out.println(i);//2
//        System.out.println(j);//2
//        int d = ++i + ++j;
//        System.out.println(d);//4
//      System.out.println(i);//2
//       System.out.println(j);//2
//        int e = i++ + j++ + i++ + j++;
//        System.out.println(e);//1+1+2+2=6
//        System.out.println(i);//3
//        System.out.println(j);//3
//        int g = i++ + ++i - i-- - --i;
//        System.out.println(g);//1 + 3 - 3 -1 = 0
//       System.out.println(i);//1
        int a = 10;
        int h = a+=a++ + ++a;
        System.out.println(h);// 10 + 10 + 12 = 32
        System.out.println(a);// 32




    }
}
