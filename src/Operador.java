public  abstract class Operador {
    private String nome;

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
        if(nome.isBlank()){
            return "Não há um nome registrado";
        }


        char[] inicial = new char[nome.length()];
        inicial[0] = nome.charAt(0);
        int count = 1;
        for(int i = 1; i < nome.length(); i++){
            if(nome.charAt(i-1) == ' '){
                inicial[count] = nome.charAt(i);
                count++;
            }
        }

        String n = new String (inicial);
        return n;

    }
    
    public String toString(){
        return "Nome: " + nome + "/nIniciais: " + getIniciais();
    }

}
