/**
 * 版权声明： 版权所有 违者必究 2012 
 * 日    期：12-7-20
 */
package com.zjlife.venture;

import com.prlife.rop.ThreadFerry;

/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 
 * @version 1.0
 */
public class SampleThreadFerry implements ThreadFerry{


    public void doInSrcThread() {
        System.out.println("doInSrcThread:"+Thread.currentThread().getId());
    }


    public void doInDestThread() {
        System.out.println("doInSrcThread:"+Thread.currentThread().getId());
    }
}

