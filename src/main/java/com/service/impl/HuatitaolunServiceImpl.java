package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuatitaolunDao;
import com.entity.HuatitaolunEntity;
import com.service.HuatitaolunService;
import com.entity.vo.HuatitaolunVO;
import com.entity.view.HuatitaolunView;

@Service("huatitaolunService")
public class HuatitaolunServiceImpl extends ServiceImpl<HuatitaolunDao, HuatitaolunEntity> implements HuatitaolunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuatitaolunEntity> page = this.selectPage(
                new Query<HuatitaolunEntity>(params).getPage(),
                new EntityWrapper<HuatitaolunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuatitaolunEntity> wrapper) {
		  Page<HuatitaolunView> page =new Query<HuatitaolunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuatitaolunVO> selectListVO(Wrapper<HuatitaolunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuatitaolunVO selectVO(Wrapper<HuatitaolunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuatitaolunView> selectListView(Wrapper<HuatitaolunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuatitaolunView selectView(Wrapper<HuatitaolunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
