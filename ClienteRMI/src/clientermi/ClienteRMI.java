/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientermi;

/**
 *
 * @author sistemas
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interface.RMIDAO;

public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Registry registro=LocateRegistry.getRegistry("127.0.0.1",7777);
            RMIDAO interfaz = (RMIDAO) registro.lookup("RemotoRMI");
            String suma;
            suma = interfaz.sumar(10, 5);
            System.out.println(suma);
            
            String resta;
            resta = interfaz.restar(10, 5);
            System.out.println(resta);
            
            String multiplicar;
            multiplicar = interfaz.multiplicar(10, 5);
            System.out.println(multiplicar);
            
            String dividir;
            dividir = interfaz.dividir(10, 5);
            System.out.println(dividir);
        }catch(Exception e){
            System.out.println(""+e);
        }
        

                

        

    }
    
}
