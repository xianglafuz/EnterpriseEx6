package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01111
 */
@XmlRootElement
public class Result {
    
    private Double area;

    /**
     * Get the value of area
     *
     * @return the value of area
     */
    public Double getArea() {
        return area;
    }

    /**
     * Set the value of area
     *
     * @param area new value of area
     */
    @XmlElement
    public void setArea(Double area) {
        this.area = area;
    }
    
        private Double circum;

    /**
     * Get the value of circum
     *
     * @return the value of circum
     */
    public Double getCircum() {
        return circum;
    }

    /**
     * Set the value of circum
     *
     * @param circum new value of circum
     */
    @XmlElement
    public void setCircum(Double circum) {
        this.circum = circum;
    }


}
