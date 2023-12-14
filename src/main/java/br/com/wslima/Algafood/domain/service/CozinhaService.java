package br.com.wslima.Algafood.domain.service;

import br.com.wslima.Algafood.domain.model.Cozinha;
import br.com.wslima.Algafood.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CozinhaService {

    @Autowired
    private CozinhaRepository repository;

    public Cozinha salvar(Cozinha cozinha){
        return repository.salvar(cozinha);
    }
}
