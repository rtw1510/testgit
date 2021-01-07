package com.dhcc.xml.per.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "A")//临时标签用于过渡使用
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = {"Document"})
public class PerDocumentList {
	private List<PerDocument> Document;

	public PerDocumentList() {
		super();
	}

	public List<PerDocument> getDocument() {
		return Document;
	}

	public void setDocument(List<PerDocument> document) {
		Document = document;
	}
}
