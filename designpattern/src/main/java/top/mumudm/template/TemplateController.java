package top.mumudm.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("template")
public class TemplateController {


    @Autowired
    TemplateFactory templateFactory;

    @GetMapping("spring/{type}")
    public String execute(@PathVariable String type) {
        templateFactory.getTemplate(type).templateMethod();

        return "success";
    }
}
