/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlEJB;

import Model.Project;
import javax.ejb.Local;

/**
 *
 * @author Ethan
 */
@Local
public interface AddProjectLocal {
    void addProject(Project p);
}
