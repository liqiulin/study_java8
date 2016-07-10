package chapter8_others;

/**
 * Created by qiulin on 2016-6-24.
 */
public class NumberTest {
    public static void main(String[] args) {
        System.out.println(Integer.SIZE);
        System.out.println(Double.SIZE);
        System.out.println(Float.SIZE);

        int x = Integer.sum(10, 11);
        System.out.println(x);

        int i = -128;
        byte b = -128;
        System.out.println(Byte.toUnsignedInt(b));;


        Boolean.logicalAnd(true, false);
        Boolean.logicalOr(true, false);
        Boolean.logicalXor(true, false);


    }
}
