package chapter9_jdk7newfeatures;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by qiulin on 2016-7-11.
 */
public class ExceptionTest {

    public static void main(String[] args) {

//        tryWithResourcesTest();

            reflectiveOperationException();


    }

    public static void reflectiveOperationException() {

        // before jdk7
        try {
            Class.forName("chapter9_jdk7newfeatures.ExceptionTest").getMethod("main").invoke(new String[]{"hahah"});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // jdk7 added ReflectiveOperationException
        try {
            Class.forName("test.Hello").getMethod("main").invoke(new String[]{"hahah"});
        } catch (ReflectiveOperationException refException) {
            refException.printStackTrace();
        }
    }

    /**
     * try-with-resources
     */
    public static void tryWithResourcesTest() {
        // try-with-resource
        try (Socket s = new Socket()) {
            s.connect(new InetSocketAddress("172.0.0.1", 8080));
            s.getOutputStream().write("hello, world!".getBytes("UTF-8"));
        } catch (IllegalArgumentException | IOException socketException) {
            System.out.println(socketException);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
