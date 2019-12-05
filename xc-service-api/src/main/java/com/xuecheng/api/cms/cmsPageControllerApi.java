package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @auther ZSP
 */
public interface cmsPageControllerApi {
    //页面查询
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
