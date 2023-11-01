package br.com.avaliacao.avaliacaoback.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.avaliacao.avaliacaoback.model.Pessoa;
import br.com.avaliacao.avaliacaoback.repository.PessoaRepository;
import br.com.avaliacao.avaliacaoback.service.interfaces.PessoaServiceInterface;



@Service
public class PessoaService implements PessoaServiceInterface {

	private PessoaRepository pessoaRepository;
	
	@Autowired
	public PessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	@Override
	public Pessoa save(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@Override
	public Optional<Pessoa> getById(Long id) {
		return pessoaRepository.findById(id);
	}

	@Override
	public List<Pessoa> getAll() {
		return pessoaRepository.findAll();
	}

	@Override
	public Pessoa update(Pessoa pessoa) {
		
		Optional<Pessoa> upPessoa = pessoaRepository.findById(pessoa.getId());
		
		
		if(upPessoa.isPresent()) {
			Pessoa newPessoa = upPessoa.get();
			newPessoa.setNome(pessoa.getNome());
			newPessoa.setEndereco(pessoa.getEndereco());
			newPessoa.setCep(pessoa.getCep());
			newPessoa.setCidade(pessoa.getCidade());
			newPessoa.setUf(pessoa.getUf());
			return pessoaRepository.save(newPessoa);
		}
		return pessoa;
	}

	@Override
	public void delete(Long id) {
		pessoaRepository.deleteById(id);
	}

	@Override
	public Pessoa addNome(Long id, String nome) {
		return null;
	}

	@Override
	public Pessoa delNome(Long id, String nome) {
		return null;
	}

	@Override
	public Pessoa addEndereco(Long id, String endereco) {
		return null;
	}

	@Override
	public Pessoa delEndereco(Long id, String endereco) {
		return null;
	}

	@Override
	public Pessoa addCep(Long id, String cep) {
		return null;
	}

	@Override
	public Pessoa delCep(Long id, String cep) {
		return null;
	}

	@Override
	public Pessoa addCidade(Long id, String cidade) {
		return null;
	}

	@Override
	public Pessoa delCidade(Long id, String cidade) {
		return null;
	}

	@Override
	public Pessoa addUf(Long id, String uf) {
		return null;
	}

	@Override
	public Pessoa delUf(Long id, String uf) {
		return null;
	}

}

