/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5.objectrelationalmapping;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author dauri
 */
@Entity
@Access(AccessType.FIELD)
public class Track {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    @Column( name = "title_column_field")
    private String title;
    private Float duration;
    
    @Basic(fetch = FetchType.LAZY)
    @Lob
    private byte[] wav;
    
    @Column( name = "description_column", nullable = false, unique = false)
    private String description;
    
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.TIME)
    private Date time;
    @Temporal(TemporalType.TIMESTAMP)
    private Date bothDateAndTime;
    
    
    @Transient
    private String opinion;
    
    @Enumerated(EnumType.STRING)
    private CreditCardType creditCardType;

    
    
@Access(AccessType.PROPERTY)
//@Column( name = "title_column_property")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
    
    
    
}
