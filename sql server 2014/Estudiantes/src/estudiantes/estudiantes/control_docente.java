/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author ANDRES
 */

public class control_docente {
    private sql sen;
    sql sensql;
   
    public control_docente() {
        sen = new sql();
        sensql = new sql();
    }

    
    /**
     *
     * @param Date
     */
    
    public boolean ingresar_docente(String id_carnet,   String Tipo_doc, String nombre, String apellido, String sexo)
    {               
        
            String datos[] = {id_carnet ,nombre,apellido,sexo,Tipo_doc};           
            return sensql.insertar(datos, "INSERT INTO [dbo].[docente] VALUES(?,?,?,?,?) ");
                                  
        
    }
    
     public Object[][] ingresa_codmateria(String nombre_materia)
     { 
       String[] columnas = {"nombre_materia"};
       Object[][] result = sen.datosTabla(columnas,"materia2", "select * from materia2 where nombre_materia='"+nombre_materia+"';");
       return result;
    }
    public Object[] combox(String tabla, String campo)
     {
        return sen.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
     }
       public Object[][] consulta_materia_notas( )
       {
        String[] columnas={"docente", "nombre_materia"};
        Object[][] resultado = sen.datosTabla(columnas, "docente", "select concat([nombre],' ',[apellido]) as docente    ,[nombre_materia] from docente");
        return resultado;
       }
}
