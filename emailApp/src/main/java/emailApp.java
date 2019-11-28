/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snaser
 */
public class emailApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Email em1 = new Email();
        
        em1.setMailboxCapacity(500);
        em1.changePassword("");
        em1.getInfo();
    }
    
    
}
