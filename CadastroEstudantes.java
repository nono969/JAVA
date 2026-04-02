import java.util.ArrayList;

public class CadastroEstudantes {
    
    private ArrayList<Estudantes> estudantes = new ArrayList<>();

    public void Cadastrar(Estudantes cadastro) {
        this.estudantes.add(cadastro);
        System.out.println("Estudante cadastrado com sucesso!");
    }

    public void listar() {
        for (Estudantes estudante : estudantes) {
            System.out.println(estudante);
        }
    }
}