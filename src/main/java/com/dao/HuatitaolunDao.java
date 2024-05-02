package com.dao;

import com.entity.HuatitaolunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuatitaolunVO;
import com.entity.view.HuatitaolunView;


/**
 * 话题讨论
 * 
 * @author 
 * @email 
 * @date 2021-04-19 15:51:12
 */
public interface HuatitaolunDao extends BaseMapper<HuatitaolunEntity> {
	
	List<HuatitaolunVO> selectListVO(@Param("ew") Wrapper<HuatitaolunEntity> wrapper);
	
	HuatitaolunVO selectVO(@Param("ew") Wrapper<HuatitaolunEntity> wrapper);
	
	List<HuatitaolunView> selectListView(@Param("ew") Wrapper<HuatitaolunEntity> wrapper);

	List<HuatitaolunView> selectListView(Pagination page,@Param("ew") Wrapper<HuatitaolunEntity> wrapper);
	
	HuatitaolunView selectView(@Param("ew") Wrapper<HuatitaolunEntity> wrapper);
	
}
