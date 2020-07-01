package com.open.redis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K, V> {

    private final int CACHE_SIZE;

    public LRUCache(int cacheSize) {
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        System.out.println((int)Math.ceil(cacheSize / 0.75)+1);
        CACHE_SIZE = cacheSize;
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 10000) ? 10000 : n + 1;
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > CACHE_SIZE;
    }


    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        HashMap map = new HashMap();
        map.get("");
        cache.get("");
        for (int i = 0; i <10 ; i++) {
            cache.put(i,i);
        }
        Iterator iterator = cache.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }
        System.out.println(tableSizeFor(4));
    }
}
