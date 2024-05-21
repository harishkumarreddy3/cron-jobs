package com.ideyalabs.test_mail.service;

import com.ideyalabs.test_mail.dto.EmailDetails;
import com.ideyalabs.test_mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface EmailService {

    // Method
    // To send a simple email
    String sendSimpleMail(EmailDetails details);

    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
