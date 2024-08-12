package br.com.sistema_de_reserva.sistema_de_reserva.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Cliente extends Usuario {
    private LocalDate dataNascimento;
    private Endereco endereco;
}
