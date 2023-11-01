package br.com.avaliacao.avaliacaoback.service.interfaces;

import java.util.List;
import java.util.Optional;

import br.com.avaliacao.avaliacaoback.model.Pessoa;


public interface PessoaServiceInterface {
	Pessoa save(Pessoa pessoa);
	Optional<Pessoa> getById(Long id);
	List<Pessoa> getAll();
	Pessoa update(Pessoa pessoa);
	void delete(Long id);
	Pessoa addNome(Long id, String nome);
	Pessoa delNome(Long id, String nome);
	Pessoa addEndereco(Long id, String endereco);
	Pessoa delEndereco(Long id, String endereco);
	Pessoa addCep(Long id, String cep);
	Pessoa delCep(Long id, String cep);
	Pessoa addCidade(Long id, String cidade);
	Pessoa delCidade(Long id, String cidade);
	Pessoa addUf(Long id, String uf);
	Pessoa delUf(Long id, String uf);
}
