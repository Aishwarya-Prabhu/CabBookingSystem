/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Jyoti
 */
public class CustomerWorkRequest extends WorkRequest {

    private String destination;
    private String source;
    private String cartype;

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getRidetype() {
        return ridetype;
    }

    public void setRidetype(String ridetype) {
        this.ridetype = ridetype;
    }

    public String getEstimateprice() {
        return estimateprice;
    }

    public void setEstimateprice(String estimateprice) {
        this.estimateprice = estimateprice;
    }
    private String ridetype;
    private String estimateprice;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    @Override
    public String toString(){
        return destination;
    }
}
