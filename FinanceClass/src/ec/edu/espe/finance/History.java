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
public class History {
    private Transaction transaction;
    private Share share;
    private int sale;
    private int purchase;
    
    public void manage(int purchase, int sale){
        
    }
    /**
     * @return the transaction
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * @param transaction the transaction to set
     */
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
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
     * @return the sale
     */
    public int getSale() {
        return sale;
    }

    /**
     * @param sale the sale to set
     */
    public void setSale(int sale) {
        this.sale = sale;
    }

    /**
     * @return the purchase
     */
    public int getPurchase() {
        return purchase;
    }

    /**
     * @param purchase the purchase to set
     */
    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }
}
