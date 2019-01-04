package com.design.training.prototype.document;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wagic
 * @Description:
 * @Date: 2019-01-04 14:10 by Wagic 创建
 */
public class PrototypeManager {

    private Map<String, OfficialDocument> prototypeMap = new HashMap<>();

    public void addDocument(String key, OfficialDocument document) {
        prototypeMap.put(key, document);
    }

    public synchronized OfficialDocument getDocument(String key) {
        return prototypeMap.get(key).clone();
    }

    private PrototypeManager() {}

    private static class Holder {
        static PrototypeManager prototypeManager = new PrototypeManager();
    }

    public static PrototypeManager getPrototypeManager() {
        return Holder.prototypeManager;
    }
}
