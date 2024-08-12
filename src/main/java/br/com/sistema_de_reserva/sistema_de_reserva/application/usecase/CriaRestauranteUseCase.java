package br.com.sistema_de_reserva.sistema_de_reserva.application.usecase;

import br.com.sistema_de_reserva.sistema_de_reserva.domain.model.Restaurante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CriaRestauranteUseCase {

    private final RestauranteRepository restauranteRepository;

    public Restaurante criaRestaurante(Restaurante restaurante) {
        // Regras de negócio para criação de um restaurante

        return restauranteRepository.save(restaurante);
    }
}
