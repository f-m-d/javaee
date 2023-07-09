/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.cdi;

import java.util.Random;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

/**
 *
 * @author dauri
 */
@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator{

    
    @Inject
    private Logger logger;
    
    @Override
    public String generateNumber() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String mock = "MOCK-" + Math.abs(new Random().nextInt());
        logger.info("Generated MOCK: " + mock);
        return mock;
    }
    
    
    
    
}
