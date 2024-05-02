package com.dao;

import com.entity.DiscusshuatitaolunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuatitaolunVO;
import com.entity.view.DiscusshuatitaolunView;


/**
 * 话题讨论评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 15:51:13
 */
public interface DiscusshuatitaolunDao extends BaseMapper<DiscusshuatitaolunEntity> {
	
	List<DiscusshuatitaolunVO> selectListVO(@Param("ew") Wrapper<DiscusshuatitaolunEntity> wrapper);
	
	DiscusshuatitaolunVO selectVO(@Param("ew") Wrapper<DiscusshuatitaolunEntity> wrapper);
	
	List<DiscusshuatitaolunView> selectListView(@Param("ew") Wrapper<DiscusshuatitaolunEntity> wrapper);

	List<DiscusshuatitaolunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuatitaolunEntity> wrapper);
	
	DiscusshuatitaolunView selectView(@Param("ew") Wrapper<DiscusshuatitaolunEntity> wrapper);
	
}
