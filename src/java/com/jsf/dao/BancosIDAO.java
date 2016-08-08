package com.jsf.dao;

import com.jsf.persistence.Bancos;
import java.util.List;

public interface BancosIDAO {
    public void insert(Bancos obj);
    public void update(Bancos obj);
    public void delete(Bancos obj);
    public Bancos getObject(Bancos obj);
    public List<Bancos> getList(Bancos obj);
}
