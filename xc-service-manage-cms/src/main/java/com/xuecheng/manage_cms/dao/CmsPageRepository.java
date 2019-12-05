package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @auther ZSP
 */
//@Repository
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {

    CmsPage findByPageName(String pageName);
}
