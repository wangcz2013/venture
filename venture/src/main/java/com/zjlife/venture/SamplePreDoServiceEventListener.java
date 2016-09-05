/**
 * 版权声明： 版权所有 违者必究 2012 
 * 日    期：12-7-17
 */
package com.zjlife.venture;

import java.util.Map;

import com.prlife.rop.RopRequest;
import com.prlife.rop.RopRequestContext;
import com.prlife.rop.event.PreDoServiceEvent;
import com.prlife.rop.event.RopEventListener;
import com.prlife.rop.marshaller.MessageMarshallerUtils;

/**
 * <pre>
 * 功能说明：通过泛型监听器服务执行前的事件（PreDoServiceEvent） 
 * </pre>
 *
 * @author 
 * @version 1.0
 */
public class SamplePreDoServiceEventListener implements RopEventListener<PreDoServiceEvent> {

    public void onRopEvent(PreDoServiceEvent ropEvent) {
    	System.out.println("aaaa");
        RopRequestContext ropRequestContext = ropEvent.getRopRequestContext();
        if(ropRequestContext != null){
            Map<String,String> allParams = ropRequestContext.getAllParams();
            String message = MessageMarshallerUtils.asUrlString(allParams);
            System.out.println("message("+ropEvent.getServiceBeginTime()+")"+message);
        }
    }

    public int getOrder() {
        return 1;
    }
    
    @Override
    public int hashCode(){ 
       return "SamplePreDoServiceEventListener".hashCode(); 
    } 
    @Override
    public boolean equals(Object obj) {
    	 if (this == obj)
             return true;
         if (obj == null)
             return false;
         if (getClass() != obj.getClass())
             return false;
         return true;
    }
}

