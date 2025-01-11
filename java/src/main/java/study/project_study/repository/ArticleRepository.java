package study.project_study.repository;

import org.springframework.data.repository.CrudRepository;
import study.project_study.entity.Article;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {

    @Override
    ArrayList<Article> findAll();

}
