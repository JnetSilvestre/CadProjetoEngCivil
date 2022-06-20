
package Controler;

import Servico.ProjServico;

public class Controlador {
    private static Controlador controlador = null;
    private ProjServico serv = new ProjServico();
    
    private Controlador(){
    
    }
    
    public static Controlador getControlador(){
        if(controlador == null){
            controlador = new Controlador();
        }
        return controlador;
    }
    
    public ProjServico getServico(){
        return serv;
    }
}
