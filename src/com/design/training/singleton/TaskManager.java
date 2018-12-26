package com.design.training.singleton;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-26 10:53 by Wagic 创建
 */
public class TaskManager {

    private static volatile TaskManager instance = null;

    private TaskManager() {}

    public void displayProcesses() {}

    public void displayServices() {}

    public static TaskManager getInstance() {
        if (null == instance) {
            synchronized (TaskManager.class) {
                if (null == instance) {
                    instance = new TaskManager();
                }
            }
        }
        return instance;
    }

/*    public static TaskManager getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private final static TaskManager instance = new TaskManager();
    }*/
}
