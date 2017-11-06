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
public class Share {

    private float fee;
    private float numberShare;
    private float value;
    
    public float valueShare(float fee, int numberShare){
        return getValue();
    }
    
    public float calcualteFee(float fee){
        return fee;
    }
    
    public void enterShare(){
        
    }

    /**
     * @return the fee
     */
    public float getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(float fee) {
        this.fee = fee;
    }

    /**
     * @return the numberShare
     */
    public float getNumberShare() {
        return numberShare;
    }

    /**
     * @param numberShare the numberShare to set
     */
    public void setNumberShare(float numberShare) {
        this.numberShare = numberShare;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }
    
}
