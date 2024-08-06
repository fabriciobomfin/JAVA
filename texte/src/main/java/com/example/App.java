/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.mavenproject1;

 /**
  *
  * @author aluno.den
  */
 public class Mavenproject1 {
 
     public static void main(String[] args) {
         // Instanciando um objeto.
         clientes cliente = new clientes();
         
         //cliente.nome = "Marta";
         //cliente.idade = 18;
        
         
         cliente.setNome("Marta"); //set inserir informação na variavel
         cliente.setIdade(20);
         
         System.out.println("Nome: " + cliente.getNome()); //get para ler o que inseriu na variavel
         System.out.println("idade: " + cliente.getIdade());
     }
 }
 