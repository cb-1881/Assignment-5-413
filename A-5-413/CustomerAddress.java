
public class CustomerAddress {
   
   
   // Define variables to be used in the CustomerAddress processing 
   int streetNum, zip;
   String streetName, city, state;    
   
   /**
    * 5-Arg Constructor
    * 
    * @param num
    * @param street
    * @param aCity
    * @param st
    * @param zp 
    */
   public CustomerAddress(int num, String street, String aCity, String st, int zp) {
       streetNum = num;
       streetName = street;
       city = aCity;
       state = st;
       zip = zp;
   }
   
   //Setters and getters for the CustomerAddress
   
   public int getStreetNum() {
       return streetNum;
   }
   
   public String getStreetName() {
       return streetName;
   }

   public String getCity() {
       return city;
   }

   public String getState() {
       return state;
   }
   
   public int getZip() {
       return zip;
   }
   
   public void setStreet(String stName) {
       this.streetName = stName;
   }
   
   public void setCity(String ct) {
       this.city = ct;
   }

   public void setState(String st) {
       this.state = st;
   }

   public void setZip(int aZip) {
       this.zip = aZip;
   }
   
   @Override
   public String toString() {
       return streetNum + " " + streetName + ", " + city + ", " + state + " " + zip;
   }

}

    

