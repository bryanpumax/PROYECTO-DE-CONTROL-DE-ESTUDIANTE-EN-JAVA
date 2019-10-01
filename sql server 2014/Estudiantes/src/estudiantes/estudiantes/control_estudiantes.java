/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author ANDRES
 */
public class control_estudiantes {
    
    sql sensql;
   
    public control_estudiantes() {
        
        sensql = new sql();
    }

    
    /**
     *
     * @param Date
     */
    
    public boolean ingresar_estudiante(String id_carnet, String documento, String Tipo_doc, String nombre, String apellido, String sexo)
    {               
        
            String datos[] = {id_carnet,documento,Tipo_doc,nombre,apellido,sexo};           
            return sensql.insertar(datos, "INSERT INTO [dbo].[estudiante] VALUES(?,?,?,?,?,?) ");
                                  
        
    }
    
    
    
}
