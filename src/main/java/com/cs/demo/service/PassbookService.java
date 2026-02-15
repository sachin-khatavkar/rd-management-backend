package com.cs.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.demo.pdto.UserPassbookDTO;
import com.cs.demo.repo.Passbookrepo;

@Service
public class PassbookService {
	@Autowired
	private Passbookrepo pprepo;
	
	public List<UserPassbookDTO> getDetaill() {
		return pprepo.getUserPassbookDetail();
		}
	

	public List<UserPassbookDTO> getUserPassbookDetailByRid(int rid) {
	    return pprepo.getUserPassbookByRid(rid);
	}

}


