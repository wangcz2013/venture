package com.zjlife.venture.addventure.request;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "perInterface")
public class PerInterfaceInfo {
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String name;//费用类型
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PerInterfaceInfo(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public PerInterfaceInfo() {
		// TODO Auto-generated constructor stub
	}
	

}
