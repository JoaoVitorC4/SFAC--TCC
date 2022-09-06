/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.UsuarioDAO;
import MODEL.UsuarioMODEL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Codinhoto
 */
public class UsuarioCTR {

    public List<UsuarioMODEL> ListaUsuarioBD() {
        List<UsuarioMODEL> ausuario = new ArrayList<>();
        UsuarioDAO objdao = new UsuarioDAO();
        ResultSet rsusuario = objdao.listaUsuario();

        try {
            while (rsusuario.next()) {
                UsuarioMODEL gs = new UsuarioMODEL();
                gs.setCod_usuario(rsusuario.getInt("cod_usuario"));
                gs.setNome_usuario(rsusuario.getString("nome_usuario"));
                gs.setSenha_usuario(rsusuario.getString("senha_usuario"));
                gs.setUsuario_perfil(rsusuario.getInt("usuario_perfil"));

                ausuario.add(gs);
            }
            return ausuario;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<UsuarioMODEL> pegarUsuarioBD(int cod_usuario) {
        List<UsuarioMODEL> ausuario = new ArrayList<>();
        UsuarioDAO objdao = new UsuarioDAO();
        ResultSet rsusuario = objdao.pegarIDUsuario(cod_usuario);

        try {
            while (rsusuario.next()) {
                UsuarioMODEL gs = new UsuarioMODEL();
                gs.setNome_usuario(rsusuario.getString("nome_usuario"));

                ausuario.add(gs);
            }
            return ausuario;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
  
        public void insereUSUARIOCTR(String nome_usuario, String senha_usuario, int usuario_perfil){
           
            UsuarioMODEL objusuario = new UsuarioMODEL();
         
            objusuario.setNome_usuario(nome_usuario);
            objusuario.setSenha_usuario(senha_usuario);
            objusuario.setUsuario_perfil(usuario_perfil);

            UsuarioDAO objdao = new UsuarioDAO();
      
            objdao.insereUsuario(objusuario);
    }
    
        public void AlteraUsuarioCTR(String nome_usuario, String senha_usuario, int usuario_perfil, int cod_usuario)
    {
        // Cria um objeto da MODEL
        UsuarioMODEL objusuario = new UsuarioMODEL();
        //Envia por meio de SET o valor de nome
        objusuario.setNome_usuario(nome_usuario);
        objusuario.setSenha_usuario(senha_usuario);
        objusuario.setUsuario_perfil(usuario_perfil);
        
        objusuario.setCod_usuario(cod_usuario);
        
        //Declara objeto da DAO
        UsuarioDAO objdao = new UsuarioDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraUsuario(objusuario);
    }
    

    public ResultSet PesquisarUSUARIOCTR(String nome_usuario){
        
        UsuarioDAO objtel = new UsuarioDAO();
        
        return objtel.PesquisarUsuario(nome_usuario);
    
    }

        
   public void ExcluiUsuarioCTR(int cod_usuario)
     {
         UsuarioMODEL objusuario = new UsuarioMODEL();
         
         objusuario.setCod_usuario(cod_usuario);
         
         UsuarioDAO objdao = new UsuarioDAO();
         objdao.ExcluirUsuario(objusuario);
     }
    
    
    
}
