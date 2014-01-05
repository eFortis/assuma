/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO.impl;
//
//import tg.efortis.assuma.dao.*;

import tg.assurence.DAO.IPrescriptionDAO;
import tg.assurence.entity.Prescription;

//import tg.efortis.assuma.entities.Prescription;

/**
 *
 * @author amen
 */
public class PrescriptionDAO extends DAO<Prescription, Integer> implements IPrescriptionDAO {

    public PrescriptionDAO() {
        super(Prescription.class);
    }
    
}
