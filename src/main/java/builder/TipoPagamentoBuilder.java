package builder;

public class TipoPagamentoBuilder {

    private TipoPagamento tipoPagamento;

    public TipoPagamentoBuilder() {
        tipoPagamento = new TipoPagamento();
    }

    public TipoPagamento build(){
        if (tipoPagamento.getId() == 0){
            throw new IllegalArgumentException("ID Inválido!");
        }
        if (tipoPagamento.getConta() == 0) {
            throw new IllegalArgumentException("Número da conta inválido!");
        }
        return tipoPagamento;
    }

    public TipoPagamentoBuilder setId(int id) {
        tipoPagamento.setId(id);
        return this;
    }

    public TipoPagamentoBuilder setNome(String nome) {
        tipoPagamento.setNome(nome);
        return this;
    }

    public TipoPagamentoBuilder setConta(double conta) {
        tipoPagamento.setConta(conta);
        return this;
    }

    public TipoPagamentoBuilder setDigitoConta(double digitoConta) {
        tipoPagamento.setDigitoConta(digitoConta);
        return this;
    }

    public TipoPagamentoBuilder setAgencia(double agencia) {
        tipoPagamento.setAgencia(agencia);
        return this;
    }

    public TipoPagamentoBuilder setNomeBanco(String nomeBanco) {
        tipoPagamento.setNomeBanco(nomeBanco);
        return this;
    }

    public TipoPagamentoBuilder setTipoConta(String tipoConta) {
        tipoPagamento.setTipoConta(tipoConta);
        return this;
    }

    public TipoPagamentoBuilder setNumMaxParcelas(int numMaxParcelas) {
        tipoPagamento.setNumMaxParcelas(numMaxParcelas);
        return this;
    }

    public TipoPagamentoBuilder setIntervaloParcelas(int intervaloParcelas) {
        tipoPagamento.setIntervaloParcelas(intervaloParcelas);
        return this;
    }

    public TipoPagamentoBuilder setTaxaBanco(double taxaBanco) {
        tipoPagamento.setTaxaBanco(taxaBanco);
        return this;
    }

    public TipoPagamentoBuilder setTaxaOperadora(double taxaOperadora) {
        tipoPagamento.setTaxaOperadora(taxaOperadora);
        return this;
    }

    public TipoPagamentoBuilder setMultaAtraso(double multaAtraso) {
        tipoPagamento.setMultaAtraso(multaAtraso);
        return this;
    }

    public TipoPagamentoBuilder setSituacaoConfirmacao(String situacaoConfirmacao) {
        tipoPagamento.setSituacaoConfirmacao(situacaoConfirmacao);
        return this;
    }
}
