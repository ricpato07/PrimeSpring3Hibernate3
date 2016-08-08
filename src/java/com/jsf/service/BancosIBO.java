package com.jsf.service;

import com.jsf.persistence.Bancos;
import java.util.List;


public interface BancosIBO {
   public void insert(Bancos obj);
   public void update(Bancos obj);
   public void delete(Bancos obj);
   public Bancos getBanco(Bancos obj);
   public List<Bancos> listBancos(Bancos obj);
}
