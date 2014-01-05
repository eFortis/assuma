/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;

//import tg.efortis.assuma.dao.*;

import tg.assurence.DAO.IAnalyseDAO;
import tg.assurence.entity.Analyse;

//import tg.efortis.assuma.entities.Analyse;

/**
 *
 * @author amen
 */
public class AnalyseDAO extends DAO<Analyse, Integer> implements IAnalyseDAO {

    public AnalyseDAO() {
        super(Analyse.class);
    }
    
}
