package com.learn.springbootelastic.controller;

import com.learn.springbootelastic.service.ContentService;
import com.sun.org.apache.xpath.internal.compiler.Keywords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/26 17:36<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@RestController
public class ContentController {
    @Autowired
    private ContentService contentService;

    @GetMapping("/parse/{Keywords}")
    public Boolean parse(@PathVariable("Keywords") String Keywords) throws IOException {
        return contentService.parseContent(Keywords);
    }

    @GetMapping("/search/{Keywords}/{pageNo}/{pageSize}")
    public List<Map<String,Object>> search(@PathVariable("Keywords") String Keywords,
                                           @PathVariable("pageNo") int pageNo ,
                                           @PathVariable("pageSize") int pageSize) throws IOException {
         return contentService.searchPage(Keywords,pageNo,pageSize);
    }
}
