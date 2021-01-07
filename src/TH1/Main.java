package TH1;

import java.io.*;

public class Main {
    private static final String pathFileTo = "/Users/turtle/Documents/Module-2/Day17/src/mandy.jpg";
    private static final String pathFileTo2 = "/Users/turtle/Documents/Module-2/Day17/src/mandy2.jpg";

    public static void main(String[] args) {
        File srcFile = new File(pathFileTo);
        File destFile = new File(pathFileTo2);
        copyFileUsingStream(srcFile, destFile);
    }

    private static void copyFileUsingStream(File source, File dest) {
        try {
            InputStream is = new FileInputStream(source);
            OutputStream os = new FileOutputStream(dest);
            int length;
            byte[] buffer = new byte[1024];
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            System.out.println("Sao Chep Thanh Cong");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
