/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 18, 2021
 * purpose: 
 */

package com.aaw.todowithrest.data;

import com.aaw.todowithrest.models.ToDo;
import java.util.List;

/**
 *
 * @author Austin Wong
 */
public interface ToDoDao {
    
    ToDo add(ToDo todo);

    List<ToDo> getAll();

    ToDo findById(int id);

    // true if item exists and is updated
    boolean update(ToDo todo);

    // true if item exists and is deleted
    boolean deleteById(int id);
}
