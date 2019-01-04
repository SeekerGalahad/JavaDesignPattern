package com.design.training.template.chart;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 10:00 by Wagic 创建
 */
public class XMLDataViewer extends AbstractDataViewer {

    @Override
    public void getData() {
        System.out.println("从XML中获取数据");
    }

    @Override
    public void displayData() {
        System.out.println("以柱状图展示数据");
    }

    @Override
    public boolean isNotXMLData() {
        return false;
    }
}
