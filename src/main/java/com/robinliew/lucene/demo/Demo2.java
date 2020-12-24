package com.robinliew.lucene.demo;

import com.robinliew.lucene.IndexUse;

/**
 * 索引搜索测试
 */
public class Demo2 {

    public static void main(String[] args) {
        String indexDir = "F:\\SoftWare Developer\\lucene\\index";
        String q = "Java";
        try {
            IndexUse.search(indexDir, q);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
