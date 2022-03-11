package com.jc.ejb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class CalcEJB
 */
@Stateless
public class CalcEJB implements CalcEJBRemote, CalcEJBLocal {

    /**
     * Default constructor. 
     */
    public CalcEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y; 
	}

}
