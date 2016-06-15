package chapter1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiulin on 2016-6-5.
 */
public class Practice2 {

    public static void main(String[] args) {
        List<File> dictories = getFiles3("E:\\");
        dictories.forEach(System.out::println);
    }

    public static List<File> getFiles(String path) {
        List<File> dictories = new ArrayList<>();
        File f = new File(path);
        File[] files = f.listFiles();
        for(File file : files) {
            if(file.isDirectory()) {
                dictories.add(file);
            }
        }
        return dictories;
    }

    public static List<File> getFiles2(String path) {
        List<File> dictories = new ArrayList<>();
        File f = new File(path);
        File[] files = f.listFiles(new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() ? true : false;
            }
        });

        for(File file: files) {
            dictories.add(file);
        }
        return dictories;
    }

    public static List<File> getFiles3(String path) {
        List<File> dictories = new ArrayList<>();
        File f = new File(path);
        File[] files = f.listFiles(file -> {
            return file.isDirectory() ? true : false;
        });

        for(File file: files) {
            dictories.add(file);
        }
        return dictories;
    }
}
