package com.zjlife.venture; 
/**
 * 版权声明： 版权所有 违者必究 2012 
 * 日    期：12-5-25
 */

import java.util.HashMap;
import java.util.Map;

import com.prlife.rop.security.AppSecretManager;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 
 * @version 1.0
 */
public class SampleAppSecretManager implements AppSecretManager {

    private static Map<String, String> appKeySecretMap = new HashMap<String, String>();

    static {
//        appKeySecretMap.put("00001", "abcdeabcdeabcdeabcdeabcde");
//        appKeySecretMap.put("00002","abcdeabcdeabcdeabcdeaaaaa");
//        appKeySecretMap.put("00003","abcdeabcdeabcdeabcdeaaaaa");
    	//修改机构代码
    	  appKeySecretMap.put("10", "abcdeabcdeabcdeabcdeabcde");
          appKeySecretMap.put("20","abcdeabcdeabcdeabcdeaaaaa");
          appKeySecretMap.put("30","abcdeabcdeabcdeabcdeaaaaa");
    }


    public String getSecret(String appKey) {
        System.out.println("use SampleAppSecretManager!");
        return appKeySecretMap.get(appKey);
    }


    public boolean isValidAppKey(String appKey) {
        return getSecret(appKey) != null;
    }
}

