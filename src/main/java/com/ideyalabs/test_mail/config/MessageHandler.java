package com.ideyalabs.test_mail.config;
import jakarta.mail.MessagingException;
import org.springframework.stereotype.Component;

@Component
public class MessageHandler {

    public void handleMessagingException(MessagingException e) {
        System.out.println("Failed to send email: " + e.getMessage());

    }
}
