/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5.objectrelationalmapping;

import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author dauri
 */
@Embeddable
public class EmbeddableNewsId {

    public EmbeddableNewsId() {
    }

    public EmbeddableNewsId(String title, String language) {
        this.title = title;
        this.language = language;
    }
    
    
    
    
    private String title;
    private String language;

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmbeddableNewsId other = (EmbeddableNewsId) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.language, other.language);
    }

    
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
}
