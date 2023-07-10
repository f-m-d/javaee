/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author dauri
 */
public class Main {
    
    public static void main(String[] args){
        
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        
        BookService bookService = container.instance().select(BookService.class).get();
        
        Book book = bookService.createBook("H2G2", 12.5f, "Geeky Sci-Fi Book");
        System.out.println(book);
        
        weld.shutdown();
    }
}
