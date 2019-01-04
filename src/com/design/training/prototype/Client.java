package com.design.training.prototype;

import java.io.IOException;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 11:24 by Wagic  创建
 */
public class Client {

    public static void main(String[] args) {
        WeeklyLog previous, logNew = null;

        previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        previous.setAttachment(attachment);

        try {
            logNew = previous.deepClone();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("周报是否相同？" + previous.equals(logNew));
        System.out.println("附件是否相同?" + previous.getAttachment().equals(logNew.getAttachment()));
    }
}
