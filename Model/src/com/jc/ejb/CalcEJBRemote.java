package com.jc.ejb;

import javax.ejb.Remote;

@Remote
public interface CalcEJBRemote {
  public int add(int x, int y); 
}
