package br.com.avaliacao.avaliacaoback.service.interfaces;

import java.util.List;
import java.util.Optional;

import br.com.avaliacao.avaliacaoback.model.Contato;


public interface ContatoServiceInterface {
	Contato contato(Contato contato);
	Contato save(Contato contato);
	Optional<Contato> getById(Long id);
	List<Contato> getAll();
	Contato update(Contato contato);
	void delete(Long id);
	Contato addTipo(Long id, String tipo);
	Contato delTipo(Long id, String tipo);
	Contato addInformacoes(Long id, String informacoes);
	Contato delInformacoes(Long id, String informacoes);
	
}
