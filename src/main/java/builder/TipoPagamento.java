package builder;

public class TipoPagamento {

    private int id;
    private String nome;
    private double conta;
    private double digitoConta;
    private double agencia;
    private String nomeBanco;
    private String tipoConta;
    private int numMaxParcelas;
    private int intervaloParcelas;
    private double taxaBanco;
    private double taxaOperadora;
    private double multaAtraso;
    private String situacaoConfirmacao;

    public TipoPagamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public double getDigitoConta() { return digitoConta; }

    public void setDigitoConta(double digitoConta) { this.digitoConta = digitoConta; }

    public double getAgencia() {
        return agencia;
    }

    public void setAgencia(double agencia) { this.agencia = agencia; }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumMaxParcelas() {
        return numMaxParcelas;
    }

    public void setNumMaxParcelas(int numMaxParcelas) {
        this.numMaxParcelas = numMaxParcelas;
    }

    public int getIntervaloParcelas() {
        return intervaloParcelas;
    }

    public void setIntervaloParcelas(int intervaloParcelas) {
        this.intervaloParcelas = intervaloParcelas;
    }

    public double getTaxaBanco() {
        return taxaBanco;
    }

    public void setTaxaBanco(double taxaBanco) {
        this.taxaBanco = taxaBanco;
    }

    public double getTaxaOperadora() {
        return taxaOperadora;
    }

    public void  setTaxaOperadora(double taxaOperadora) {
        this.taxaOperadora = taxaOperadora;
    }

    public double getMultaAtraso() {
        return multaAtraso;
    }

    public void setMultaAtraso(double multaAtraso) {
        this.multaAtraso = multaAtraso;
    }

    public String getSituacaoConfirmacao() {
        return situacaoConfirmacao;
    }

    public void setSituacaoConfirmacao(String situacaoConfirmacao) {
        this.situacaoConfirmacao = situacaoConfirmacao;
    }
}
