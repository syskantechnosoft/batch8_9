package com.cts.springdata.service;

import java.util.List;
import java.util.Optional;

import com.cts.springdata.model.Associates;

public interface AssociateService {
	public List<Associates> findAll();

	public Optional<Associates> findById(int id);

	public void addAssociate(Associates associate);

	public void updateAssociate(int id, Associates associate);

	public void deleteAssociate(int id);
}
