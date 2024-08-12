package br.com.sistema_de_reserva.sistema_de_reserva.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario extends EntidadeBase {
    private String nome;
    private String email;
    private String password;
    private String telefone;
}
