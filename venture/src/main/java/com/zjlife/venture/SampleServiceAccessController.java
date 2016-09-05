/**
 * 版权声明： 版权所有 违者必究 2012 
 * 日    期：12-5-25
 */
package com.zjlife.venture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.prlife.rop.security.ServiceAccessController;
import com.prlife.rop.session.Session;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 
 * @version 1.0
 */
public class SampleServiceAccessController implements ServiceAccessController {

    private static final Map<String, List<String>> aclMap = new HashMap<String, List<String>>();

    static {
        ArrayList<String> serviceMethods = new ArrayList<String>();
        serviceMethods.add("user.logon");
        serviceMethods.add("user.logout");
        serviceMethods.add("user.getSession");
        aclMap.put("00003", serviceMethods);
    }


    public boolean isAppGranted(String appKey, String method, String version) {
        if(aclMap.containsKey(appKey)){
            List<String> serviceMethods = aclMap.get(appKey);
            return serviceMethods.contains(method);
        }else{
            return true;
        }
    }


    public boolean isUserGranted(Session session, String method, String version) {
        return true;
    }
}

