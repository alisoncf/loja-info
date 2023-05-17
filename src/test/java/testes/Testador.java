
package testes;

import java.sql.ResultSet;
import model.Usuario;
import org.junit.Test;


//import org.junit.Test;
import util.ConectaBD;


/**
 *
 * @author Administrador
 */
public class Testador {

    @Test
    public void testaUsuario(){
        Usuario u = new Usuario();
        u.setEmail("joao@gmail.com");
        u.setSenha("xxxx");
    }
   
//   @Test
//   public void testaBanco() throws Exception{
//       ConectaBD conn = new ConectaBD();
//       ResultSet rs =  conn.getResultset("select 1>0");
//       System.out.println(rs.getString(0));
//   } 
}
