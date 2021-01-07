package com.dhcc.xml.util;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.util.List;

/**
 * TODO
 *
 * @Author chenjingyuan
 * @date 2020/11/16 20:44
 */
public class Dom4jUtil {
    public static Element getRootElement(String xml) throws Exception{
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(new ByteArrayInputStream(xml.getBytes("UTF-8")));
        Element root = document.getRootElement();
        return root;
    }
    /**
     * 从指定节点开始,递归遍历所有子节点
     * @author chenleixing
     */
    public static List<String> getParentNodes(Element node,String nodeName,List<String> lists){
        String parentNodeName = "";
        //递归遍历当前节点所有的子节点
        List<Element> listElement=node.elements();//所有一级子节点的list
        for(Element element:listElement){//遍历所有一级子节点
            if(nodeName.equals(element.getName())){
                parentNodeName = node.getName();
                lists.add(parentNodeName);
                return lists;//获取父类标签
            }
            getParentNodes(element,nodeName,lists);//递归
        }
        return lists;
    }
}
