package spring.rest.qjuery.demo.web.vew;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping
    public ModelAndView modelAndView(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
