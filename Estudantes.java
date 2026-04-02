public class Estudantes{
    private int matricula;
    private String nome;
    private int idade;
    private String contato;
    Disciplina d;

public Estudantes(int matricula, String nome, int idade, String contato, Disciplina d){
    this.matricula = matricula;
    this.nome = nome;
    this.idade = idade;
    this.contato = contato;
    this.d = d;
}
public int getMatricula() {
    return matricula;
}
public void setMatricula(int matricula) {
    this.matricula = matricula;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public String getContato() {
    return contato;
}
public void setContato(String contato) {
    this.contato = contato;
}
public Disciplina getD() {
    return d;
}
public void setD(Disciplina d) {
    this.d = d;
}
public void imprimir(){
    System.out.println("Matricula: " + matricula);
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Contato: " + contato);
    d.imprimir();
}
}