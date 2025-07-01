package br.edu.utfpr.pb.pw45s.projetofinal.controller;

import br.edu.utfpr.pb.pw45s.projetofinal.model.Camada;
import br.edu.utfpr.pb.pw45s.projetofinal.utils.LayerData;
import br.edu.utfpr.pb.pw45s.projetofinal.utils.ScoreCalculator;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("score")
public class ScoreController {

    @PutMapping("block")
    public double getBlockScore(List<LayerData> camadas) {
        return ScoreCalculator.calcular(camadas);
    }
}
