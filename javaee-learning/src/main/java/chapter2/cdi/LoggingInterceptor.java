/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.cdi;

import chapter2.cdi.Qualifiers.Loggable;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;


/**
 *
 * @author dauri
 */

@Interceptor
@Loggable
public class LoggingInterceptor {
    
    
    @Inject
    private Logger logger;
    
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception{
        logger.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
        
        try{
            return ic.proceed();
        }
        finally{
            logger.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
        }
    }
    
}
