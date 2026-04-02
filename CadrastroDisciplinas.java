import java.util.ArrayList;

public class CadastroDisciplinas{
    
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void Cadastrar(Disciplina cadastro) {
        this.disciplinas.add(cadastro);
        System.out.println("Disciplina cadastrada com sucesso!");
    }

    public void listar() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina);
        }
    }
    public void inserirEsdantes(Disciplina disciplina, Estudantes estudante) {
        disciplina.getE().add(estudante);
        System.out.println("Estudante inserido com sucesso!");
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}