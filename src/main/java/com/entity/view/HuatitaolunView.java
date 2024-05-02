package com.entity.view;

import com.entity.HuatitaolunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 话题讨论
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 15:51:12
 */
@TableName("huatitaolun")
public class HuatitaolunView  extends HuatitaolunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuatitaolunView(){
	}
 
 	public HuatitaolunView(HuatitaolunEntity huatitaolunEntity){
 	try {
			BeanUtils.copyProperties(this, huatitaolunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
