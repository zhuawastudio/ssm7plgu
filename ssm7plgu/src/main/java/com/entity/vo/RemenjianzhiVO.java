package com.entity.vo;

import com.entity.RemenjianzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 热门兼职
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-20 14:00:36
 */
public class RemenjianzhiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 总薪资
	 */
	
	private Integer zongxinzi;
		
	/**
	 * 长短期
	 */
	
	private String zhangduanqi;
		
	/**
	 * 工作地点
	 */
	
	private String gongzuodidian;
		
	/**
	 * 工作时间
	 */
	
	private String gongzuoshijian;
		
	/**
	 * 开始时间
	 */
	
	private String kaishishijian;
		
	/**
	 * 工作时长
	 */
	
	private Integer gongzuoshizhang;
		
	/**
	 * 兼职要求
	 */
	
	private String jianzhiyaoqiu;
		
	/**
	 * 兼职介绍
	 */
	
	private String jianzhijieshao;
		
	/**
	 * 商家编号
	 */
	
	private String shangjiabianhao;
		
	/**
	 * 商家名称
	 */
	
	private String shangjiamingcheng;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：总薪资
	 */
	 
	public void setZongxinzi(Integer zongxinzi) {
		this.zongxinzi = zongxinzi;
	}
	
	/**
	 * 获取：总薪资
	 */
	public Integer getZongxinzi() {
		return zongxinzi;
	}
				
	
	/**
	 * 设置：长短期
	 */
	 
	public void setZhangduanqi(String zhangduanqi) {
		this.zhangduanqi = zhangduanqi;
	}
	
	/**
	 * 获取：长短期
	 */
	public String getZhangduanqi() {
		return zhangduanqi;
	}
				
	
	/**
	 * 设置：工作地点
	 */
	 
	public void setGongzuodidian(String gongzuodidian) {
		this.gongzuodidian = gongzuodidian;
	}
	
	/**
	 * 获取：工作地点
	 */
	public String getGongzuodidian() {
		return gongzuodidian;
	}
				
	
	/**
	 * 设置：工作时间
	 */
	 
	public void setGongzuoshijian(String gongzuoshijian) {
		this.gongzuoshijian = gongzuoshijian;
	}
	
	/**
	 * 获取：工作时间
	 */
	public String getGongzuoshijian() {
		return gongzuoshijian;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(String kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public String getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：工作时长
	 */
	 
	public void setGongzuoshizhang(Integer gongzuoshizhang) {
		this.gongzuoshizhang = gongzuoshizhang;
	}
	
	/**
	 * 获取：工作时长
	 */
	public Integer getGongzuoshizhang() {
		return gongzuoshizhang;
	}
				
	
	/**
	 * 设置：兼职要求
	 */
	 
	public void setJianzhiyaoqiu(String jianzhiyaoqiu) {
		this.jianzhiyaoqiu = jianzhiyaoqiu;
	}
	
	/**
	 * 获取：兼职要求
	 */
	public String getJianzhiyaoqiu() {
		return jianzhiyaoqiu;
	}
				
	
	/**
	 * 设置：兼职介绍
	 */
	 
	public void setJianzhijieshao(String jianzhijieshao) {
		this.jianzhijieshao = jianzhijieshao;
	}
	
	/**
	 * 获取：兼职介绍
	 */
	public String getJianzhijieshao() {
		return jianzhijieshao;
	}
				
	
	/**
	 * 设置：商家编号
	 */
	 
	public void setShangjiabianhao(String shangjiabianhao) {
		this.shangjiabianhao = shangjiabianhao;
	}
	
	/**
	 * 获取：商家编号
	 */
	public String getShangjiabianhao() {
		return shangjiabianhao;
	}
				
	
	/**
	 * 设置：商家名称
	 */
	 
	public void setShangjiamingcheng(String shangjiamingcheng) {
		this.shangjiamingcheng = shangjiamingcheng;
	}
	
	/**
	 * 获取：商家名称
	 */
	public String getShangjiamingcheng() {
		return shangjiamingcheng;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
