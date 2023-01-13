package br.com.gubee.heroesapi.hero.adapter.in.web;

import br.com.gubee.heroesapi.hero.application.port.in.CompareTwoHeroesUseCase;
import br.com.gubee.heroesapi.hero.domain.response.HeroCompareResp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/heroes", produces = APPLICATION_JSON_VALUE)
public class CompareTwoHeroesController {

    private final CompareTwoHeroesUseCase compareTwoHeroesUseCase;


    @GetMapping("/compare")
    public ResponseEntity<HeroCompareResp> compareTwoHeroes(@RequestParam UUID firstId, @RequestParam UUID secondId) {
        try {
            return ResponseEntity.ok().body(compareTwoHeroesUseCase.compareTwoHeroes(firstId, secondId));
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

}
