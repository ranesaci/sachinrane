import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copyFileUsingStream(new File("//home//sachin//workspace//Test//src//sac1.txt"),new File("//home//sachin//workspace//Test//src//sac2.txt"));

	}
	private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
            	System.out.println(buffer);
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

}
