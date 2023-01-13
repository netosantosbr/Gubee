package br.com.gubee.heroesapi.hero.adapter.in.web;

import br.com.gubee.heroesapi.hero.application.port.in.FindHeroByIdUseCase;

import br.com.gubee.heroesapi.hero.domain.response.HeroResp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/heroes", produces = APPLICATION_JSON_VALUE)
public class FindHeroByIdController {

    private final FindHeroByIdUseCase findHeroByIdUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<HeroResp> findById(@PathVariable UUID id) {
        try {
            return ResponseEntity.ok().body(findHeroByIdUseCase.findById(id));
        } catch(NoSuchElementException exception) {
            exception.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
}
