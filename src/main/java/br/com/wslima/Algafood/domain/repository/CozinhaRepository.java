package br.com.wslima.Algafood.domain.repository;

import br.com.wslima.Algafood.domain.model.Cozinha;

import java.util.List;



public interface CozinhaRepository {

    List<Cozinha> listar();
    Cozinha buscar(Long id);
    Cozinha salvar(Cozinha cozinha);
    void remover(Cozinha cozinha);

}