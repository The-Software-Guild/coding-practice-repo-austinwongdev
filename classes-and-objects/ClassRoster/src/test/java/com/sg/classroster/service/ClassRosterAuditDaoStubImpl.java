/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 2, 2021
 * purpose: 
 */

package com.sg.classroster.service;

import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterPersistenceException;

/**
 *
 * @author Austin Wong
 */
public class ClassRosterAuditDaoStubImpl implements ClassRosterAuditDao {
    
    @Override
    public void writeAuditEntry(String entry) 
            throws ClassRosterPersistenceException{
        // do nothing
    }

}
