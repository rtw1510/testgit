package com.dhcc.xml.ent.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "A")//临时标签用于过渡使用
@XmlAccessorType(value = XmlAccessType.FIELD)
// 访问类型改为字段
@XmlType(propOrder = {"Document"})
public class EntDocumentList {
	private List<EntDocument> Document;

	public EntDocumentList() {
		super();
	}

	public List<EntDocument> getDocument() {
		return Document;
	}

	public void setDocument(List<EntDocument> document) {
		Document = document;
	}
}
