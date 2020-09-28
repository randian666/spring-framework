package com.spring.xun.demo;

/**
 * @author xun2.liu
 * @title: MessageServiceImpl
 * @projectName spring
 * @description: TODO
 * @date 2020/9/25 16:18
 */
public class MessageServiceImpl  implements MessageService {
    @Override
    public String getMessage() {
        return "hello spring";
    }
}
