package study.project_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        System.out.println("컨트롤러에 있는게 실행");
        return "index";
    }
    @GetMapping("/hi") //2. 요청 url -  request
    public String nice(Model model){
        model.addAttribute("username", "준석님!");
        return "greetings";
    }
// 요청이 bye 들어오면 홍길동님 안녕히 가세요! goodbye.mustache연결
    @GetMapping("/bye")
    public String bye(Model model){
        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }
}
