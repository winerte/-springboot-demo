package com.winerte.vo;

import com.winerte.model.Posts;
import com.winerte.model.TermTaxonomy;
import lombok.Data;

import java.util.List;

/**
 * 首页栏目文章列表
 */
@Data
public class IndexTermTaxonomyPostVo {
    private TermTaxonomy termTaxonomy;
    private List<Posts> posts;
}
