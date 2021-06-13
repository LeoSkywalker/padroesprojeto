package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TipoPagamentoSingletonTeste {

    @Test
    public void deveRetornarNomeBanco(){
        TipoPagamento.getInstance().setNomeBanco("Banco do Brasil");
        assertEquals("Banco do Brasil", TipoPagamento.getInstance().getNomeBanco());
    }

    @Test
    public void deveRetornarTipoConta(){
        TipoPagamento.getInstance().setTipoConta("Conta Poupanca");
        assertEquals("Conta Poupanca", TipoPagamento.getInstance().getTipoConta());

    }
}
