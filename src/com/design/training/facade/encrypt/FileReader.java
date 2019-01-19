package com.design.training.facade.encrypt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-19 15:25 by Wagic 创建
 */
public class FileReader {

    public String read(String fileNameSrc) {
        System.out.println("读取文件，获取明文");

        FileInputStream fs = null;
        StringBuilder sb = new StringBuilder();
        try {
            fs = new FileInputStream(fileNameSrc);
            int len;
            byte[] data = new byte[50];
            while ((len = fs.read(data)) != -1) {
                sb.append(new String(data));
            }
            fs.close();
            System.out.println(sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
