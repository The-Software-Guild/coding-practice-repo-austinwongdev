/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 2, 2021
 * purpose: 
 */

package com.sg.classroster.dao;

/**
 *
 * @author Austin Wong
 */
public interface ClassRosterAuditDao {

    public void writeAuditEntry(String entry) 
            throws ClassRosterPersistenceException;
}
