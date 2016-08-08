package com.jsf.dao;

import com.jsf.persistence.Bancos;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BancosDAO extends HibernateDaoSupport implements BancosIDAO {

    @Override
    public void insert(Bancos obj){
        this.getHibernateTemplate().save(obj);
    }
    
    @Override
    public void update(Bancos obj){
        this.getHibernateTemplate().merge(obj);
    }
    
    @Override
    public void delete(Bancos obj){
        this.getHibernateTemplate().delete(obj);
    }
    
    @Override
    public Bancos getObject(Bancos obj) {
        List<Bancos> lista = getHibernateTemplate().find("from Bancos where sbanco = ?", obj.getSbanco());
        if (lista.size() > 0) {
            return lista.get(0);
        }
        return null;
    }
    
    @Override
    public List<Bancos> getList(Bancos obj) {
        String sbanco = "%"+obj.getSbanco()+"%";
        System.out.println("sbanco:"+sbanco);
        List<Bancos> lista = getHibernateTemplate().find("from Bancos where sbanco like ?", sbanco);
        System.out.println("bancos:"+lista.size());
        if (lista.size() > 0) {
            return lista;
        }
        return null;
    }
}
