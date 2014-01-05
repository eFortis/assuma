/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.PrestationDAO;

import tg.assurence.DAO.impl.PrestationDAO;
import tg.assurence.Service.IPrestationService;
import tg.assurence.entity.Prestation;

//import tg.efortis.assuma.entities.Prestation;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class PrestationService extends CRUDService<Prestation, Integer> implements IPrestationService {

    public PrestationService(PrestationDAO dao) {
        super(dao);
    }
    
    
}
