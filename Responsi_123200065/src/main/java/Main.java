/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ViewNilai vm = new ViewNilai();
        ModelNilai mm = new ModelNilai();
        ControllerNilai cm = new ControllerNilai(mm, vm);
        
    }
    
}