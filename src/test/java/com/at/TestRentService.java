package com.at;


import java.util.Date;

import org.dozer.DozerBeanMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.at.library.dto.RentPostDTO;
import com.at.library.model.Rent;
import com.at.library.service.RentService;
import com.at.library.service.RentServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestRentService {

	private Rent rent = new Rent();
	
	private static final Date INIT = new Date();

	@InjectMocks	
	final RentService rentService = new RentServiceImpl();
		
	@Mock
	private DozerBeanMapper dozer;
	
	@Before
	public void init(){
		final RentPostDTO r = new RentPostDTO();
		Mockito.when(dozer.map(rent, RentPostDTO.class)).thenReturn(r);
	}

	@Test
	public void create(){
		createRent();
	}
	
	@Test
	public void transformRent(){
		final Rent rent = new Rent();
		rent.getRentpk().setStartDate(INIT);
		//final RentPostDTO rentDTO = rentService.transform(rent);
		Assert.assertEquals("Fecha no parseada bien",rent.getRentpk().getStartDate(), INIT);
		
	}
	
	private void createRent(){
		rent.getRentpk().setStartDate(INIT);
	}
}
