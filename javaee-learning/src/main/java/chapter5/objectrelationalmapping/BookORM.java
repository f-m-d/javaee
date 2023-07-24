/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5.objectrelationalmapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

/**
 *
 * @author dauri
 */
@Entity
@Table(name = "BOOK-ORM-TABLE-PRIMARY")
@SecondaryTables({
  @SecondaryTable(name = "BOOK-ORM-TABLE-SECONDARY-1"),
  @SecondaryTable(name = "BOOK-ORM-TABLE-SECONDARY-2")
})
public class BookORM {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private Float price;
    private String isbn;
    private Integer nbOfPages;
    private Boolean illustrations;
    @Column(table = "BOOK-ORM-TABLE-SECONDARY-1")
    private String secondaryTableVar1;
    @Column(table = "BOOK-ORM-TABLE-SECONDARY-2")
    private String secondaryTableVar2;
    
    
    
    
}
