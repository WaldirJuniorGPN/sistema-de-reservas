package br.com.sistema_de_reserva.sistema_de_reserva.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco extends EntidadeBase {
    private String CEP;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
}
