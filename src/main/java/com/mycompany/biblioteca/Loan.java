
package com.mycompany.biblioteca;

import java.time.LocalDate;

public class Loan {
    private String id;
    private Client client;
    private Book book;
    private LocalDate date;
    private String status;
    
    public Loan(String id, Client client, Book book) {
        this.id = id;
        this.client = client;
        this.book = book;
        this.date = LocalDate.now();
        this.status = "ACTIVO"; 
    }
    
    public String getId(){
        return id;
    }
    
    public Client getClient() {
        return client;
    }
    
    public Book getBook(){
        return book;
    }
    
    public LocalDate getDate(){
        return date;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return "Loan [id=" + id + ", client=" + client.getName() +", book=" + book.getTitle() + ", date=" + date + ", status=" + status + "]";
    }
}
