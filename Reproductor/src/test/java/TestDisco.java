
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class TestDisco {
    public static void main(String[] args) {
        ArrayList <Cancion> canciones =new ArrayList();
        
        Cancion cancion1=new Cancion(1, "Good Girl", 3.01);
        Cancion cancion2=new Cancion(2, "Im not cool", 2.58);
        Cancion cancion3=new Cancion(3, "Nunu nana",3.01);
        
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
         
        String nombre="Im not cool";
        Disco hyuna= new Disco(2021, nombre, "Hyuna", canciones);
        System.out.println(hyuna);
    }
    
}
