package com.soundex.searchimplementationusingsoundex;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class Items {

	String name;
	@Id
	String code;
	
	public Items() {
	}
	
	public Items(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "Items [name=" + name + ", code=" + code + "]";
	}
	
}
