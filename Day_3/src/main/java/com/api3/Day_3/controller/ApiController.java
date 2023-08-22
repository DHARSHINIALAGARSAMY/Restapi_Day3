package com.api3.Day_3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api3.Day_3.model.ApiModel;
import com.api3.Day_3.service.ApiService;

@RestController
public class ApiController {
	@Autowired
ApiService apiser;
	@PostMapping("addstd")
	public ApiModel add(@RequestBody ApiModel am) {
		return apiser.saveinfo(am);
	}
	@GetMapping("showstd")
	public List<ApiModel> show(){
		return apiser.showinfo();
	}
}
