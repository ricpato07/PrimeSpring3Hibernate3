package com.jsf.controller;

import com.jsf.persistence.Bancos;
import com.jsf.service.BancosIBO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
//@ManagedBean(name = "bancosController")
//@ViewScoped
public class BancosController {

    private Bancos banco = new Bancos();
    private List<Bancos> bancos = new ArrayList();
    private final String api = "http://localhost:8084/mavenspringrest/v1";
    private boolean beditar;
    private BancosIBO bancosBO;

    public BancosController() {
        //buscar();
    }

    public void guardar() {
        System.out.println("guardar");
//        RestTemplate restTemplate = new RestTemplate();
//        final String uri = api + "/bancos";
//        Bancos bancob = new Bancos();
//        bancob.setSbanco(banco.getSbanco());
//        String result = restTemplate.postForObject(uri, bancob, String.class);
//        System.out.println("result" + result);
        buscar();
        setBanco(new Bancos());
    }

    public void actualizar() {
        System.out.println("actualizar");
        Bancos bancob = new Bancos();
        bancob.setIdbanco(getBanco().getIdbanco());
        bancob.setSbanco(getBanco().getSbanco());
        System.out.println(getBanco());
        System.out.println("id:" + getBanco().getIdbanco());
        System.out.println("banco:" + getBanco().getSbanco());
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity entity = new HttpEntity(bancob, headers);
//
//        final String uri = api + "/bancos/{id}";
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("id", String.valueOf(bancob.getIdbanco()));
//
//        ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.PUT, entity, String.class, params);
//        System.out.println("result:" + result.getStatusCode());
        buscar();
        setBanco(new Bancos());
        beditar = false;
    }

    public void cancelar() {
        System.out.println("cancelar");
        setBanco(new Bancos());
        beditar = false;
    }

    public void buscar() {
        System.out.println("buscar");
        Bancos bancobus = new Bancos();
        bancobus.setSbanco(banco.getSbancobus());
        bancos = bancosBO.listBancos(bancobus);
//        Map<String, String> params = new HashMap<String, String>();
//        String uri = null;
//        if (banco.getSbancobus()!= null && !banco.getSbancobus().equals("")) {
//            System.out.println("buscar:" + banco.getSbancobus());
//            params.put("nombre", banco.getSbancobus());
//            uri = api + "/bancos?nombre={nombre}";
//        } else {
//            uri = api + "/bancos";
//        }
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity entity = new HttpEntity(headers);
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class, params);
//            if (result.getStatusCode() == HttpStatus.OK) {
//                bancos = mapper.readValue(result.getBody(), List.class);
//            }
//        } catch (Exception e) {
//            System.out.println("error:" + e.getMessage());
//        }
    }

    public void editar(int id) {
        try {
            System.out.println("editar");
//            RestTemplate restTemplate = new RestTemplate();
//            final String uri = api + "/bancos/{id}";
//            System.out.println("uri:" + uri);
//            Map<String, String> params = new HashMap<String, String>();
//            params.put("id", String.valueOf(id));
//            String res = restTemplate.getForObject(uri, String.class, params);
//            ObjectMapper mapper = new ObjectMapper();
//            Bancos bancob = mapper.readValue(res, Bancos.class);
//            banco.setIdbanco(bancob.getIdbanco());
//            banco.setSbanco(bancob.getSbanco());
            beditar = true;
        } catch (Exception e) {
            System.out.println("Error editar: " + e.getMessage());
        }
    }

    public void borrar(int id) {
        System.out.println("borrar");
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity entity = new HttpEntity(headers);
//
//        final String uri = api + "/bancos/{id}";
//        Map<String, String> params = new HashMap<String, String>();
//        params.put("id", String.valueOf(id));
//        ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.DELETE, entity, String.class, params);
//        System.out.println("result:" + result);
        buscar();
    }

   
    /**
     * @return the bancos
     */
    public List<Bancos> getBancos() {
        return bancos;
    }

    /**
     * @param bancos the bancos to set
     */
    public void setBancos(List<Bancos> bancos) {
        this.bancos = bancos;
    }

    /**
     * @return the beditar
     */
    public boolean isBeditar() {
        return beditar;
    }

    /**
     * @param beditar the beditar to set
     */
    public void setBeditar(boolean beditar) {
        this.beditar = beditar;
    }

    /**
     * @return the bancosBO
     */
    public BancosIBO getBancosBO() {
        return bancosBO;
    }

    /**
     * @param bancosBO the bancosBO to set
     */
    public void setBancosBO(BancosIBO bancosBO) {
        this.bancosBO = bancosBO;
    }

    /**
     * @return the banco
     */
    public Bancos getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(Bancos banco) {
        this.banco = banco;
    }

}
