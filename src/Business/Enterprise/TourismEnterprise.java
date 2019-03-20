/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aishwaryaprabhu
 */
public class TourismEnterprise extends Enterprise{
     public TourismEnterprise(String name){
        super(name,EnterpriseType.Visits);
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
