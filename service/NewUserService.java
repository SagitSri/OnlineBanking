/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.User;

/**
 *
 * @author Myantra
 */
public interface NewUserService {
    
    public String addUser(User user);
    
    public String changePassword(String password, int custId);
    
}
