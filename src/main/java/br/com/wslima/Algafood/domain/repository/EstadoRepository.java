package br.com.wslima.Algafood.domain.repository;

import br.com.wslima.Algafood.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> listar();
    Estado buscar(Long id);
    Estado salvar(Estado estado);
    void remover(Estado estado);

}
