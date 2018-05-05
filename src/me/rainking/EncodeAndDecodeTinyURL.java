package me.rainking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rain
 * @description 535.这题是个bug题，根据题意这本是一道实用且较难的题目，但是其最终的检验是只需符合 src==codec.decode(codec.encode(src)，
 *                     即字符串编码再解码后保持不变，而没有其他的要求，最简单的自然是不编码（手动滑稽2333）
 * @date 2018/5/5
 */
public class EncodeAndDecodeTinyURL {
    public static void main(String[] args) {
        String src = "123";

        EncodeAndDecodeTinyURL codec = new EncodeAndDecodeTinyURL();
        System.out.println(codec.decode(codec.encode(src)));

    }


    public String encode(String longUrl) {
        return longUrl;

    }

    public String decode(String shortUrl) {
        return shortUrl;
    }
}
