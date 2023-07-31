/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5.objectrelationalmapping;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
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
public class TrackWithPropertyAnnotations {
    
    
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Float duration;
    
//    @Basic(fetch = FetchType.LAZY)
//    @Lob
    private byte[] wav;
    
//    @Column( name = "description_column", nullable = false, unique = false)
    private String description;
    
//    @Temporal(TemporalType.DATE)
    private Date date;
//    @Temporal(TemporalType.TIME)
    private Date time;
//    @Temporal(TemporalType.TIMESTAMP)
    private Date bothDateAndTime;
    
    
//    @Transient
    private String opinion;
    
//    @Enumerated(EnumType.STRING)
    private CreditCardType creditCardType;

    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }
    
    
    @Basic(fetch = FetchType.LAZY)
    @Lob
    public byte[] getWav() {
        return wav;
    }

    public void setWav(byte[] wav) {
        this.wav = wav;
    }

    
    @Column( name = "description_column", nullable = false, unique = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Temporal(TemporalType.DATE)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Temporal(TemporalType.TIME)
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBothDateAndTime() {
        return bothDateAndTime;
    }

    public void setBothDateAndTime(Date bothDateAndTime) {
        this.bothDateAndTime = bothDateAndTime;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public CreditCardType getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(CreditCardType creditCardType) {
        this.creditCardType = creditCardType;
    }
    
    
    
    
}
