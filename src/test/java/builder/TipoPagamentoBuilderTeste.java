package builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TipoPagamentoBuilderTeste {
    @Test
    public void deveRetornarExcecaoParaTipoPagamentoSemID() {
        try {
            TipoPagamentoBuilder tipoPagamentoBuilder = new TipoPagamentoBuilder();
            TipoPagamento tipoPagamento = tipoPagamentoBuilder
                    .setNomeBanco("Banco do Brasil")
                    .setAgencia(825)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("ID Inválido!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaTipoPagamentoSemConta() {
        try {
            TipoPagamentoBuilder tipoPagamentoBuilder = new TipoPagamentoBuilder();
            TipoPagamento tipoPagamento = tipoPagamentoBuilder
                    .setId(1)
                    .setNomeBanco("Banco do Brasil")
                    .setAgencia(825)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número da conta inválido!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarTipoPagamentoValido() {
        TipoPagamentoBuilder tipoPagamentoBuilder = new TipoPagamentoBuilder();
        TipoPagamento tipoPagamento = tipoPagamentoBuilder
                .setId(1)
                .setNomeBanco("Banco do Brasil")
                .setAgencia(825)
                .setConta(34567)
                .setDigitoConta(8)
                .build();
        assertNotNull(tipoPagamento);
    }
}
