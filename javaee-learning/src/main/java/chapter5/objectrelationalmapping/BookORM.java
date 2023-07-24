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

    
    
    public BookORM() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNbOfPages() {
        return nbOfPages;
    }

    public void setNbOfPages(Integer nbOfPages) {
        this.nbOfPages = nbOfPages;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }

    public String getSecondaryTableVar1() {
        return secondaryTableVar1;
    }

    public void setSecondaryTableVar1(String secondaryTableVar1) {
        this.secondaryTableVar1 = secondaryTableVar1;
    }

    public String getSecondaryTableVar2() {
        return secondaryTableVar2;
    }

    public void setSecondaryTableVar2(String secondaryTableVar2) {
        this.secondaryTableVar2 = secondaryTableVar2;
    }
    
    
    
    
}
