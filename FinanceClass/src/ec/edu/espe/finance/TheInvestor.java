/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.finance;

import financeclass.FinanceClass;

/**
 *
 * @author renzo
 */
public class TheInvestor {
    
    private Comparer comparer;
    
    FinanceClass financeClass = new FinanceClass();
     
    /**
     * @return the comparer
     */
    public Comparer getComparer() {
        return comparer;
    }
    
    public void betterAnalyst(TheAnalyst analyst){
        
    }
    /**
     * @param comparer the comparer to set
     */
    public void setComparer(Comparer comparer) {
        this.comparer = comparer;
    }
}
