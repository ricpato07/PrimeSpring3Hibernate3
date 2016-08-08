package com.jsf.service;

import com.jsf.dao.BancosIDAO;
import com.jsf.persistence.Bancos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public class BancosBO implements BancosIBO {

    private BancosIDAO bancosDAO;
    private Bancos banco = new Bancos();

    @Override
    public void insert(Bancos obj) {
        banco = new Bancos();
        banco.setIdbanco(obj.getIdbanco());
        banco.setSbanco(obj.getSbanco());
        bancosDAO.insert(banco);
    }

    @Override
    public void update(Bancos obj) {
        banco = new Bancos();
        banco.setIdbanco(obj.getIdbanco());
        banco.setSbanco(obj.getSbanco());
        bancosDAO.update(banco);
    }

    @Override
    public void delete(Bancos obj) {
        banco = new Bancos();
        banco.setIdbanco(obj.getIdbanco());
        bancosDAO.delete(banco);
    }

    @Override
    public Bancos getBanco(Bancos obj) {
        banco = new Bancos();
        banco.setSbanco(obj.getSbanco());
        banco = bancosDAO.getObject(banco);
        Bancos banco = new Bancos();
        banco.setIdbanco(banco.getIdbanco());
        banco.setSbanco(banco.getSbanco());
        return banco;
    }

    @Override
    public List<Bancos> listBancos(Bancos obj) {
        List<Bancos> lista = new ArrayList();
        List<Bancos> listadao;
        Bancos banco;
        banco = new Bancos();
        banco.setSbanco(obj.getSbanco());
        listadao = bancosDAO.getList(banco);
        if (listadao != null) {
            for (Bancos item : listadao) {
                banco = new Bancos();
                banco.setIdbanco(item.getIdbanco());
                banco.setSbanco(item.getSbanco());
                lista.add(banco);
            }
        }
        return lista;
    }

    /**
     * @return the bancosDAO
     */
    public BancosIDAO getBancosDAO() {
        return bancosDAO;
    }

    /**
     * @param bancosDAO the bancosDAO to set
     */
    public void setBancosDAO(BancosIDAO bancosDAO) {
        this.bancosDAO = bancosDAO;
    }

}
