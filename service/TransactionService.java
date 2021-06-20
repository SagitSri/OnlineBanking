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
public interface TransactionService {
    
    public String withdrawAmount(int amount);
    
    public String depositAmount(int amount);
    
    public String transferAmount(int amount, Long accountNo);
    
}
