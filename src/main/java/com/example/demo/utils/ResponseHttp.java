package com.example.demo.utils;
 
 

import java.util.HashMap; 

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
 
public class ResponseHttp<T>{
  
 
	private T data;
	private HttpHeaders headers;
	
	private HashMap<String, Object> params;
	
	public ResponseHttp() {
		headers=new HttpHeaders();
		params = new HashMap<>();
	}
	 
	public ResponseHttp(T data) {
		this();
		this.data=data;
	}
	
	public ResponseHttp(HttpHeaders headers) {
		this();
		this.headers=headers;

	}
	
	public ResponseHttp(HashMap<String, Object> params) {
		this();
		this.params = params;

	}
	
	
	

	public ResponseHttp(T data, HttpHeaders headers, HashMap<String, Object> params) {
		this();
		this.data = data;
		this.headers = headers;
		this.params = params;
	}
	public ResponseHttp(T data, HttpHeaders headers, HashMap<String, Object> params,HttpStatus status) {
		this(); 
		this.data = data;
		this.headers = headers;
		this.params = params;
	}

	public T getData() {
		return data;
	}
	


	public void setData(T data) {
		this.data = data;
	}


	public HttpHeaders getHeaders() {
		return headers;
	}


	public void setHeaders(HttpHeaders headers) {
		this.headers = headers;
	}
	
	
	
		
	public ResponseHttp<T> put(String key,Object value) {
		this.params.put(key, value);
		return this;
	}
	
	public Object get(String key) {
		return this.params.get(key);
	}


	public HashMap<String, Object> getParams() {
		return params;
	}


	public void setParams(HashMap<String, Object> params) {
		this.params = params;
	}

	
	
	public ResponseHttp<T> set(T body) {
		data = body;
		return this;
	}
	
	public ResponseHttp<T> set(HttpHeaders headers) {
		this.headers=headers;
		return this;
	}
	
	public ResponseHttp<T> set(HashMap<String, Object> params) {
		this.params=params;
		return this;
	}
	

	
	
	public static ResponseHttp<?> build() {
		ResponseHttp<?> res = new  ResponseHttp<>();
		return res;
	}
 
}
