package br.com.sistema_de_reserva.sistema_de_reserva.domain.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class EntidadeBase {
    private UUID id;
    private LocalDateTime dataHoraInicial;
    private LocalDateTime dataHoraAtualizacao;
}
