/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DriverOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.DriverRole.DiverWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DriverRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DiverWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
