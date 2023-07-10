/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter2.cdi;

import chapter2.cdi.Qualifiers.Loggable;
import chapter2.cdi.Qualifiers.ThirteenDigits;
import javax.inject.Inject;

/**
 *
 * @author dauri
 */

@Loggable
public class BookService {
    
    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;
    
    public Book createBook(String title, Float price, String description){
        Book book = new Book(title,price,description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
        
    }
    
    
}
