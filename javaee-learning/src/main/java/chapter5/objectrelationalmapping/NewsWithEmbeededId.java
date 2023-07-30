/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5.objectrelationalmapping;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author dauri
 */

@Entity
public class NewsWithEmbeededId {
    
    @EmbeddedId
    private EmbeddableNewsId embeddableNewsId;
}
