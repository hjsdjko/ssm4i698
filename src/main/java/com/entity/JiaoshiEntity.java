package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教师
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 15:51:12
 */
@TableName("jiaoshi")
public class JiaoshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshiEntity() {
		
	}
	
	public JiaoshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
