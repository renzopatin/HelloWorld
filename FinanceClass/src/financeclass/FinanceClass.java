/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeclass;

import ec.edu.espe.finance.Comparer;
import ec.edu.espe.finance.History;
import ec.edu.espe.finance.Share;

/**
 *
 * @author renzo
 */
public class FinanceClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Share share = new Share();
        share.enterShare();
        
        History history = new History();
        history.getTransaction();
        
        Comparer comparer = new Comparer();
        comparer.compare();
    }
    
}
