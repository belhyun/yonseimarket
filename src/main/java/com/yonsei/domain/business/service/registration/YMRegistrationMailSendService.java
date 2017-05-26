package com.yonsei.domain.business.service.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/**
 * Created by benny on 2017-03-22.
 */
@Service
public class YMRegistrationMailSendService {

    private static final String EMAIL_SIMPLE_TEMPLATE_NAME = "html/email-simple";

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private TemplateEngine emailTemplateEngine;

    public void sendMail() {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("belhyun@gmail.com");
        mail.setFrom("belhyun@gmail.com");
        mail.setSubject("Test");
        mail.setText("Test");
        mailSender.send(mail);
    }

    public void sendSimpleMail(final String recipientName, final String recipientEmail, final Locale locale) throws MessagingException {

        // Prepare the evaluation context
        final Context ctx = new Context(locale);
        ctx.setVariable("name", recipientName);
        ctx.setVariable("subscriptionDate", new Date());
        ctx.setVariable("hobbies", Arrays.asList("Cinema", "Sports", "Music"));

        // Prepare message using a Spring helper
        final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
        final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
        message.setSubject("Example HTML email (simple)");
        message.setFrom("thymeleaf@example.com");
        message.setTo(recipientEmail);

        // Create the HTML body using Thymeleaf
        final String htmlContent = this.emailTemplateEngine.process(EMAIL_SIMPLE_TEMPLATE_NAME, ctx);
        message.setText(htmlContent, true /* isHtml */);

        // Send email
        this.mailSender.send(mimeMessage);
    }
}
