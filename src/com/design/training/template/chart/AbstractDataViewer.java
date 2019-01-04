package com.design.training.template.chart;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 09:56 by Wagic 创建
 */
public abstract class AbstractDataViewer {

    /**
     * 获取数据
     */
    public abstract void getData();

    public void convertData() {

    }

    /**
     * 展示数据
     */
    public abstract void displayData();

    public boolean isNotXMLData() {
        return true;
    }

    public void process() {

        getData();

        if (isNotXMLData()) {
            convertData();
        }

        displayData();
    }

}
