package demo20181220.byte_demo;

import java.nio.charset.Charset;

/**
 * 字符、子节转换；然后计算子节长度
 *  不同编码对应的 中文字符占用的子节数 不一致
 */
public class ByteDemo {

    public static void main(String[] args) {
        String str = "中english / -";
        System.out.println("str length : " + str.length());
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        for (byte b : bytes){
            System.out.print(b + " ");
        }


        System.out.println("");
        System.out.println("bytes length : " + bytes.length);

    }

}
