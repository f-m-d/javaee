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
@EightDigits
public class IssnGenerator implements NumberGenerator{

    @Inject
    private Logger logger;
    
    @Override
    @Loggable
    public String generateNumber() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    String issn = "8-" + Math.abs(new Random().nextInt());
    logger.info("Generated ISSN: " + issn);
    return issn;
    }
    
    
    
    
}
