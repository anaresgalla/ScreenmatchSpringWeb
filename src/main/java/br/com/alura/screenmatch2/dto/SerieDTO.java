package br.com.alura.screenmatch2.dto;

import br.com.alura.screenmatch2.model.Genero;

public record SerieDTO<elenco>(Long id,
                               String titulo,
                               Integer totalTemporadas,
                               Double avaliacao,
                               Genero genero,
                               String sinopse,
                               String ano,
                               String elenco,
                               String poster) {
}
