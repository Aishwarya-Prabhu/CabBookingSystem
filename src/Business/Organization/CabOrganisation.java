/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DriverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aishwaryaprabhu
 */
public class CabOrganisation extends Organization{
        
    public CabOrganisation() {
        super(Organization.Type.CabOrganisation.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DriverRole());
        roles.add(new CustomerRole());
        
        
        return roles;
    }
    
}
