package Advanced.Java_SHA256;

import java.util.*;
import java.security.*;
import java.nio.charset.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        assert digest != null;
        byte[] encodedHash = digest.digest(str.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder(encodedHash.length * 2);
        for(byte b: encodedHash)
            sb.append(String.format("%02x", b));

        System.out.println(sb.toString());
    }
}

