package com.atwj.study;

import org.junit.jupiter.api.Test;
import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author: wj
 * @create_time: 2023/5/26 17:26
 * @explain: 布隆过滤器
 */
@SpringBootTest
public class BloomFilterTest {
    @Resource
    private RedissonClient redissonClient;


    @Test
    void testBloom() {
        RBloomFilter<Object> myBloomFilter = redissonClient.getBloomFilter("myBloomFilter");
        // 初始化布隆过滤器，设置预计插入的元素数量和误差率
//        myBloomFilter.tryInit(7, 0.01);

        // 添加元素到布隆过滤器
//        myBloomFilter.add("item1");
//        myBloomFilter.add("item2");


        // 检查元素是否存在于布隆过滤器

//        Assertions.assertTrue(myBloomFilter.contains("item1"));  // 输出 true
//        Assertions.assertFalse(myBloomFilter.contains("item3"));  // 输出 false
        myBloomFilter.delete();
        // 关闭 Redisson 客户端连接
        redissonClient.shutdown();

    }

    @Test
    void test1() {
        String s = "000000100010000100010000000011000000111000000100001000000010000000100000";
        System.out.println(s.length());
    }


}
