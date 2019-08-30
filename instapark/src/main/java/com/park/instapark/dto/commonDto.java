package com.park.instapark.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
@Component
public class commonDto<T extends Serializable> {
	
	private List<T> resultList;
	private T singleResult;
	private HttpStatus status;
	private String messege;
	
	public String getMessege() {
		return messege;
	}
	public void setMessege(String messege) {
		this.messege = messege;
	}
	public List<T> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	public T getSingleResult() {
		return singleResult;
	}
	public void setSingleResult(T singleResult) {
		this.singleResult = singleResult;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	public commonDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public commonDto(List<T> resultList, T singleResult, HttpStatus status, String messege) {
		super();
		this.resultList = resultList;
		this.singleResult = singleResult;
		this.status = status;
		this.messege = messege;
	}
	
	
	
	
	
	
	
	

}
