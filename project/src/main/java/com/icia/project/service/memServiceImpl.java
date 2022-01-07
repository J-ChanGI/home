package com.icia.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.project.dao.memDao;

@Service
public class memServiceImpl implements memService{

	@Autowired
	private memDao md;
	
}
