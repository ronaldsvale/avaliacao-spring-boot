package br.com.avaliacao.avaliacaoback.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.avaliacao.avaliacaoback.exception.ResourceNotFoundException;
import br.com.avaliacao.avaliacaoback.model.Contato;
import br.com.avaliacao.avaliacaoback.repository.ContatoRepository;
import br.com.avaliacao.avaliacaoback.service.interfaces.ContatoServiceInterface;





@Service
public class ContatoService implements ContatoServiceInterface {
	
	private ContatoRepository contatoRepository;
	
	@Autowired
	public ContatoService(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}
	
	@Override
	public Contato save(Contato contato) {
		return contatoRepository.save(contato);
	}

	@Override
	public Optional<Contato> getById(Long id) {
		return contatoRepository.findById(id);
	}

	@Override
	public List<Contato> getAll() {
		return contatoRepository.findAll();
	}

	@Override
	public Contato contato(Contato contato) {
		Optional<Contato> upContato = contatoRepository.findById(contato.getId());
		
		if(upContato.isPresent()) {
			Contato newContato = upContato.get();
			newContato.setPessoa(contato.getPessoa());
			newContato.setTipo(contato.getTipo());
			newContato.setInformacoes(contato.getInformacoes());
			return contatoRepository.save(newContato);
		}
		return contato;
	}

	@Override
	public void delete(Long id) {
		contatoRepository.deleteById(id);
	}

	@Override
	public Contato addInformacoes(Long id, String informacoes) {
		return contatoRepository.findById(id)
				.map(contato -> {
					contato.setInformacoes(contato.getInformacoes() + informacoes);
					return contatoRepository.save(contato);
				}).orElseThrow(() -> new ResourceNotFoundException("Contato não encontrado no ID: " + id));
	}

	

}
