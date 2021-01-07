package com.dhcc.xml.util;


import java.io.*;

/*
 * 
 * @author jzyy
 * @time 2019-9-11 下午04:21:13 
 * @class FileAdder 
 * @param  strSrc-临时生成的文件 ,dest-要追加的文件
 * @return  返回值
 * Description:将临时文件追加到文件中，并删除临时文件
 */
public class FileAdder {
 
    /**  
     * Title: writeFile<br\>  
     * Description: 文件追加<br\>  
     * @param strSrc
     * @param dest 
     */  
    public static void writeFile(String oldPath, String newPath,String fileHeader) {
    	OutputStreamWriter writer = null;
        InputStreamReader reader = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
 
        try {
            File file = new File(oldPath);
            if (!file.exists()) {
            	System.out.println("文件不存在！！！");
            	return;
            }
             
            // 这里的true，是以追加的方式写
            File newFile = new File(newPath);
            if(newFile.exists()){
	            writer = new OutputStreamWriter(new FileOutputStream(new File(newPath), true),"UTF-8");
	            reader = new InputStreamReader(new FileInputStream(oldPath),"UTF-8");
            }else{
            	writer = new OutputStreamWriter(new FileOutputStream(new File(newPath), true),"UTF-8");
            	writer.write(fileHeader);
 	            reader = new InputStreamReader(new FileInputStream(oldPath),"UTF-8");
            }
            
            String str = null;
            br = new BufferedReader(reader);
            bw = new BufferedWriter(writer);
            System.out.println(oldPath+"开始写入！！！！！！");
            while ((str = br.readLine()) != null) {
                StringBuffer sb = new StringBuffer(str);
                sb.append("\r\n");
                bw.write(sb.toString());
            }
            System.out.println(oldPath+"写入结束！！！！！！");
            br.close();
            reader.close();
 
            bw.close();
            writer.close();
           // 删除临时文件
            if(file.delete()){
               System.out.println("删除临时文件！！！！！！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
    	//FileAdder.writeFile("E:/home/dhcc/zxapp/fileMemory/itp/iscp/G10128210H03112019091011005570.3-1.txt", 
    	//		"E:/home/dhcc/zxapp/fileMemory/itp/iscp/G10128210H03112019091011005570.txt");
    	//System.out.println("thread:33".substring("thread:33".indexOf(":")+1,"thread:33".length()));
    	
    	
    	
    }
}
