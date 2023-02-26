package com.example.Web_App;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Icon_Controller {
    @RequestMapping("/home")
    public String web_page() {
        return "web_page.html";
    }

    @RequestMapping("/addprogrammer")
    public ModelAndView add_programmer(@RequestParam int pid, @RequestParam String pname, @RequestParam String plan) {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("info.html");
        mv.addObject("pname", pname);
        mv.addObject("pid", pid);
        mv.addObject("plan", plan);
        return mv;

    }
}