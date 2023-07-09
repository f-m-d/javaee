/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.cdi;

import java.util.logging.Logger;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 *
 * @author dauri
 */

public class LoggingProducer {
    
    @Produces
    public Logger produceLogger(InjectionPoint ic){
        return Logger.getLogger(ic.getMember().getDeclaringClass().getName());
        
    }
    
}
