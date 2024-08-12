package br.com.sistema_de_reserva.sistema_de_reserva.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Restaurante extends EntidadeBase {
    private String nome;
    private String descricao;
    private String localizacao;
    private int capacidade;
    private TipoCozinha tipoCozinha;
    private Proprietario proprietario;
}
