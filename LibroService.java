package com.literalura.service;

import org.springframework.stereotype.Service;
import java.util.Scanner;

@Service
public class LibroService {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n--- LITERALURA ---");
            System.out.println("1 - Buscar libro por título");
            System.out.println("0 - Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título:");
                    String titulo = scanner.nextLine();
                    System.out.println("Buscando libro: " + titulo);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
