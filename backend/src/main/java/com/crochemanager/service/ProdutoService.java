package com.crochemanager.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.crochemanager.model.Produto;
import com.crochemanager.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        return repository.save(produto);
    }


    public List<Produto> listarTodos() {
        return repository.findAll();
    }
}
