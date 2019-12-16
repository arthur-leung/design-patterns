package decorator.io;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class LowerCaseInputStreamTest {

    @Test
    public void testRead() throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("F:\\java\\workspace\\desigen-patten\\src\\test\\java\\decorator\\io\\test.txt")
                )
        );
        while ((c = in.read()) >= 0) {
            System.out.println((char) c);
        }
    }
}