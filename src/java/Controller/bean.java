package Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Felipe Queiroz
 */
@ManagedBean(name="controle")
@RequestScoped
public class bean {
    /**
     * Creates a new instance of bean
     */
    public bean() {
        
    }
    //Constantes
    private static final String LOGIN = "adm";
    private static final String PASSWORD = "adm";
    
    //Var
    private String cpUsuario,cpSenha, status;
    private String rascunho, publicacao;
    
    //Metodos da Tela de Login 
    public String btEntrar(ActionEvent ae){
        if((getCpUsuario().equals(LOGIN))&&(getCpSenha().equals(PASSWORD))){
            setStatus("Acesso Liberado !!!");
            return "forum";
        }
        setStatus("Acesso Negado");
        return "index";
    }
    
    //Metodos do Forum
    
    public String btPublicar(ActionEvent ae){
        setPublicacao(getRascunho());
        setRascunho("");
        return "forum";
    }
    
    public String btAlterar(ActionEvent ae){
        setRascunho(getPublicacao());
        setPublicacao(null);
        return "forum";
    }
    
    public String btExcluir(ActionEvent ae){
        setPublicacao("");
        return "forum";
    }
    
    //Getters and Settters
    
    public String getCpUsuario() {
        return cpUsuario;
    }

    public void setCpUsuario(String cpUsuario) {
        this.cpUsuario = cpUsuario;
    }

    public String getCpSenha() {
        return cpSenha;
    }

    public void setCpSenha(String cpSenha) {
        this.cpSenha = cpSenha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRascunho() {
        return rascunho;
    }

    public void setRascunho(String rascunho) {
        this.rascunho = rascunho;
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }
    
    
    
}
