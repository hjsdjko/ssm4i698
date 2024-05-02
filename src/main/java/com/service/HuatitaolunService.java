package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuatitaolunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuatitaolunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuatitaolunView;


/**
 * 话题讨论
 *
 * @author 
 * @email 
 * @date 2021-04-19 15:51:12
 */
public interface HuatitaolunService extends IService<HuatitaolunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuatitaolunVO> selectListVO(Wrapper<HuatitaolunEntity> wrapper);
   	
   	HuatitaolunVO selectVO(@Param("ew") Wrapper<HuatitaolunEntity> wrapper);
   	
   	List<HuatitaolunView> selectListView(Wrapper<HuatitaolunEntity> wrapper);
   	
   	HuatitaolunView selectView(@Param("ew") Wrapper<HuatitaolunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuatitaolunEntity> wrapper);
   	
}

