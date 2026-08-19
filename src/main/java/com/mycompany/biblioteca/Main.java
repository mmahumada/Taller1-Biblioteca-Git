

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
 static ArrayList<Client> clients = new ArrayList<>();
 static ArrayList<Book> books = new ArrayList<>();
 static ArrayList<Loan> loans = new ArrayList<>();
 static Scanner sc = new Scanner(System.in);
 
 public static void main(String[] args){
     String option = "";
     
     while (!option.equalsIgnoreCase("S")) {
         System.out.println("\n== MENU PRINCIPAL - BIBLIOTECA ==");
         System.out.println("1. Gestion de Clientes");
         System.out.println("2. Gestion de Libros");
         System.out.println("3. Gestion de Prestamos");
         System.out.println("S. Salir");
         System.out.print("Elige una opcion: ");
         
         option = sc.nextLine();
         
         switch (option) {
             case "1" -> clientMenu();
             case "2" -> bookMenu();
             case "3" -> loanMenu();
             case "S", "s" -> System.out.println("Saliendo del sistema");
             default -> System.out.println("Opcion no valida");
         }
     }
 }
 
 
 
 public static void clientMenu(){
     String option = "";
     while (!option.equalsIgnoreCase("V")) {
         System.out.println("\n -- Gestion de Clientes --");
         System.out.println("1. Crear Cliente");
         System.out.println("2. Listar Clientes");
         System.out.println("3. Buscar Cliente");
         System.out.println("4. Actualizar Cliente");
         System.out.println("5. Eliminar Cliente");
         System.out.println("V. Volver al menu principal");
         System.out.print("Elige una opcion: ");
         
         option = sc.nextLine();
         
         switch (option) {
             case "1" -> createClient();
             case "2" -> listClients();
             case "3" -> {
                 System.out.print("ID del cliente a buscar: ");
                 String id = sc.nextLine();
                 Client c = searchClient(id);
                 if (c == null) {
                     System.out.println("Cliente no encontrado");
                 }else {
                     System.out.println(c);
                 }
             }
             case "4" -> updateClient();
             case "5" -> deleteClient();
             case "V", "v" -> System.out.println("Volviendo al menu principal");
             default -> System.out.println("Opcion invalida");
         }
     }
     
 }
 
 public static void bookMenu() {
     String option = "";
     while (!option.equalsIgnoreCase("V")){
         System.out.println("\n -- Gestion de Libros --");
         System.out.println("1. Crear Libro");
         System.out.println("2. Listar Libros");
         System.out.println("3. Buscar Libro");
         System.out.println("4. Actualizar Libro");
         System.out.println("5. Eliminar Libro");
         System.out.println("V. Volver al menu principal");
         System.out.print("Elige una opcion: ");
         
         option = sc.nextLine();
         
         switch (option) {
             case "1" -> createBook();
             case "2" -> listBooks();
             case "3" -> {
                 System.out.print("Codigo del libro a buscar: ");
                 String code = sc.nextLine();
                 Book b = searchBook(code);
                 if (b == null) {
                     System.out.println("Libro no encontrado");
                 } else {
                     System.out.println(b);
                 }
            }
             case "4" -> updateBook();
             case "5" -> deleteBook();
             case "V", "v" -> System.out.println("Volviendo al menu principal");
             default -> System.out.println("Opcion no valida");
         }
     }
     
 }
 
 public static void loanMenu() {
     String option = "";
     while (!option.equalsIgnoreCase("V")) {
     System.out.println("\n -- Gestion de Prestamos --");
     System.out.println("1. Registrar Prestamo");
     System.out.println("2. Registrar Devolucion");
     System.out.println("3. Listar Prestamos");
     System.out.println("V. Volver al menu principal");
     System.out.print("Elige una opcion: ");
     
     option = sc.nextLine();
     
     switch (option) {
         case "1" -> createLoan();
         case "2" -> returnLoan();
         case "3" -> listLoans();
         case "V", "v" -> System.out.println("Volviendo al menu principal");
         default -> System.out.println("Opcion no valida");
        }
     }
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
     System.out.print("Año de publicacion : ");
     String year = sc.nextLine();
     System.out.print("Autor: ");
     String author = sc.nextLine();
     
     Book newBook = new Book(code, title, year, author);
     books.add(newBook);
     System.out.println("Libro creado con exito");  
 }
 
  public static void listBooks(){
      System.out.println("-- Lista de Libros --");
      if (books.isEmpty()){
          System.out.println("No hay libros registrados");   
      } else {
          for (Book b : books) {
              System.out.println(b);
          }
   }     
}
  
public static Book searchBook(String code){
    for (Book b: books){
        if (b.getCode().equals(code)){
            return b;
        }
    }
    return null;
}

public static void updateBook() {
     System.out.println("-- Actualizar Libro --");
     System.out.print("Codigo del libro  : ");
     String code = sc.nextLine();
     
     Book b = searchBook(code);
     
     if(b == null){
         System.out.println("Libro no encontrado");
     } else {
         System.out.print("Nuevo titulo: ");
         String title = sc.nextLine();
         System.out.print("Nuevo autor: ");
         String author = sc.nextLine();
         
         b.setTitle(title);
         b.setAuthor(author);
         System.out.println("Libro actualizado con exito");
     }
 }


 public static void deleteBook() {
    System.out.println("-- Eliminar Libro --");
    System.out.print("Codigo del libro a eliminar: ");
    String code = sc.nextLine();

    Book b = searchBook(code);

    if (b == null) {
        System.out.println("Libro no encontrado");
    } else {
        books.remove(b);
        System.out.println("Libro eliminado con exito");
    }
}
    public static void createLoan(){
        System.out.println("-- Registrar Prestamo --");
        System.out.print("ID del prestamo: ");
        String id = sc.nextLine();
        System.out.print("ID del cliente: ");
        String clientId = sc.nextLine();
        System.out.print("Codigo del libro: ");
        String bookCode = sc.nextLine();
        
        Client c = searchClient(clientId);
        Book b = searchBook(bookCode);
        
        if (c == null) {
            System.out.println("Cliente no encontrado");
        } else if (b == null) {
            System.out.println("Libro no encontrado");
        }else if (!b.isAvailable()){
            System.out.println("El libro no esta disponible");
        } else {
            Loan newLoan = new Loan(id, c, b);
            loans.add(newLoan);
            b.setAvailable(false);
            System.out.println("Prestamo registrado con exito");
        }
    } 

public static void returnLoan(){
    System.out.println("-- Registrar Devolucion --");
    System.out.print("ID del prestamo: ");
    String id = sc.nextLine();
    
    Loan loan = null;
    for (Loan l: loans) {
         if (l.getId().equals(id)){
             loan = l;
             break;
    }
  }
  
    if (loan == null) {
        System.out.println("Prestamo no encontrado");
    }else if (loan.getStatus().equals("DEVUELTO")){
        System.out.println("Este prestamo ya fue devuelto");
    } else {
        loan.setStatus("DEVUELTO");
        loan.getBook().setAvailable(true);
        System.out.println("Devolucion registrada con exito");
    }
}   

public static void listLoans() {
    System.out.println("-- Lista de Prestamos --");
    if (loans.isEmpty()) {
        System.out.println("No se encuentran prestamos registrados");
    } else {
        for (Loan l : loans){
            System.out.println(l);
        }
    }
}
          
}
 
 

