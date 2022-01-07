package com.cts.springdata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springdata.model.Associates;
import com.cts.springdata.repo.AssociateRepo;

@Service
public class AssociateServiceImpl implements AssociateService {

	@Autowired
	AssociateRepo associateRepo;

	@Override
	public List<Associates> findAll() {
		// TODO Auto-generated method stub
		return associateRepo.findAll();
	}

	@Override
	public Optional<Associates> findById(int id) {
		// TODO Auto-generated method stub
		return associateRepo.findById(id);
	}

	@Override
	public void addAssociate(Associates associate) {
		// TODO Auto-generated method stub
		associateRepo.save(associate);
	}

	@Override
	public void updateAssociate(int id, Associates associate) {
		// TODO Auto-generated method stub
		associateRepo.save(associate);
	}

	@Override
	public void deleteAssociate(int id) {
		// TODO Auto-generated method stub
		associateRepo.deleteById(id);
	}

}
