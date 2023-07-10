/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapted2.cdi.test;

import chapter2.cdi.Book;
import chapter2.cdi.BookService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author dauri
 */


public class BookServiceIT {
    
    
    @Test
    public void shouldCheckNumberIsMock(){
        
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        
        BookService bookService = container.instance().select(BookService.class).get();
        
        Book book = bookService.createBook("H2G2", 12.5f, "Geeky Sci-fi Book");
        assertTrue(book.getNumber().startsWith("MOCK"));
        
        weld.shutdown();
    }
    
}
