/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.Service.impl;

//import tg.efortis.assuma.daoImpl.AnalyseDAO;

import tg.assurence.DAO.impl.AnalyseDAO;
import tg.assurence.Service.IAnalyseService;
import tg.assurence.entity.Analyse;

//import tg.efortis.assuma.entities.Analyse;
//import tg.efortis.assuma.services.*;

/**
 *
 * @author amen
 */
public class AnalyseService extends CRUDService<Analyse, Integer> implements IAnalyseService {

    public AnalyseService(AnalyseDAO dao) {
        super(dao);
    }
    
}
