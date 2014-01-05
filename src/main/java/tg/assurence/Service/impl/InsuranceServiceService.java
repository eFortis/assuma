/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;
//
//import tg.efortis.assuma.daoImpl.InsuranceServiceDAO;

import tg.assurence.DAO.impl.InsuranceServiceDAO;
import tg.assurence.Service.IInsuranceServiceService;
import tg.assurence.entity.InsuranceService;

//import tg.efortis.assuma.entities.InsuranceService;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class InsuranceServiceService extends CRUDService<InsuranceService, Integer> implements IInsuranceServiceService {

    public InsuranceServiceService(InsuranceServiceDAO dao) {
        super(dao);
    }
    
    
}
