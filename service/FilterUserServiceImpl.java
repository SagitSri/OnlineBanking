/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import UtilConvertor.UserModelConvertor;
import java.util.ArrayList;
import model.UserModel;

/**
 *
 * @author Myantra
 */
public class FilterUserServiceImpl implements FilterUserService{
    
    private UserModelConvertor userModelConvertor;

    @Override
    public ArrayList<UserModel> getTopNUser(int topCustomerCount) {
        return userModelConvertor.changeUserToUserModel(null);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
