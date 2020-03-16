import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {

    private static final int INITIAL_SIZE = 10;
    private static int num;


    public static void main(String[] args) {
        System.out.println("HelloWorld!!!");
        ArrayList list = new ArrayList();
        list.add(0, 123);


        System.out.println(list);
        method();
    }

    public static void method() {
        num = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
