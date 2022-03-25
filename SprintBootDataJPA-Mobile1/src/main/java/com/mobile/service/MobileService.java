package com.mobile.service;

import java.util.Optional;

import com.mobile.entity.Mobile;

public interface MobileService {
	
	Mobile addMobile(Mobile mobile);

	Mobile updateMobile(Mobile mobile);

	void deleteMobile(int mid);

	Optional<Mobile> getMobile(int mid);

	Iterable<Mobile> getAllMobiles();

}
