package com.eric.site;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author WangXingYu
 * @date 2018-01-31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestLog {

    Logger log = LoggerFactory.getLogger(TestLog.class);

    @Test
    public void testLog() {
        log.error("error");
        log.warn("warn");
        log.info("info");
        log.debug("debug");
        log.trace("trace");
    }
}