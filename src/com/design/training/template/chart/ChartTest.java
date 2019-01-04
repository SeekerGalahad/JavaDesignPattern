package com.design.training.template.chart;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 10:03 by Wagic 创建
 */
public class ChartTest {

    public static void main(String[] args) {
        AbstractDataViewer dataViewer = new XMLDataViewer();
        dataViewer.process();

        dataViewer = new JSONDataViewer();
        dataViewer.process();
    }
}
