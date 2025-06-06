package com.corsojava.esercizi.jpapresenze.franklin;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/presenza")
public class PresenzaController {
    private final PresenzaService service;

    public PresenzaController(PresenzaService service) {
        this.service = service;
    }

    @PostMapping("/")
    public Presenza registraPresenza(@RequestBody Presenza p) {
        return service.registraPresenza(p);
    }

    @PostMapping("/giustifica")
    public Presenza giustificaAssenza(@RequestParam Long idStudente, @RequestParam String data, @RequestParam String nota) {
        return service.giustificaAssenza(idStudente, LocalDate.parse(data), nota);
    }

    @GetMapping("/assenze")
    public Long contaAssenze(@RequestParam Long idStudente, @RequestParam String dataInizio, @RequestParam String dataFine) {
        return service.contaAssenze(idStudente, LocalDate.parse(dataInizio), LocalDate.parse(dataFine));
    }

    @GetMapping("/troppe-assenze")
    public List<Long> studentiConTroppeAssenze(@RequestParam String dataInizio, @RequestParam String dataFine, @RequestParam int soglia) {
        return service.studentiConTroppeAssenze(LocalDate.parse(dataInizio), LocalDate.parse(dataFine), soglia);
    }
}