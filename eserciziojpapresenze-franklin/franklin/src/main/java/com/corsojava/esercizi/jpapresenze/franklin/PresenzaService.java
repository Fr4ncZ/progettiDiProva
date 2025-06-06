package com.corsojava.esercizi.jpapresenze.franklin;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PresenzaService {
    private final PresenzaRepository presenzaRepository;

    public PresenzaService(PresenzaRepository presenzaRepository) {
        this.presenzaRepository = presenzaRepository;
    }

    public Presenza registraPresenza(Presenza p) {
        p.setId(null);
        return presenzaRepository.save(p);
    }

    public Presenza giustificaAssenza(Long idStudente, LocalDate data, String nota) {
        List<Presenza> assenze = presenzaRepository.findByIdStudenteAndDataAndStato(idStudente, data, "ASSENTE");
        if (assenze.isEmpty()) return null;
        Presenza assenza = assenze.get(0);
        assenza.setNota(nota);
        return presenzaRepository.save(assenza);
    }

    public long contaAssenze(Long idStudente, LocalDate dataInizio, LocalDate dataFine) {
        return presenzaRepository.findByIdStudenteAndDataBetweenAndStato(idStudente, dataInizio, dataFine, "ASSENTE").size();
    }

    public List<Long> studentiConTroppeAssenze(LocalDate dataInizio, LocalDate dataFine, int soglia) {
        List<Presenza> tutteAssenze = presenzaRepository.findByDataBetweenAndStato(dataInizio, dataFine, "ASSENTE");
        Map<Long, Integer> conteggio = new HashMap<>();
        for (Presenza p : tutteAssenze) {
            conteggio.put(p.getIdStudente(), conteggio.getOrDefault(p.getIdStudente(), 0) + 1);
        }
        List<Long> risultato = new ArrayList<>();
        for (Map.Entry<Long, Integer> entry : conteggio.entrySet()) {
            if (entry.getValue() > soglia) risultato.add(entry.getKey());
        }
        return risultato;
    }
}
