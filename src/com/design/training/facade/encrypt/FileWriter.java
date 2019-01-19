package com.design.training.facade.encrypt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-19 15:25 by Wagic 创建
 */
public class FileWriter {

    public void write(String encryptStr,String fileNameDes) {
        System.out.println("保存密文，写入文件");

        FileOutputStream fo = null;
        StringBuilder sb = new StringBuilder();
        try {
            fo = new FileOutputStream(fileNameDes);
            fo.write(encryptStr.getBytes());
            fo.flush();
            fo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
