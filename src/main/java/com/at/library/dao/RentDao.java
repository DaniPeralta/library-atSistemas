package com.at.library.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.at.library.model.Rent;
import com.at.library.model.RentPK;

@Repository
public interface RentDao extends CrudRepository<Rent, RentPK>{

}
