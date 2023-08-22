package com.api3.Day_3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api3.Day_3.model.ApiModel;
import com.api3.Day_3.repository.ApiRepo;

@Service
public class ApiService {
	@Autowired
ApiRepo ar;
	public ApiModel saveinfo(ApiModel am) {
		return ar.save(am);
	}
	public List<ApiModel> showinfo()
	{
		return ar.findAll();
	}
}
