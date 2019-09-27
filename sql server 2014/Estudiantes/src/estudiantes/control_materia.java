/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author ANDRES
 */
public class control_materia {
    
    sql sqlmat;
   
    public control_materia() {
        
        sqlmat = new sql();
    }

    
    /**
     *
     * @param Date
     */
    
    public boolean ingresar_materia(String nombre_materia, int intensidad_horaria)
    {               
        
            String datos[] = {nombre_materia, Integer.toString(intensidad_horaria)};           
            return sqlmat.insertar(datos, "insert into materia2(nombre_materia, intensidad_horaria) values(?,?)");
                                  
        
    }
    
}
