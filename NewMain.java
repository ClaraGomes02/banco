/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author clara
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBanco p1 = new ContaBanco(0, false);
        
        p1.setNumConta(1111);
        p1.setDono("Clara");
        p1.abrirConta("CC");
        
        p1.estadoAtual();
        
    }
    
}
