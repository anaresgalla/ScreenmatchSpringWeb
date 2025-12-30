package br.com.alura.screenmatch2.service;

import br.com.alura.screenmatch2.dto.SerieDTO;
import br.com.alura.screenmatch2.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SerieService {
    @Autowired
    private SerieRepository repositorio;

    public List<SerieDTO> obterTodasAsSeries(){
        return repositorio.findAll()
                .stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(),
                        s.getTotalTemporadas(), s.getAvaliacao(),
                        s.getGenero(), s.getSinopse(), s.getAno(),
                        s.getElenco(), s.getPoster()))
                .collect(Collectors.toList());
    }
}
