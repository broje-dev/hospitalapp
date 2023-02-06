package com.hospital1.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceimpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String to, String sub, String msg) {
		 // Creating a simple mail message
   SimpleMailMessage mailMessage= new SimpleMailMessage();
// Setting up necessary detail
   mailMessage.setTo(to);
   mailMessage.setSubject(sub);
   mailMessage.setText(msg);
   
   // Sending the mails  
   javaMailSender.send(mailMessage);
   
   
   
	}

}
