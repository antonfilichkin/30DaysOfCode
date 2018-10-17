import java.util.Scanner;

public class regex {

public static void main(String[] args){

            String IP = "266.266.266.266";
            System.out.println(IP.matches(new MyRegex().pattern));
        }

}


class MyRegex {
    String pattern = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";



}

//    12.12.12.12 T
//
//    13.13.13.112 T
//
//    VUUT.12.12 F
//
//    111.111.11.111 T
//
//    1.1.1.1.1.1.1 F
//
//    ..... F
//
//    1...1..1..1 F
//
//    0.0.0.0 T
//
//    255.0.255.0 T
//
//    266.266.266.266 T
//
//    00000.000000.0000000.00001 T
//
//    0023.0012.0012.0034 T

