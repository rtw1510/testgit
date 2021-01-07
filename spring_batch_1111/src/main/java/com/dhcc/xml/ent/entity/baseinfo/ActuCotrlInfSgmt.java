package com.dhcc.xml.ent.entity.baseinfo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Title: ActuCotrlInfSgmt<br/>
 * Description:实际控制人段 <br/>
 * 
 * @author ChenJingYuan
 * @date 2018年1月25日
 */
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = { "ActuCotrlNm", "ActuCotrlInf", "ActuCotrlInfoUpDate" },namespace = "com.dhcc.xml.ent.entity.baseinfo")
public class ActuCotrlInfSgmt {
	/**
	 * 实际控制人个数[1..1]
	 */
	private String ActuCotrlNm;
	/**
	 * →实际控制人信息[1..99]
	 */
	private List<com.dhcc.xml.ent.entity.baseinfo.ActuCotrlInf> ActuCotrlInf;
	/**
	 * 信息更新日期[1..1]
	 */
	private String ActuCotrlInfoUpDate;

	public ActuCotrlInfSgmt() {
		super();
	}

	/**
	 * 获取 actuCotrlNm
	 * 
	 * @return the actuCotrlNm 实际控制人个数[1..1]
	 */
	public String getActuCotrlNm() {
		return ActuCotrlNm;
	}

	/**
	 * 设置 actuCotrlNm
	 * 
	 * @param actuCotrlNm
	 *            实际控制人个数[1..1]
	 */
	public void setActuCotrlNm(String actuCotrlNm) {
		ActuCotrlNm = actuCotrlNm;
	}

	/**
	 * 获取 actuCotrlInf
	 * 
	 * @return the actuCotrlInf →实际控制人信息[1..99]
	 */
	public List<com.dhcc.xml.ent.entity.baseinfo.ActuCotrlInf> getActuCotrlInf() {
		return ActuCotrlInf;
	}

	/**
	 * 设置 actuCotrlInf
	 * 
	 * @param actuCotrlInf
	 *            →实际控制人信息[1..99]
	 */
	public void setActuCotrlInf(List<com.dhcc.xml.ent.entity.baseinfo.ActuCotrlInf> actuCotrlInf) {
		ActuCotrlInf = actuCotrlInf;
	}

	/**
	 * 获取 actuCotrlInfoUpDate
	 * 
	 * @return the actuCotrlInfoUpDate 信息更新日期[1..1]
	 */
	public String getActuCotrlInfoUpDate() {
		return ActuCotrlInfoUpDate;
	}

	/**
	 * 设置 actuCotrlInfoUpDate
	 * 
	 * @param actuCotrlInfoUpDate
	 *            信息更新日期[1..1]
	 */
	public void setActuCotrlInfoUpDate(String actuCotrlInfoUpDate) {
		ActuCotrlInfoUpDate = actuCotrlInfoUpDate;
	}

	@Override
	public String toString() {
		return "ActuCotrlInfSgmt [ActuCotrlNm=" + ActuCotrlNm
				+ ", ActuCotrlInf=" + ActuCotrlInf + ", ActuCotrlInfoUpDate="
				+ ActuCotrlInfoUpDate + "]";
	}

}
