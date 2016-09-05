package com.zjlife.venture.addventure.request;

import javax.validation.Valid;

import com.prlife.rop.AbstractRopRequest;

/**
 * 保单信息请求实体,用于易宝计算的服务请求
 * @author zangsh
 *
 */

public class PersonalRequest extends AbstractRopRequest{
	 @Valid
	 private PerInterfaceInfo perInterface;

	public PerInterfaceInfo getPerInterface() {
		return perInterface;
	}

	public void setPerInterface(PerInterfaceInfo perInterface) {
		this.perInterface = perInterface;
	}

	
	 
	
}
