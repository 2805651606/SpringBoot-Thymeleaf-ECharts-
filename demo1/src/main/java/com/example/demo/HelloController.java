package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String Hello(){
        return "index";
    }
    @RequestMapping("/demo")
    public String myDemo(){

        return "demo";
    }
    @RequestMapping("/echarts")
    public String myECharts(Model model){

        String skirt = "裙子";
        int nums = 30;
        model.addAttribute("skirt", skirt);
        model.addAttribute("nums", nums);
        return "echarts";
    }
    @RequestMapping("/echarts1")
    public String myECharts1(Model model){

        String skirt = "裙子";
        int nums = 30;
        model.addAttribute("skirt", skirt);
        model.addAttribute("nums", nums);
        return "echarts1";
    }

}
