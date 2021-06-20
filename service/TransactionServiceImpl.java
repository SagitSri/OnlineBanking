/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.User;
import store.ReadStore;
import store.WriteStore;

/**
 *
 * @author Myantra
 */
public class TransactionServiceImpl implements TransactionService{
    
    private ReadStore readStore;
    private WriteStore writeStore;

    @Override
    public String withdrawAmount(int amount) {
        String returnMsg = "";
        User user = getUserDetails(null);
        if(user != null){
            if(user.getBalance() > amount){
    //            writeStore to write new amount for the user
            }else{
                returnMsg =  "No sufficient balance!";
            }
        }else{
            returnMsg =  "Unable to identify the user";
        }
        returnMsg = "No user found for the transaction";
        return returnMsg;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String depositAmount(int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User getUserDetails(Long accountNo) {
        if(accountNo == null){
            User user = new User();
//        using readStore get logged in user where the property isUserLoggedIn as true
            return user;
        }else{
//            readStore to get accountNo details
            return new User();
        }
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String transferAmount(int amount, Long accountNo) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
