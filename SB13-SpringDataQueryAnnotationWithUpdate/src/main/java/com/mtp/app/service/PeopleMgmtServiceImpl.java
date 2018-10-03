package com.mtp.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtp.app.dao.PeopleMgmtDao;

@Service
public class PeopleMgmtServiceImpl implements PeopleMgmtService {

	@Autowired
	private PeopleMgmtDao peopleMgmtDao;

	@Override
	public void updateEmailById(int id, String newEmail) {
		peopleMgmtDao.updateEmailById(id, newEmail);
	}
}
