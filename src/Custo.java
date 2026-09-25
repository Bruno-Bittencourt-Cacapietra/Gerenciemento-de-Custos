public class Custo {
    private double valor;
    private String descricao;
    private int dia;
    private int mes;
    private int ano;
    private Categoria categoria;
    private Departamento departamento;
    private Funcionario funcionarioLogado;

    public Custo(double valor, String descricao, int dia, int mes, int ano, Categoria categoria, Departamento departamento, Funcionario funcionarioLogado){
        this.valor = valor;
        this.descricao = descricao;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.categoria = categoria;
        this.departamento = departamento;
        this.funcionarioLogado = funcionarioLogado;
    }

    public double getValor(){
        return this.valor;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    public Departamento getDepartamento(){
        return this.departamento;
    }

    public Funcionario getFuncionario(){
        return this.funcionarioLogado;
    }

    public String getData(){
        return dia + "/" + mes +"/" + ano;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    public void setFuncionario(Funcionario funcionarioLogado){
        this.funcionarioLogado = funcionarioLogado;
    }
    @Override
    public String toString(){
        return "Valor: " + valor + "\nDescrição: " + descricao + "\nData: " + getData() + "\nCategoria: " + categoria + "\nDepartamento: " + departamento + "\nCadastrado por: " + funcionarioLogado.getNome();
    }


}
