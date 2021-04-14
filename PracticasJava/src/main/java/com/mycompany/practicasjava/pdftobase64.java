/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicasjava;
import java.io.File;
import java.nio.file.Files;
import java.util.Base64;

class pdftobase64 {
  public static void main(String[] args) {
    try {
      File file = new File("C:\\Users\\eduan\\Desktop\\practicas.java\\horario diurno 4to.pdf");
      byte [] bytes = Files.readAllBytes(file.toPath());

      String b64 = Base64.getEncoder().encodeToString(bytes);
      System.out.println("Codificado = " + b64); //-> "JVBERi..."
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}