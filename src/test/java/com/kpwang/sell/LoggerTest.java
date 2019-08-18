package com.kpwang.sell;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author kpwang
 * @create 2019-08-14 14:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {
   // private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
        String name="kpwang";
        String password="123456";
        log.debug("debug............");
        log.info("info............");
        log.info("name:{},password:{}",name,password);
        log.error("error............");
    }
}
