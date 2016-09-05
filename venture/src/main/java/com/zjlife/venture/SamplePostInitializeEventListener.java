/**
 * 版权声明： 版权所有 违者必究 2012 
 * 日    期：12-6-2
 */
package com.zjlife.venture;

import com.prlife.rop.event.AfterStartedRopEvent;
import com.prlife.rop.event.RopEventListener;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 
 * @version 1.0
 */
public class SamplePostInitializeEventListener implements RopEventListener<AfterStartedRopEvent> {


    public void onRopEvent(AfterStartedRopEvent ropRopEvent) {
        System.out.println("execute SamplePostInitializeEventListener!");
    }


    public int getOrder() {
        return 0;
    }
}

