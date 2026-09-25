public  abstract class Operador {
    protected String nome;

    public Operador(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getIniciais(){
        if(nome == null || nome.isBlank()){
            return "Não há um nome registrado";
        }

        String[] partes = this.nome.trim().split("\\s+");
        String iniciais = "";

        for(int i = 0; i < partes.length; i++){
                iniciais += partes[i].charAt(0);
        }
        return iniciais.toUpperCase();

    }
    @Override
    public String toString(){
        return "Nome: " + nome + "\nIniciais: " + getIniciais();
    }

}
