package com.api3.Day_3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api3.Day_3.model.ApiModel;

public interface ApiRepo extends JpaRepository<ApiModel, Integer> {

}
