package com.dhcc.client.collt.service;

import com.dhcc.client.collt.entity.EncodeResults;
import com.dhcc.client.collt.entity.VerifyResults;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**  
  * Title: CollectValidateBo<br/>  
  * Description: 校验程序对外发布接口<br/>  
  * @author ChenJingYuan  
  * @date 2019-2-18  
  */  
public interface ValidateCollectService extends Remote{
	/**  
	 * Title: Verify<br\>  
	 * Description: 报文预校验、加压、加密<br\>  
	 * feedbackDir校验文件存、
	 */  
	public VerifyResults Verify(String feedbackDir, String filename) throws RemoteException;
	/**  
	 * Title: Encode<br\>  
	 * Description: 反馈报文解押、解密<br\>  
	 */  
	public EncodeResults Encode(String feedbackDir, String filename) throws RemoteException;
}
