package com.atwj.study;

import org.redisson.api.RLock;
import org.redisson.api.RReadWriteLock;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author: wj
 * @create_time: 2023/5/27 14:58
 * @explain:
 */
@SpringBootTest
public class ReadWriteTest {

    @Resource
    private RedissonClient redissonClient;


    public void test() {
        RReadWriteLock lock = redissonClient.getReadWriteLock("wj");
        RLock rLock = lock.readLock();
        rLock.lock();
        boolean b = rLock.tryLock();
    }

}
