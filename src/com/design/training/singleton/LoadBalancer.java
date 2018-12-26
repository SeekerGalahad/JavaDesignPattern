package com.design.training.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Wagic
 * @Description:
 * @Date: 2018-12-26 11:14 by Wagic 创建
 */
public class LoadBalancer {

    private static volatile LoadBalancer loadBalancer = null;

    private static List<String> serverList = null;

    private LoadBalancer() {
        serverList = new ArrayList<String>();
    }

    public void addServer(String server) {
        serverList.add(server);
    }

    public void removeServer(String server) {
        serverList.remove(server);
    }

    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return serverList.get(i);
    }

    public static LoadBalancer getLoadBalancer() {
        if (null == loadBalancer) {
            synchronized (LoadBalancer.class) {
                if (null == loadBalancer) {
                    loadBalancer = new LoadBalancer();
                }
            }
        }
        return loadBalancer;
    }

    /*public static LoadBalancer getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private final static LoadBalancer instance = new LoadBalancer();
    }*/
}
