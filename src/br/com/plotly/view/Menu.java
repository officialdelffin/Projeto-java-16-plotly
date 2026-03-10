
// Pacote :
package br.com.plotly.view;


import java.util.Scanner;

// Classe responsável pela comunicação direta com o usuário :
public class Menu {


    // Atributos :
    private String responseUser;


    // Instancias :
    Scanner inputUser = new Scanner(System.in);


    // Realiza o fluxo de interação do usuário :
    public void interactionUser() {


        // Apresentação e armazenando a escolhar do movie :
        System.out.printf("""
                
                Olá! Seja bem-vindo ao Plotly. O seu catálogo digital está pronto.
                
                Qual título você deseja explorar hoje?
                
                """);

        // Armazenando a escolher do user :
        responseUser = inputUser.nextLine();


    }


}
