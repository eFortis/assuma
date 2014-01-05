/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.dao.IDAO;

import tg.assurence.DAO.impl.InsuredDAO;
import tg.assurence.Service.IInsuredService;
import tg.assurence.entity.Insured;

//import tg.efortis.assuma.daoImpl.InsuredDAO;
//import tg.efortis.assuma.services.IInsuredService;
//import tg.efortis.assuma.entities.Insured;

/**
 *
 * @author amen
 */
public class InsuredService extends CRUDService<Insured, Integer> implements IInsuredService {

    public InsuredService(InsuredDAO dao) {
        super(dao);
    }
    
    
}
