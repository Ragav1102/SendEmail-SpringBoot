package com.example.SpringEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    public  void sendEmail(String toEmail,
                           String subject,
                           String body){
        SimpleMailMessage message =new SimpleMailMessage();
        message.setFrom("meditrack108@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);

        System.out.println("Mail Sent Successfully....");
    }
}
