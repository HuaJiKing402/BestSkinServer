package top.bianstudio.backend.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Encryption {

    /**
     * 字符串sha加密
     * @param string 要加密的字符串
     * @return 加密后的字符串
     */
    public static String SHA256(String string)
    {
        BigInteger sha =null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
            messageDigest.update(string.getBytes());
            sha = new BigInteger(messageDigest.digest());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sha.toString(32);
    }
}
