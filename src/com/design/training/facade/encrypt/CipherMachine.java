package com.design.training.facade.encrypt;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-19 15:32 by Wagic 创建
 */
public class CipherMachine {

    public String encrypt(String plainText) {
        System.out.println("数据加密，将明文转换成密文");

        StringBuilder es = new StringBuilder();

        char[] chars = plainText.toCharArray();
        for (char charCell : chars) {
            String c = String.valueOf(charCell % 7);
            es.append(c);
        }

        System.out.println(es.toString());
        return es.toString();
    }
}
