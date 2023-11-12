package com.guy.crud.implement;

import com.guy.crud.model.Monome;
import com.guy.crud.service.MonomeService;

public abstract class MonomeServiceImpl implements MonomeService{

	@Override
	public Monome add(Monome a, Monome b) {
		// TODO Auto-generated method stub
		Monome result = new Monome(a.getCoef()+b.getCoef(),a.getExpo()+b.getExpo());
		return result;
	}

	@Override
	public Monome multi(Monome a, Monome b) {
		// TODO Auto-generated method stub
		Monome result = new Monome(a.getCoef()*b.getCoef(),a.getExpo()*b.getExpo());
		return result;
	}

	

}
