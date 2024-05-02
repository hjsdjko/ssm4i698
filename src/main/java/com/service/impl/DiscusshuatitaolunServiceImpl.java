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


import com.dao.DiscusshuatitaolunDao;
import com.entity.DiscusshuatitaolunEntity;
import com.service.DiscusshuatitaolunService;
import com.entity.vo.DiscusshuatitaolunVO;
import com.entity.view.DiscusshuatitaolunView;

@Service("discusshuatitaolunService")
public class DiscusshuatitaolunServiceImpl extends ServiceImpl<DiscusshuatitaolunDao, DiscusshuatitaolunEntity> implements DiscusshuatitaolunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuatitaolunEntity> page = this.selectPage(
                new Query<DiscusshuatitaolunEntity>(params).getPage(),
                new EntityWrapper<DiscusshuatitaolunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuatitaolunEntity> wrapper) {
		  Page<DiscusshuatitaolunView> page =new Query<DiscusshuatitaolunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuatitaolunVO> selectListVO(Wrapper<DiscusshuatitaolunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuatitaolunVO selectVO(Wrapper<DiscusshuatitaolunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuatitaolunView> selectListView(Wrapper<DiscusshuatitaolunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuatitaolunView selectView(Wrapper<DiscusshuatitaolunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
