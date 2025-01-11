package study.project_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import study.project_study.dto.ArticleForm;
import study.project_study.entity.Article;
import study.project_study.repository.ArticleRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ArticleController {
    //articles/new 로 매핑하여 -> articles/new 로 응답하게 해보시오

    @Autowired
    private ArticleRepository articleRepository;
    //외부에서 주입 (객체를 하나만 만들기 위해서) - DI



    @GetMapping("articles/new")
    //localhost/articles/new
    public String newArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public  String createArticle(ArticleForm form){
        System.out.println(form.toString());

        //1. Dto 를 Entity로 변환 ( )
        //dto 타입으로 바로 저장이 어려우므로 article 타입으로 변환(이동);
        Article article = form.toEntity();
        System.out.println(article.toString());

        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "redirect:/articles/"+saved.getId(); // articles/4
    }

    //한개의 개시글을 조회
@GetMapping("/articles/{id}")//해당 url 요청 처리 선언
    public String show(@PathVariable Long id, Model model){
    System.out.println("id = " + id);
    //1.id로 데이터를 가져옴
    Article articleEntity = articleRepository.findById(id).orElse(null);
    //2. 가져온 데이터를 모델에 등록!
    model.addAttribute("article", articleEntity);

    //3. 보여줄 페이지 설정
    return "articles/show";

}
//모든 개시글을 조회
@GetMapping("/articles")
    public String index(Model model){
        //1. 모든 Article 을 가져온다.
  //Iterable<Article> articlesIteraable = articleRepository.findAll();
    List<Article> articleEntityList=  articleRepository.findAll();
      //2. 가져온 Article 묶음을 뷰로 전달!
     model.addAttribute("articleList", articleEntityList);
        //3. 뷰페이지를 설정!

    return "articles/index";

}

@GetMapping("/articles/{id}/edit")
    public String edit(@PathVariable Long id, Model model){
        //수정할 데이터 가져오기
       Article articleEntity = articleRepository.findById(id).orElse(null);
        //모델에 데이터 등록
        model.addAttribute("article", articleEntity);
        //뷰페이지 설정
        return "articles/edit";
}

@PostMapping("/articles/update")
    public String update(ArticleForm form){
    System.out.println(form.toString());
    //1. Dto를 entity로 변환
    Article articleEntity = form.toEntity();
    System.out.println(form.toString());
    // 2. 엔티티를 DB로 저장
    //2-1 : DB에서 기존 데이터를 가져옴
   Article target = articleRepository.findById(articleEntity.getId()).orElse(null);
    //2-2 기존 데이터가 있다면 갱신
    if(target != null) {
        articleRepository.save(articleEntity);
    }
    return "redirect:/articles/"+ articleEntity.getId();
}

@GetMapping("/articles/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rttr){
    System.out.println("삭제요청이 들어왔습니다.!!");
    //삭제 대상을 가져옴
    Article target = articleRepository.findById(id).orElse(null);
    System.out.println(target.toString());
    //2.대상을 삭제
    if(target != null){
        articleRepository.delete(target);
        rttr.addFlashAttribute("msg","아이디 :"+id+"번이 삭제되었습니다.");
    }

    return "redirect:/articles";
}





}
