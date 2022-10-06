/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

/**
 *
 * @author theVa
 */
public class Practicando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto prueba = new Proyecto("Valen", 19, "JUAN");
        
        prueba.AgregarInvestigador("Valentin1", 192, "Programador");
        prueba.AgregarInvestigador("Valentin2", 192, "Medico");
        prueba.AgregarInvestigador("Valentin3", 192, "QA");
        
        prueba.getInvestigador(0).AgregarSubsidio(100, "xq si");
        prueba.getInvestigador(0).AgregarSubsidio(100, "xq si");
        prueba.getInvestigador(1).AgregarSubsidio(200, "xq si");
        prueba.getInvestigador(1).AgregarSubsidio(200, "xq si");
        prueba.getInvestigador(2).AgregarSubsidio(300, "xq si");
        prueba.getInvestigador(2).AgregarSubsidio(300, "xq si");
        prueba.Otorgar("Valentin3");
       
        System.out.println(prueba.toString());
        
        
    }
    
}
