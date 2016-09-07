package com.zjlife.venture.riskamnt.client;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class RiskAlgorithmXMLClient {
	private static final String TARGET_URL = "http://localhost:8080/venture/router";//服务接口的URL,建议可以配置
//	private static final String TARGET_URL = "http://10.132.2.139:8080/tax-vat/router";//服务接口的URL,建议可以配置
	private static final String CHARSET_NAME = "utf-8";//通讯的编码格式为utf-8字符集
	
	public static void main(String[] args) {
		try {
			URL targetUrl = new URL(TARGET_URL);
			HttpURLConnection httpConnection = (HttpURLConnection) targetUrl.openConnection();
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod("POST");//以post提交
			//httpConnection.setRequestProperty("Content-Type", "text/html");//设置提交内容格式
			httpConnection.setRequestProperty("Accept-Charset", CHARSET_NAME);//设置提交的编码格式
			httpConnection.setRequestProperty("contentType", CHARSET_NAME);//设置提交的编码格式
			httpConnection.setConnectTimeout(30000000);//设置联接主机超时时间（单位：毫秒）
			httpConnection.setReadTimeout(30000000);//设置从主机读取数据超时（单位：毫秒）
			httpConnection.setDoOutput(true);
			Map<String,String> form = new HashMap<String,String>();
			//组装请求报文
			//组装系统级参数据，没顺序要求，先设置哪个都可以
	        form.put("appKey", "30");//应用键
	        form.put("method", "risk.queryAmntXML");//服务方法名
	        form.put("v", "1.0");//服务版本号
	        form.put("messageFormat", "xml");//响应报文格式
	        form.put("locale", "zh_CN");//响应报文语言
	        //组装业务参数据
	        form.put("reauestMessage", getRiskXMLInterface());
			String params = formatForm(form);//格式化请求报文
			
			//发送报文
			OutputStream outputStream = httpConnection.getOutputStream();
			outputStream.write(params.getBytes());
			outputStream.flush();
	        //如果请求不成成功，返回200码，比果网络不通等情况
			if (httpConnection.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ httpConnection.getResponseCode());
			}
	       //请求成功，保要区分价税分离成功或失败的情况
			String responseStr = new String(readInputStream(httpConnection.getInputStream()), CHARSET_NAME);//取出响应报文
			System.out.println(responseStr);
		
			httpConnection.disconnect();//关闭连接
			/********以下是如果价税离服务失败时的报格式********
			 {"errorToken":"@@$-ERROR_TOKEN$-@@","code":"1","message":"服务不可用","solution":"服务目前无法使用，请保存好错误信息并和服务平台管理员联系","subErrors":[{"code":"isp.tax-searation-service-timeout","message":"调用tax.searation服务超时，该服务的超时限制为10秒，请和服务平台提供商联系。"}]}
			 *************************************************/
			/*******以下是如果价税离计算成功时的报格式*********
			  {"requestTime":1461061925740,"responseTime":1461061926348,"separationDetailed":[{"itemKey":"11111","insuranceActuarialCode":"11111","insuranceCode":"某某险种","costType":"1","preTaxAmount":100.00,"taxCode":"10010001","taxableSign":"1","taxRate":0.06,"afterTaxAmount":94.0000,"taxAmount":6.0000},{"itemKey":"11111","insuranceActuarialCode":"11111","insuranceCode":"某某险种","costType":"1","preTaxAmount":100.00,"taxCode":"10010001","taxableSign":"1","taxRate":0.06,"afterTaxAmount":94.0000,"taxAmount":6.0000}]}
			 ***********************************************/
	 
		  } catch (MalformedURLException e) {
	        //请各系统自行处理导常，例程只是打印在控制台，请不要参照。
			e.printStackTrace();
	 
		  } catch (IOException e) {
			//请各系统自行处理导常，例程只是打印在控制台，请不要参照。
			e.printStackTrace();
	 
		 }
	}
	
	/**
	 * 生成易宝请求数据JSON字符串 
	 * @return
	 */
	public static String getRiskXMLInterface(){
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>");
		sb.append("<reauestMessage>");
		sb.append("<riskCode>2014</riskCode>");
		sb.append("<name>张三</name>");
		sb.append("<sex>男</sex>");
		sb.append("<birthDay>1990-02-01</birthDay>");
		sb.append("<idType>身份证</idType>");
		sb.append("<idNo>1111</idNo>");
		sb.append("<amnt>10000</amnt>");
		sb.append("<prem>10000000</prem>");
		sb.append("</reauestMessage>");
		return sb.toString();
		
	}
		/**
		 * 格式化表单数据
		 * @param form
		 * @return
		 * @throws UnsupportedEncodingException
		 */
		public static String formatForm(Map<String,String> form) throws UnsupportedEncodingException{
			StringBuilder builder = new StringBuilder();
			Iterator<Entry<String, String>> it = form.entrySet().iterator();
			String key;           
			String value;
			while(it.hasNext()){ 
				Map.Entry<String, String> entry = (Map.Entry<String, String>)it.next();           
		        key=entry.getKey();           
		        value=entry.getValue(); 
		        builder.append(URLEncoder.encode(key, CHARSET_NAME));
		        if(value != null){
		        	builder.append('=');
					builder.append(URLEncoder.encode(value, CHARSET_NAME));
		        }
		        if(it.hasNext()){
		        	builder.append('&');
		        }
			}
			return builder.toString();
		}
		
		 /**
	     * 从输入流中读取数据
	     * @param inStream
	     * @return
	     * @throws Exception
	     */
	    public static byte[] readInputStream(InputStream inStream) throws IOException{
	        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	        byte[] buffer = new byte[1024];
	        int len = 0;
	        while( (len = inStream.read(buffer)) !=-1 ){
	            outStream.write(buffer, 0, len);
	        }
	        byte[] data = outStream.toByteArray();//网页的二进制数据
	        outStream.close();
	        inStream.close();
	        return data;
	    }


}
