package com.zerobase.cms.user.client.service;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.client.mailgurn.SendMailForm;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public Response sendEmail(){
        SendMailForm form = SendMailForm.builder()
                .from("zerobase-test.my.com")
                .to("education.rhinokim.gmail.com")
                .subject("Test email from zero base")
                .text("my text")
                .build();
        return mailgunClient.sendEmail(form);
    }
}
