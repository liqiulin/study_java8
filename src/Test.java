import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RunnableFuture;

/**
 * Created by qiulin on 2016-5-16.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("haha");


        List<String> ss = new ArrayList<>();

        ss = null;
        ss.forEach(System.out::println);


    }

    public static void repeatMessage2(String text, int count) {
        Runnable r = () -> {
            for (int i = 0; i < count; i++){
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }


    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
            while(count>0) {
//                count--;
                System.out.println(text);
            }
        };
        new Thread(r).start();
    }
}
