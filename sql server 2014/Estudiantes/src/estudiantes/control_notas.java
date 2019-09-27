/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author ANDRES
 */
public class control_notas {
    
      private sql sen;
    
    public control_notas()
    {
      sen = new sql();  
    }
    
    
    
    public Object[][] consulta_materia_notas(String id)
       {
        String[] columnas={"cod_carnet", "nombre_materia"};
        Object[][] resultado = sen.datosTabla(columnas, "materiaxestudiante2", "select * from materiaxestudiante2, materia2 where cod_materia=nombre_materia  and cod_carnet='"+id+"';");
        return resultado;
       }
    
    public boolean ingresar_notas(String cod_carnetnota, String cod_materianota, Double nota)
    {               
           
            String datos[] = {cod_carnetnota, cod_materianota, Double.toString(nota)};           
            return sen.insertar(datos, "insert into nota2(cod_carnetnota, cod_materianota, nota) values(?,?,?)");
                                  
        
    }
    
}
