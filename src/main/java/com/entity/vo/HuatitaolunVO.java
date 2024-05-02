package com.entity.vo;

import com.entity.HuatitaolunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 话题讨论
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-19 15:51:12
 */
public class HuatitaolunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 话题简介
	 */
	
	private String huatijianjie;
		
	/**
	 * 话题内容
	 */
	
	private String huatineirong;
		
	/**
	 * 发起日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faqiriqi;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：话题简介
	 */
	 
	public void setHuatijianjie(String huatijianjie) {
		this.huatijianjie = huatijianjie;
	}
	
	/**
	 * 获取：话题简介
	 */
	public String getHuatijianjie() {
		return huatijianjie;
	}
				
	
	/**
	 * 设置：话题内容
	 */
	 
	public void setHuatineirong(String huatineirong) {
		this.huatineirong = huatineirong;
	}
	
	/**
	 * 获取：话题内容
	 */
	public String getHuatineirong() {
		return huatineirong;
	}
				
	
	/**
	 * 设置：发起日期
	 */
	 
	public void setFaqiriqi(Date faqiriqi) {
		this.faqiriqi = faqiriqi;
	}
	
	/**
	 * 获取：发起日期
	 */
	public Date getFaqiriqi() {
		return faqiriqi;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
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
			
}
