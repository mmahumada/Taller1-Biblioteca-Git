/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
 static ArrayList<Client> clients = new ArrayList<>();
 static Scanner sc = new Scanner(System.in);
 
 public static void main(String[] args){
 
 }
 
 public static void createCliente() {
    System.out.println("--- Crear Cliente ---");
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
    System.out.println("--- Lista de Clientes ---");
    if (clients.isEmpty()) {
        System.out.println("No hay clientes registrados.");
    } else {
        for (Client c : clients) {
            System.out.println(c);
        }
    }
}
 
 
 
 
}
