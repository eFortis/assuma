/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.assurence.DAO;

import tg.assurence.entity.Role;
import javax.ejb.Local;

/**
 *
 * @author komilo
 */
@Local
public interface RoleDAOBeanLocal extends IDAO<Role, Long> {
    
    Role getOneByName(String name);
}
