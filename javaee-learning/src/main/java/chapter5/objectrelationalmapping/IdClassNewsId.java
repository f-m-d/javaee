/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter5.objectrelationalmapping;

/**
 *
 * @author dauri
 */
public class IdClassNewsId {
    private String title;
    private String language;

    public IdClassNewsId() {
    }

    public IdClassNewsId(String title, String language) {
        this.title = title;
        this.language = language;
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
