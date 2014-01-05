/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;
//
//import tg.efortis.assuma.daoImpl.CompanyDAO;

import tg.assurence.DAO.impl.CompanyDAO;
import tg.assurence.Service.ICompanyService;
import tg.assurence.entity.Company;

//import tg.efortis.assuma.entities.Company;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class CompanyService extends CRUDService<Company, Integer> implements ICompanyService {

    public CompanyService(CompanyDAO dao) {
        super(dao);
    }
    
}
