package com.icia.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.project.dao.memDao;
import com.icia.project.vo.memVo;

@Service
public class memServiceImpl implements memService{

	@Autowired
	private memDao md;

	@Override
	public void member(memVo vo) {
		// TODO Auto-generated method stub
		md.member(vo);
	}

	@Override
	public String login(memVo vo) {
		// TODO Auto-generated method stub
		
		return md.login(vo);
	}
	
}
