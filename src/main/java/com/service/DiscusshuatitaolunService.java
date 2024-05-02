package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuatitaolunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuatitaolunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuatitaolunView;


/**
 * 话题讨论评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 15:51:13
 */
public interface DiscusshuatitaolunService extends IService<DiscusshuatitaolunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuatitaolunVO> selectListVO(Wrapper<DiscusshuatitaolunEntity> wrapper);
   	
   	DiscusshuatitaolunVO selectVO(@Param("ew") Wrapper<DiscusshuatitaolunEntity> wrapper);
   	
   	List<DiscusshuatitaolunView> selectListView(Wrapper<DiscusshuatitaolunEntity> wrapper);
   	
   	DiscusshuatitaolunView selectView(@Param("ew") Wrapper<DiscusshuatitaolunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuatitaolunEntity> wrapper);
   	
}

