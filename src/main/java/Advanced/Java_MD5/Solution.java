package Advanced.Java_MD5;

import java.util.*;
import java.security.*;
import javax.xml.bind.DatatypeConverter;


public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] digest = md.digest();

        System.out.println(DatatypeConverter.printHexBinary(digest).toLowerCase());

        scanner.close();

    }
}

