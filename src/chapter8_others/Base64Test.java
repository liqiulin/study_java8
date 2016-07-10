package chapter8_others;

import java.util.Base64;

/**
 * Created by qiulin on 2016-6-24.
 */
public class Base64Test {
    public static void main(String[] args) {
        byte[] encodedbytes = Base64.getEncoder().encode(new byte[]{0x01, 0x02, 0x03});
        System.out.println(encodedbytes);

        Base64.getUrlEncoder();
    }
}
