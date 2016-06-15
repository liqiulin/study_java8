package chapter2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by qiulin on 2016-6-5.
 */
public class CountWolds {

    public static  void main(String[] args) {
        String content = getContent("E://test.txt");
        List<String> wolds = Arrays.asList(content.split("[\\P{L}]+"));

        long count = 0;
        for(String s : wolds) {
            if(s.length()>2) {
                count++;
            }
        }
        System.out.println(count);

        count = wolds.stream().filter(w -> w.length() > 2).count();
        System.out.println(count);


        Stream<String> woldsStream = Stream.of(content.split("[\\P{L}]+"));
        count = woldsStream.filter(w -> w.length() > 2).count();
        System.out.println(count);
    }

    static public String getContent(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.out.println(e);
        }
        return content;
    }


}
