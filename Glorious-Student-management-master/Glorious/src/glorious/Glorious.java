/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glorious;

import Shared.ConnectionManager;

/**
 *
 * @author vinay sawant
 */
public class Glorious {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConnectionManager cm=new ConnectionManager();
        
        System.out.println(cm.getConnection());
    }
    
}
