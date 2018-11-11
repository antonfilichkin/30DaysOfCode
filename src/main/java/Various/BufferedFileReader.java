package Various;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Random;

public class BufferedFileReader {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        long startTime;
        long endTime;

        int fileSize = 100_000_000;
        Random random = new Random();

        startTime = System.nanoTime();
        byte[] byteArray = new byte[fileSize];
        for (int i = 0; i < fileSize - 1; i++) {
            byteArray[i] = (byte) random.nextInt(255);
        }
        endTime = System.nanoTime();
        System.out.println("Creating ByteArray in " + ((double) (endTime - startTime) / 1_000_000_000) + "s");


        startTime = System.nanoTime();
        try (FileOutputStream fos = new FileOutputStream(file)) {

            fos.write(byteArray);
        }
        endTime = System.nanoTime();
        System.out.println("Writing to file 10 MB - in " + ((double) (endTime - startTime) / 1_000_000_000) + "s");


        startTime = System.nanoTime();
        byte[] byteArray2 = Files.readAllBytes(file.toPath());
        endTime = System.nanoTime();

        System.out.println("Reading from file readAllByes - in " + ((double) (endTime - startTime) / 1_000_000_000) + "s");
        System.out.println(Arrays.equals(byteArray, byteArray2));

        startTime = System.nanoTime();
        InputStream is = new FileInputStream(file);
        endTime = System.nanoTime();

        System.out.println("Reading from file InputStream - in " + ((double) (endTime - startTime) / 1_000_000_000) + "s");
    }
}