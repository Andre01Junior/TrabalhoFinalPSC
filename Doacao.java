class Doacao {
    private String tipoDoacao;
    private int quantidade;
    private String data;

    public Doacao(String tipoDoacao, int quantidade, String data) {
        this.tipoDoacao = tipoDoacao;
        this.quantidade = quantidade;
        this.data = data;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getData() {
        return data;
    }
}