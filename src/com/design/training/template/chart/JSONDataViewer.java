package com.design.training.template.chart;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 10:05 by Wagic 创建
 */
public class JSONDataViewer extends AbstractDataViewer {
    /**
     * 获取数据
     */
    @Override
    public void getData() {
        System.out.println("获取json数据");
    }

    /**
     * 展示数据
     */
    @Override
    public void displayData() {
        System.out.println("以折线图展示数据");
    }

    @Override
    public void convertData() {
        System.out.println("转换json数据");
    }
}
