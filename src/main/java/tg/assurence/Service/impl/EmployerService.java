/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.EmployerDAO;

import tg.assurence.DAO.impl.EmployerDAO;
import tg.assurence.Service.IEmployerService;
import tg.assurence.entity.Employer;

//import tg.efortis.assuma.entities.Employer;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class EmployerService extends CRUDService<Employer, Integer> implements IEmployerService {

    public EmployerService(EmployerDAO dao) {
        super(dao);
    }
    
    
}
