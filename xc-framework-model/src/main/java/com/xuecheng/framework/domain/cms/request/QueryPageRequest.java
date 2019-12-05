package com.xuecheng.framework.domain.cms.request;

import lombok.Data;

/**
 * @auther ZSP
 */
@Data
public class QueryPageRequest {
    //接收页面查询条件
    //站点Id
    private String siteId;
    //页面Id
    private String  pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模板Id
    private String templateId;
}
