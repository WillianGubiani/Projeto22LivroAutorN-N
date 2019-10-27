/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor aut1 = new Autor("William Shakespeare", 1564, "william_shake@hotmail.com");
        Autor aut2 = new Autor("Monteiro Lobato", 1882, "monteiro_lobato@hotmail.com");
        Autor aut3 = new Autor("ailssdaui", 1990, "asdasdh@hotmail.com");
        
        Livro liv1 = new Livro("Sonet 116", "Scipione", 1609);
        Livro liv2 = new  Livro("O Saci", "Brasiliense", 1921);
        Livro liv3 = new Livro("Seila", "Duolingo", 2005);
        
        aut1.setObras(liv1);
        aut2.setObras(liv2);
        aut3.setObras(liv3);
        
        liv1.setEscritores(aut1);
        liv2.setEscritores(aut2);
        liv3.setEscritores(aut3);
        
        System.out.println("1");
        aut1.getObras();
        liv1.getEscritores();
        
        System.out.println("2");
                aut2.getObras();
        liv2.getEscritores();
        
        System.out.println("3");
        aut3.getObras();
        liv3.getEscritores();
    }
}
