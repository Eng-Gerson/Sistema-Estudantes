public class Estudante{

    private String nome;
    private String numeroEstudante;
    private String curso;

    public Estudante() {
    }


    public Estudante(String nome, String numeroEstudante, String curso){
        this.nome = nome;
        this.numeroEstudante = numeroEstudante;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroEstudante() {
        return numeroEstudante;
    }

    public void setNumeroEstudante(String numeroEstudante) {
        this.numeroEstudante = numeroEstudante;
    }

    public String getCurso() {
        return curso;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", numeroEstudante='" + numeroEstudante + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}