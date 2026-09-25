public enum Categoria {
    AQUISICAO_DE_BENS("Aquisição de Bens"),
    MANUTECAO_DE_BENS("Manutenção de Bens"),
    OUTROS_SERVICOS("Outros Serviços");

    private final String descricao;

    Categoria(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String toString(){
        return this.descricao;
    }
}
