package com.icia.project.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.project.vo.memVo;

@Repository
public class memDao {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	public void member(memVo vo) {
		// TODO Auto-generated method stub
		sql.insert("mem.membership", vo);
		System.out.println("dao" + vo);
	}

}
