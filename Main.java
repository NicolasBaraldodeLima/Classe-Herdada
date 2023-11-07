
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        // Criando pessoa

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nome Pessoa");
        pessoa.setDataNascimento(new Date());
        pessoa.setCpf("123.456.789-00");
        pessoa.setEndereco("Endereço Pessoa");
        pessoa.setTelefone("123456789");
        List<String> cursosProfessor = new ArrayList<>();
        cursosProfessor.add("Curso X");
        cursosProfessor.add("Cursos Y");



    }




}
