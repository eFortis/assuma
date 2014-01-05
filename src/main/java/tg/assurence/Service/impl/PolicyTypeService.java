/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.PolicyTypeDAO;

import tg.assurence.DAO.impl.PolicyTypeDAO;
import tg.assurence.Service.IPolicyTypeService;
import tg.assurence.entity.PolicyType;

//import tg.efortis.assuma.entities.PolicyType;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class PolicyTypeService extends CRUDService<PolicyType, Integer> implements IPolicyTypeService {

    public PolicyTypeService(PolicyTypeDAO dao) {
        super(dao);
    }
    
}
