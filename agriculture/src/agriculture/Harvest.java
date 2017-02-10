/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

import java.util.Date;

/**
 *
 * @author SaneetBhella
 */
public class Harvest {
    private Date harvestDate;
    private Crop cropType;
    private double harvestYield;
    
    public Harvest(Date harvestDate, Crop cropType, double harvestYield) {
        this.harvestDate = harvestDate;
        this.cropType = cropType;
        this.harvestYield = harvestYield;
    }

    public Date getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(Date harvestDate) {
        this.harvestDate = harvestDate;
    }

    public Crop getCropType() {
        return cropType;
    }

    public void setCropType(Crop cropType) {
        this.cropType = cropType;
    }

    public double getHarvestYield() {
        return harvestYield;
    }

    public void setHarvestYield(double harvestYield) {
        this.harvestYield = harvestYield;
    }
}
