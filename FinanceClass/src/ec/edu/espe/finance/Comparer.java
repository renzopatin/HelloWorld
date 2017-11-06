/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.finance;

/**
 *
 * @author renzo
 */
public class Comparer {
    
    private TheAnalyst analyst;
    private String symbol;
    private Share share;

    /**
     * @return the analyst
     */
    public TheAnalyst getAnalyst() {
        return analyst;
    }
    
    public void compare(){
        
    }

    /**
     * @param analyst the analyst to set
     */
    public void setAnalyst(TheAnalyst analyst) {
        this.analyst = analyst;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the share
     */
    public Share getShare() {
        return share;
    }

    /**
     * @param share the share to set
     */
    public void setShare(Share share) {
        this.share = share;
    }
    
}
