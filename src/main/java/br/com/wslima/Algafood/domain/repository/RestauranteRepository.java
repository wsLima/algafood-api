package br.com.wslima.Algafood.domain.repository;

import br.com.wslima.Algafood.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> listar();
    Restaurante buscar(Long id);
    Restaurante salvar(Restaurante restaurante);
    void remover(Restaurante restaurante);

}
