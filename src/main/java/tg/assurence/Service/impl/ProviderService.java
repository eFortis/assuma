/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.ProviderDAO;

import tg.assurence.DAO.impl.ProviderDAO;
import tg.assurence.Service.IProviderService;
import tg.assurence.entity.Provider;

//import tg.efortis.assuma.entities.Provider;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class ProviderService extends CRUDService<Provider, Integer> implements IProviderService {

    public ProviderService(ProviderDAO dao) {
        super(dao);
    }
    
    
}
