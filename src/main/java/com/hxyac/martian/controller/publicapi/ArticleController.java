package com.hxyac.martian.controller.publicapi;

import com.hxyac.martian.config.Return;
import com.hxyac.martian.utils.JsonData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/public/article")
public class ArticleController {

    @GetMapping("getDetailByuid")
    public JsonData returnArticleDetail(@RequestParam(value = "article_uid",required = true)int articleUid){

        return JsonData.build(Return.SUCCESS_CODE,Return.NULL_DATA,Return.SUCCESS_MSG);
    }
}
