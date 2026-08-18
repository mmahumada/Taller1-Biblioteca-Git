/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;


public class Book extends Material {
    private String author;
    private boolean available;

    public Book(String code, String title, String publicationYear, String author){
        super(code, title, publicationYear);
        this.author = author;
        this.available = true;
    }    
    
    public String getAuthor(){
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public boolean isAvailable(){
        return available;
    }
    
    public void setAvailable(boolean available){
        this.available = available;
    }
    
    @Override
    public String toString(){
        return "Book [" + super.toString() + ", author=" + author + ", available=" + (available ? "Si" : "No") + "]";
    }
}
