package com.yonsei.configuration.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * Created by benny on 2017-03-27.
 */
@Service
public class YMMailContentBuilder {

    private TemplateEngine templateEngine;

    @Autowired
    public YMMailContentBuilder(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String build(String message, String templateName) {
        Context context = new Context();
        context.setVariable("message", message);
        return templateEngine.process("email/" + templateName, context);
    }
}
