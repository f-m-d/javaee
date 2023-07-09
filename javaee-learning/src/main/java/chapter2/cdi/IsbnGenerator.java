/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.cdi;

import java.util.Random;
import java.util.logging.Logger;
import javax.inject.Inject;

/**
 *
 * @author dauri
 */

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator{

    @Inject
    private Logger logger;

    @Override
    @Loggable
    public String generateNumber() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    String isbn = "13-84356" + Math.abs(new Random().nextInt());
    logger.info("Generated ISBN: " + isbn);
    return isbn;
    }
    
    
    
    
    
    
    
}
