package exceptions;

/**
 *
 * @author ct
 */
public class CropException extends Exception{
    
    //Default Constructor
    //Purpose: Initializes data members to Default values
    //Parameters: none
    //Returns: none;
    public CropException() {}
    
    
    //Paramaterized constructor
    //Purpose: initializes data members to value passed as a parameter
    //Parameters: a string containing the error message
    //Returns: none
    public CropException(String string) {
        super(string);
    }
}