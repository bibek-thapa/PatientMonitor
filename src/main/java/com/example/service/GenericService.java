package com.example.service;

import java.util.List;

public interface GenericService<T> {
	
	 public List<T> getAll();
	   public T insert(T c);
	    public T getById(Long id);
	    public T delete(Long id);
	    public T update(T c);
	    public T getByName(String name);


}
