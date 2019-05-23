/** 
 * <pre>项目名称:ssm-user-xys 
 * 文件名称:IpUtil.java 
 * 包名:com.jk.xys.utlis 
 * 创建日期:2019年3月7日上午11:49:50 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.consumer.utils;

/** 
 * <pre>项目名称：ssm-user-xys    
 * 类名称：IpUtil    
 * 类描述：    
 * 创建人：辛岩松18322516058
 * 创建时间：2019年3月7日 上午11:49:50    
 * 修改人：辛岩松18322516058
 * 修改时间：2019年3月7日 上午11:49:50    
 * 修改备注：       
 * @version </pre>    
 */

	 
	import java.net.InetAddress;
	import java.net.UnknownHostException;
	 
	import javax.servlet.http.HttpServletRequest;
	 
	public class IpUtil {
	 
		/** 
	     * 获取当前网络ip 
	     * @param request 
	     * @return 
	     */  
	    public static String getIpAddr(HttpServletRequest request){  
	        String ipAddress = request.getHeader("x-forwarded-for");  
	            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
	                ipAddress = request.getHeader("Proxy-Client-IP");  
	            }  
	            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
	                ipAddress = request.getHeader("WL-Proxy-Client-IP");  
	            }  
	            if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {  
	                ipAddress = request.getRemoteAddr();  
	                if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){  
	                    //根据网卡取本机配置的IP  
	                    InetAddress inet=null;  
	                    try {  
	                        inet = InetAddress.getLocalHost();  
	                    } catch (UnknownHostException e) {  
	                        e.printStackTrace();  
	                    }  
	                    ipAddress= inet.getHostAddress();  
	                }  
	            }  
	            //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割  
	            if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15  
	                if(ipAddress.indexOf(",")>0){  
	                    ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));  
	                }  
	            }  
	            return ipAddress;   
	    }
	}

