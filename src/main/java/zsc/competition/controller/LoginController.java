package zsc.competition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("/admin")
@Controller
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }



    @RequestMapping(value = "/getvercode", method = RequestMethod.GET)
    public void getVerCode(HttpServletResponse response){
        System.out.println("获取验证码");
    }
}
