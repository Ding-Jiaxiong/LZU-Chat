package com.dingjiaxiong.lzuchat.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ding Jiaxiong
 * @date 2024年8月19日
 */
@SpringBootApplication(scanBasePackages = {"com.dingjiaxiong.lzuchat"})
//@MapperScan({"com.abin.mallchat.common.**.mapper"})
//@ServletComponentScan
public class LzuChatCustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzuChatCustomApplication.class,args);
    }

}