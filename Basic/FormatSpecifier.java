package Basic;
public class FormatSpecifier{

    public static void main(String[] args){

        // Variable initialization
        int x = 20 ;
        boolean b = true;
        short t = 123;
        String s = "Practise more and more to prepare you :)";
        char y = 'A';
        float z = 3.5f;
        double d = 5.;
        /*
        *Here we can show our output by using format specifier.
         */
        System.out.printf("int x = %d\n", x);
        System.out.printf("boolean b = %b\n", b);
        System.out.printf("short t = %d\n", t);
        System.out.printf("String s = %s\n", s);
        System.out.printf("char y = %c\n", y);
        System.out.printf("float z = %.1f\n", z);
        System.out.printf("double = %.2f\n", d);
    }
}