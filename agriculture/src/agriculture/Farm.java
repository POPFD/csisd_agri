/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agriculture;

/**
 *
 * @author SaneetBhella
 */
public class Farm {
   private int farmID;
   private String farmName;
   private String farmAddress;
   
   private SetOfFarms fields;
   private User farmOwner;
   
   public Farm(String farmName, String farmAddress, String farmOwner) {
       this.farmName = farmName;
       this.farmAddress = farmAddress;
       this.farmOwner = farmOwner;
   }
   
   public void setFields(SetOfFarms fields) {
       this.fields = fields;
   }
   
   public void getFields() {
       return fields;
   }

    public int getFarmID() {
        return farmID;
    }

    public void setFarmID(int farmID) {
        this.farmID = farmID;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getFarmAddress() {
        return farmAddress;
    }

    public void setFarmAddress(String farmAddress) {
        this.farmAddress = farmAddress;
    }

    public User getFarmOwner() {
        return farmOwner;
    }

    public void setFarmOwner(User farmOwner) {
        this.farmOwner = farmOwner;
    }
   
   
}
