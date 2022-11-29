/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;


import DAO.PessoaDAO;
import MODEL.PessoaMODEL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class PessoaCTR {
 
     public void inserePESSOACTR( String nome_pessoa ,String endereco_pessoa, String bairro_pessoa, String numero_pessoa,
    int cidade_pessoa,String cep_pessoa, String telefone_pessoa, String cpf_pessoa, 
    int grupo_pessoa, int usuario_pessoa){
         PessoaMODEL objpessoa = new PessoaMODEL();
         
     objpessoa.setNome_pessoa(nome_pessoa);
     objpessoa.setEndereco_pessoa(endereco_pessoa);
     objpessoa.setBairro_pessoa(bairro_pessoa);
     objpessoa.setNumero_pessoa(numero_pessoa);
     objpessoa.setCidade_pessoa(cidade_pessoa);
     objpessoa.setCep_pessoa(cep_pessoa);
     objpessoa.setTelefone_pessoa(telefone_pessoa);
     objpessoa.setCpf_pessoa(cpf_pessoa);
     objpessoa.setGrupo_pessoa(grupo_pessoa);
     //objpessoa.setBiometria_pessoa(biometria_pessoa);
     objpessoa.setUsuario_pessoa(usuario_pessoa);
     

         PessoaDAO objdao = new PessoaDAO();
      
        objdao.inserePessoa(objpessoa);
    }
    
     
     public void AlteraPessoaCTR(String nome_pessoa ,String endereco_pessoa, String bairro_pessoa, String numero_pessoa,
    int cidade_pessoa,String cep_pessoa, String telefone_pessoa, String cpf_pessoa, 
    int grupo_pessoa, int usuario_pessoa,int cod_pessoa)
    {
        // Cria um objeto da MODEL
        PessoaMODEL objpessoa = new PessoaMODEL();
        //Envia por meio de SET o valor de nome
     objpessoa.setNome_pessoa(nome_pessoa);
     objpessoa.setEndereco_pessoa(endereco_pessoa);
     objpessoa.setBairro_pessoa(bairro_pessoa);
     objpessoa.setNumero_pessoa(numero_pessoa);
     objpessoa.setCidade_pessoa(cidade_pessoa);
     objpessoa.setCep_pessoa(cep_pessoa);
     objpessoa.setTelefone_pessoa(telefone_pessoa);
     objpessoa.setCpf_pessoa(cpf_pessoa);
     objpessoa.setGrupo_pessoa(grupo_pessoa);
     //objpessoa.setBiometria_pessoa(biometria_pessoa);
     objpessoa.setUsuario_pessoa(usuario_pessoa);
     
     objpessoa.setCod_pessoa(cod_pessoa);
        
        //Declara objeto da DAO
        PessoaDAO objdao = new PessoaDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraPessoa(objpessoa);
    }
    

    public ResultSet PesquisarPESSOACTR(String nome){
        
        PessoaDAO objtel = new PessoaDAO();
        
        return objtel.PesquisarPessoa(nome);
    
    }
    
public List<PessoaMODEL> pegarPessoaBDPeloCPF(String cpf_pessoa) {
        List<PessoaMODEL> apessoa = new ArrayList<>();
        PessoaDAO objdao = new PessoaDAO();
        ResultSet rspessoa = objdao.pegarIDPessoaPeloCPF(cpf_pessoa);

        try {
            while (rspessoa.next()) {
                PessoaMODEL gs = new PessoaMODEL();
                gs.setCod_pessoa(rspessoa.getInt("cod_pessoa"));
                gs.setNome_pessoa(rspessoa.getString("nome_pessoa"));
                

                apessoa.add(gs);
            }
            return apessoa;

        } catch (SQLException ex) {
            Logger.getLogger(EstadoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
       
    
    
            public List<PessoaMODEL> PegarPessoaBD(int id_pessoa)
    {
        List<PessoaMODEL> aestado = new ArrayList<>();
        PessoaDAO objdao = new PessoaDAO();
        ResultSet rsestado = objdao.pegarIDPessoa(id_pessoa);
        
        try {
            while(rsestado.next())
            {
                PessoaMODEL gs = new PessoaMODEL();
                gs.setNome_pessoa(rsestado.getString("nome_pessoa"));
                
                aestado.add(gs);
            }    
            
            return aestado;
                } catch (SQLException ex) {
            Logger.getLogger(PessoaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
               
    }
     public void ExcluiUsuarioCTR(int cod_pessoa)
     {
         PessoaMODEL objpessoa = new PessoaMODEL();
         
         objpessoa.setCod_pessoa(cod_pessoa);
         
         PessoaDAO objdao = new PessoaDAO();
         objdao.ExcluirPessoa(objpessoa);
     }
    
    
     
     
     
     
     public List<PessoaMODEL> ListaPessoaBD() {
        List<PessoaMODEL> apessoa = new ArrayList<>();
        PessoaDAO objdao = new PessoaDAO();
        ResultSet rspessoa = objdao.listaPessoa();

        try {
            while (rspessoa.next()) {
                PessoaMODEL gs = new PessoaMODEL();
                gs.setCod_pessoa(rspessoa.getInt("cod_pessoa"));
                gs.setNome_pessoa(rspessoa.getString("nome_pessoa"));
                gs.setGrupo_pessoa(rspessoa.getInt("grupo_pessoa"));
                apessoa.add(gs);
            }
            return apessoa;

        } catch (SQLException ex) {
            Logger.getLogger(EstadoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<PessoaMODEL> pegarPessoaBD(int cod_pessoa) {
        List<PessoaMODEL> apessoa = new ArrayList<>();
        PessoaDAO objdao = new PessoaDAO();
        ResultSet rspessoa = objdao.pegarIDPessoa(cod_pessoa);

        try {
            while (rspessoa.next()) {
                PessoaMODEL gs = new PessoaMODEL();
                gs.setNome_pessoa(rspessoa.getString("nome_pessoa"));

                apessoa.add(gs);
            }
            return apessoa;

        } catch (SQLException ex) {
            Logger.getLogger(EstadoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
     
     
     
     
    
    
}
