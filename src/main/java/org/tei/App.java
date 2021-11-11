package org.tei;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

public class App {
    public static void main(String[] args) {
        TemplateEngine engine = new TemplateEngine();
        String input = "<input type='text' th:value='${name}'>";
        Context context = new Context();
        context.setVariable("name", "Jack");
        String out = engine.process(input, context);
        System.out.println("out => " + out);
    }
}
