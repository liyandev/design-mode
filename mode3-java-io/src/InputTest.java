import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
* 设置FileInputStream，
* 先用BufferedInputStream装饰，
* 再用LowerCaseInputStream过滤器装饰
* */
public class InputTest {
    public static void main(String[] args) throws IOException{
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")
                    )
            );
            while ((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
