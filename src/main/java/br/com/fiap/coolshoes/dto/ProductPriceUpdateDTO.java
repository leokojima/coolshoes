package br.com.fiap.coolshoes.dto;

import java.math.BigDecimal;

public class ProductPriceUpdateDTO {

    private BigDecimal Preco;

    public BigDecimal getPreco() {
        return this.Preco;
    }

    public void setPreco(BigDecimal Preco) {
        this.Preco = Preco;
    }

}
