/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author ct
 */
public class CropException extends Exception{
    
    public CropException(){}
    
    public CropException(String string){
        super(string);
    }
    
}
