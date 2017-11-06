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
public class Transaction {
    
    private Share share;
    private String Symbol;
    private float purchaseFee;
    private float saleFee;
    private int quantity;
    private float profitLoss;

    public Share purchaseShare(){
        return share;
    }
    
    public Share saleShare(){
        return share;
    }
    
    public void profitLoss(){

    }
    
    public void getSymbols(String symbol){
  
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

    /**
     * @return the Symbol
     */
    public String getSymbol() {
        return Symbol;
    }

    /**
     * @param Symbol the Symbol to set
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * @return the purchaseFee
     */
    public float getPurchaseFee() {
        return purchaseFee;
    }

    /**
     * @param purchaseFee the purchaseFee to set
     */
    public void setPurchaseFee(float purchaseFee) {
        this.purchaseFee = purchaseFee;
    }

    /**
     * @return the saleFee
     */
    public float getSaleFee() {
        return saleFee;
    }

    /**
     * @param saleFee the saleFee to set
     */
    public void setSaleFee(float saleFee) {
        this.saleFee = saleFee;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the profitLoss
     */
    public float getProfitLoss() {
        return profitLoss;
    }

    /**
     * @param profitLoss the profitLoss to set
     */
    public void setProfitLoss(float profitLoss) {
        this.profitLoss = profitLoss;
    }
}
