/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.dao.IDAO;

import tg.assurence.DAO.impl.PrescriptionDAO;
import tg.assurence.Service.IPrescriptionService;
import tg.assurence.entity.Prescription;

//import tg.efortis.assuma.daoImpl.PrescriptionDAO;
//import tg.efortis.assuma.entities.Prescription;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class PrescriptionService extends CRUDService<Prescription, Integer> implements IPrescriptionService {

    public PrescriptionService(PrescriptionDAO dao) {
        super(dao);
    }
    
    
}
