package com.zerobase.cms.user.client.service;

import org.apache.coyote.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class  EmailSendServiceTest {
    @Autowired
    private  EmailSendService emailSendService;
    @Test
    public void EmailTest() {
        Response response = emailSendService.sendEmail();
    }
}