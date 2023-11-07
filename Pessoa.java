
import java.util.Date;

public class Pessoa {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String endereco;
    private String telefone;


    // declaração de métodos getters e setters;

 public void setNome(String nome) {
     this.nome = nome;
 }

 public Date getDataNascimento() {
     return dataNascimento;
 }

 public void setDataNascimento(Date dataNascimento) {
     this.dataNascimento = dataNascimento;
 }

 public void setCpf(String cpf) {
     this.cpf = cpf;
 }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}


