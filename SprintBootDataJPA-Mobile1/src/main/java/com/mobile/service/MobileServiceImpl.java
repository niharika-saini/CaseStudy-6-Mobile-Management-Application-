package com.mobile.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;


@Service
@Transactional
public class MobileServiceImpl implements MobileService{
	
	@Autowired
	MobileDao dao;

	@Override
	public Mobile addMobile(Mobile mobile) {
		
		return dao.save(mobile);
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		
		return dao.save(mobile);
	}

	@Override
	public void deleteMobile(int mid) {
		dao.deleteById(mid);
		
	}

	@Override
	public Optional<Mobile> getMobile(int mid) {
		return dao.findById(mid);
	}

	@Override
	public Iterable<Mobile> getAllMobiles() {
		
		return dao.findAll();
	}

}