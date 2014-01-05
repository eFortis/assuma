/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.PrescriptionTypeDAO;

import tg.assurence.DAO.impl.PrescriptionTypeDAO;
import tg.assurence.Service.IPrescriptionTypeService;
import tg.assurence.entity.PrescriptionType;

//import tg.efortis.assuma.entities.PrescriptionType;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class PrescriptionTypeService extends CRUDService<PrescriptionType, Integer> implements IPrescriptionTypeService {

    public PrescriptionTypeService(PrescriptionTypeDAO dao) {
        super(dao);
    }
    
    
}
