package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @auther ZSP
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    CmsPageRepository cmsPageRepository;

    /**
     * 查询全部测试
     */
    @Test
    public void testFindAll(){
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println(all);
    }

    @Test
    public void testFindPages(){
        Pageable pageable = PageRequest.of(0, 10);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        System.out.println(all);
    }

    @Test
    public void test(){
        CmsPage pageName = cmsPageRepository.findByPageName("test01");
        System.out.println(pageName);
    }

    @Test
    public void TestUpdate(){
        Optional<CmsPage> optional = cmsPageRepository.findById("5af942190e661827d8e2f5e4");
        if(optional.isPresent()){
            CmsPage cmsPage = optional.get();
            cmsPage.setDataUrl("www.airbash.cn");
            CmsPage save = cmsPageRepository.save(cmsPage);
            System.out.println(save);
        }else{
            System.out.println("修改失败,文件不存在");
        }
    }

}
