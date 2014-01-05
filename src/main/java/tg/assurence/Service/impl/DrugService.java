


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

import tg.assurence.DAO.impl.DrugDAO;
import tg.assurence.Service.IDrugService;
import tg.assurence.entity.Drug;
//import tg.efortis.assuma.daoImpl.DrugDAO;
//import tg.efortis.assuma.entities.Drug;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class DrugService extends CRUDService<Drug, Integer> implements IDrugService {

    public DrugService(DrugDAO dao) {
        super(dao);
    }
    
    
}
