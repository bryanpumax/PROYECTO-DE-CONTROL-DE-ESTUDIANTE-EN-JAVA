/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author ANDRES
 */
public class control_matricula {
    private sql sen;
    private String id_carnet;

    public String getId_carnet() {
        return id_carnet;
    }

    public void setId_carnet(String id_carnet) {
        this.id_carnet = id_carnet;
    }
    
    public control_matricula()
    {
    
        sen = new sql();
}
    
    public String ingresa_nombre_estudiante()
     { 
       String result;
       result = sen.datos_string("nombre", "select nombre from estudiante where id_carnet='"+this.id_carnet+"';");
       return result;
    }
    public String ingresa_apellido_estudiante()
     { 
       String result;
       result = sen.datos_string("apellido", "select apellido from estudiante where id_carnet='"+this.id_carnet+"';");
       return result;
    }
    
    public Object[][] ingresa_codmateria(String nombre_materia)
     { 
       String[] columnas = {"nombre_materia"};
       Object[][] result = sen.datosTabla(columnas,"materia2", "select * from materia2 where nombre_materia='"+nombre_materia+"';");
       return result;
    }
    
    public String ingresa_carnet_estudiante()
     { 
       String result;
       result = sen.datos_string("id_carnet", "select id_carnet from estudiante where id_carnet='"+this.id_carnet+"';");
       return result;
    }
    
    public Object[] combox(String tabla, String campo)
     {
        return sen.poblar_combox(tabla, campo, "select "+campo+" from "+tabla+";");
     }
    
    public boolean existe_estudiante( String cod)
     {
         
        this.id_carnet = cod;
        return sen.existe(cod, " from estudiante where id_carnet='"+cod+"';");
      
    }
    
    public Boolean registrar_matxest(String cod_materia)
     {
        String[] datos = {id_carnet, cod_materia};
        return sen.insertar(datos, "insert into materiaxestudiante2(cod_carnet,cod_materia ) values(?,?);");
    }
    
    public Object[][] datos_matricula (String id_estudiante)
     {
        String[] columnas={"cod_carnet","nombre_materia"};
        Object[][] resultado = sen.datosTabla(columnas, "materiaxestudiante2", "select * from materiaxestudiante2, materia2 where  nombre_materia=cod_materia and cod_carnet='"+id_estudiante+"';");
        return resultado;
      }
}
     

