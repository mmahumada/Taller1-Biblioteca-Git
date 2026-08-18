/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
 static ArrayList<Client> clients = new ArrayList<>();
 static ArrayList<Book> books = new ArrayList<>();
 static Scanner sc = new Scanner(System.in);
 
 public static void main(String[] args){
 
 }
 
 public static void createClient() {
    System.out.println("-- Crear Cliente --");
    System.out.print("ID: ");
    String id = sc.nextLine();
    System.out.print("Nombre: ");
    String name = sc.nextLine();
    System.out.print("Telefono: ");
    String phone = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();

    Client nuevoCliente = new Client(id, name, phone, email);
    clients.add(nuevoCliente);
    System.out.println("Cliente creado con éxito.");
}
 
 public static void listClients() {
    System.out.println("-- Lista de Clientes --");
    if (clients.isEmpty()) {
        System.out.println("No hay clientes registrados.");
    } else {
        for (Client c : clients) {
            System.out.println(c);
        }
    }
}
 
 public static Client searchClient(String id){
     for (Client c : clients){
         if (c.getId().equals(id)){
             return c;
         }
     }
     return null;
 }
 
 public static void updateClient() {
    System.out.println("-- Actualizar Cliente --");
    System.out.print("ID del cliente a actualizar: ");
    String id = sc.nextLine();

    Client c = searchClient(id);

    if (c == null) {
        System.out.println("Cliente no encontrado.");
    } else {
        System.out.print("Nuevo nombre: ");
        String name = sc.nextLine();
        System.out.print("Nuevo telefono: ");
        String phone = sc.nextLine();
        System.out.print("Nuevo email: ");
        String email = sc.nextLine();

        c.setName(name);
        c.setPhone(phone);
        c.setEmail(email);

        System.out.println("Cliente actualizado con éxito.");
    }
}
 
 public static void deleteClient() {
    System.out.println("-- Eliminar Cliente --");
    System.out.print("ID del cliente a eliminar: ");
    String id = sc.nextLine();

    Client c = searchClient(id);

    if (c == null) {
        System.out.println("Cliente no encontrado.");
    } else {
        clients.remove(c);
        System.out.println("Cliente eliminado con éxito.");
    }
}
 
 public static void createBook() {
     System.out.println("-- Crear Libro --");
     System.out.print("Codigo : ");
     String code = sc.nextLine();
     System.out.print("Titulo : ");
     String title = sc.nextLine();
     System.out.print("Año de publicacion : ");}
     String year = sc.nextLine();
     System.out.print("Autor: ");
     String author = sc.nextLine();
     
     Book newBook = newBook(code, title, year, author);
     books.add(newBook);
     System.out.println("Libro creado con exito");
     
     
     
 }
 
 
 
}
