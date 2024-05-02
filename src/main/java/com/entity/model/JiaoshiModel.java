package com.entity.model;

import com.entity.JiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教师
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-19 15:51:12
 */
public class JiaoshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 教师性别
	 */
	
	private String jiaoshixingbie;
		
	/**
	 * 教师职称
	 */
	
	private String jiaoshizhicheng;
		
	/**
	 * 教师电话
	 */
	
	private String jiaoshidianhua;
		
	/**
	 * 教师邮箱
	 */
	
	private String jiaoshiyouxiang;
		
	/**
	 * 教师照片
	 */
	
	private String jiaoshizhaopian;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：教师性别
	 */
	 
	public void setJiaoshixingbie(String jiaoshixingbie) {
		this.jiaoshixingbie = jiaoshixingbie;
	}
	
	/**
	 * 获取：教师性别
	 */
	public String getJiaoshixingbie() {
		return jiaoshixingbie;
	}
				
	
	/**
	 * 设置：教师职称
	 */
	 
	public void setJiaoshizhicheng(String jiaoshizhicheng) {
		this.jiaoshizhicheng = jiaoshizhicheng;
	}
	
	/**
	 * 获取：教师职称
	 */
	public String getJiaoshizhicheng() {
		return jiaoshizhicheng;
	}
				
	
	/**
	 * 设置：教师电话
	 */
	 
	public void setJiaoshidianhua(String jiaoshidianhua) {
		this.jiaoshidianhua = jiaoshidianhua;
	}
	
	/**
	 * 获取：教师电话
	 */
	public String getJiaoshidianhua() {
		return jiaoshidianhua;
	}
				
	
	/**
	 * 设置：教师邮箱
	 */
	 
	public void setJiaoshiyouxiang(String jiaoshiyouxiang) {
		this.jiaoshiyouxiang = jiaoshiyouxiang;
	}
	
	/**
	 * 获取：教师邮箱
	 */
	public String getJiaoshiyouxiang() {
		return jiaoshiyouxiang;
	}
				
	
	/**
	 * 设置：教师照片
	 */
	 
	public void setJiaoshizhaopian(String jiaoshizhaopian) {
		this.jiaoshizhaopian = jiaoshizhaopian;
	}
	
	/**
	 * 获取：教师照片
	 */
	public String getJiaoshizhaopian() {
		return jiaoshizhaopian;
	}
			
}
