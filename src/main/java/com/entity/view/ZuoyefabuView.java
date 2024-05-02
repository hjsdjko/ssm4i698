package com.entity.view;

import com.entity.ZuoyefabuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业发布
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 15:51:12
 */
@TableName("zuoyefabu")
public class ZuoyefabuView  extends ZuoyefabuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyefabuView(){
	}
 
 	public ZuoyefabuView(ZuoyefabuEntity zuoyefabuEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyefabuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
