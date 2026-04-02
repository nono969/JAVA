public class Disciplina {
    private int cod;
    private String nome;
    private String professor;
    private String CargaHoraria;
    Estudantes e;

    public Disciplina(int cod, String nome, String professor, String CargaHoraria) {
        this.cod = cod;
        this.nome = nome;
        this.professor = professor;
        this.CargaHoraria = CargaHoraria;
    }   

public int getCod() {
    return cod;
}
public void setCod(int cod) {
    this.cod = cod;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getProfessor() {
    return professor;
}
public void setProfessor(String professor) {
    this.professor = professor;
}
public String getCargaHoraria() {
    return CargaHoraria;
}
public void setCargaHoraria(String CargaHoraria) {
    this.CargaHoraria = CargaHoraria;
}
public Estudantes getE() {
    return e;
}
public void setE(Estudantes e) {
    this.e = e;
}
public String toString() {
    return "Disciplina [cod=" + cod + ", nome=" + nome + ", professor=" + professor + ", CargaHoraria="
            + CargaHoraria + "]";
}
}