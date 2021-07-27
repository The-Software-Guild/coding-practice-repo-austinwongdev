/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

/**
 *
 * @author Austin Wong
 */
public class House {
    
    private final int houseNumber;
    private final String street;
    private final int ZIP;
    private final String city;
    private final String state;
    private String label;
    
    public House(int houseNumber, String street, int ZIP, String city, String state){
        this.houseNumber = houseNumber;
        this.street = street;
        this.ZIP = ZIP;
        this.city = city;
        this.state = state;
    }
    
    public int getHouseNumber(){
        return this.houseNumber;
    }
    
    public String getStreet(){
        return this.street;
    }
    
    public int getZIP(){
        return this.ZIP;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public String getState(){
        return this.state;
    }
    
    public String getLabel(){
        return this.label;
    }
    
    public void setLabel(String label){
        this.label = label;
    }
}
