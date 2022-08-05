
package ltc_project_4_by_hugo_queiros;


public class Aluno {
    
    int aluno_id, nota;
    String nome, curso;
    
    public Aluno(){
        
    }

    public Aluno(int aluno_id, String nome, String curso, int nota) {
        this.aluno_id = aluno_id;
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public int getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(int aluno_id) {
        this.aluno_id = aluno_id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return ", nome= " + nome + ", curso= " + curso +", classificacao=" + nota + "}";
    }

    
}
