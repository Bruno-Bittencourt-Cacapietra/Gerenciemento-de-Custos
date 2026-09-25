public class Funcionario extends Operador {
    private String matricula;
    private Departamento departamento;

    public Funcionario(String nome, String matricula, Departamento departamento){
        super(nome);
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public Departamento getDepartamento(){
        return this.departamento;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    @Override
    public String toString(){
        return super.toString() +"\nMatrícula: " + matricula + "\nDepartamento: " + departamento;
    }
}
