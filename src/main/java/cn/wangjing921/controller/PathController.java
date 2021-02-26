package cn.wangjing921.controller;

import cn.wangjing921.annotation.VisitLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PathController {
    @RequestMapping("/toLogin")
    @VisitLog
    public String toLogin(HttpServletRequest httpServletRequest){
        return "login";
    }
    @RequestMapping("/main")
    public String toMain(){
        return "index";
    }
    @RequestMapping("/top")
    public String top(){
        return "top";
    }
    @RequestMapping("/weather")
    public String weather(){
        return "weather";
    }
    @RequestMapping("/toSendBLog")
    public String sss(){
        return "sendblog";
    }
}
