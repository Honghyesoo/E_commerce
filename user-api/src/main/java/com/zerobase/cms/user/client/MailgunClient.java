package com.zerobase.cms.user.client;

import com.zerobase.cms.user.client.mailgurn.SendMailForm;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "mailgun",url ="https://api.mailgun.net/v3/" )
@Qualifier("mailgun")
public interface MailgunClient {

    @PostMapping("sandbox6f20522cb81148c8beb1302974a35b0a.mailgun.org/messages")
    Response sendEmail(@SpringQueryMap SendMailForm form);
}
