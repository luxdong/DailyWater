package com.oslu.dailywater;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
class DailywaterApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    MailService mailService;

    @Test
    public void sendSimpleTextMailTest() {
        String to = "xxxxxx@qq.com";
        String subject = "Springboot 发送简单文本邮件";
        String content = "<p>第一封 Springboot 简单文本邮件</p>";
        mailService.sendSimpleTextMail(to, subject, content);
    }

}
