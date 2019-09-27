/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author bryan
 */
public class control_resultados {
      private sql sen;
      
       public control_resultados()
               
    {
      sen = new sql();  
    }
         public Object[][] consulta_promedio(String id)
       {
           
        String[] columnas={"promedio"};
         
         
        Object[][] resultado = sen.datosTabla(columnas,"nota2","SELECT concat(cod_materianota,':',SUM([nota])/3) as promedio   FROM [estudiantes].[dbo].[nota2]  where cod_carnetnota='"+id+"'   group by cod_carnetnota,cod_materianota");
        
        
        return resultado; 
       }
    
}
