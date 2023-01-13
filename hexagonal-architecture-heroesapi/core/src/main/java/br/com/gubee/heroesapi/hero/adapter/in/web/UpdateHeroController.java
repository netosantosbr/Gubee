package br.com.gubee.heroesapi.hero.adapter.in.web;

import br.com.gubee.heroesapi.hero.application.port.in.UpdateHeroUseCase;
import br.com.gubee.heroesapi.hero.domain.response.HeroResp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/heroes", produces = APPLICATION_JSON_VALUE)
public class UpdateHeroController {

    private final UpdateHeroUseCase updateHeroUseCase;

    @PutMapping("/{id}")
    public ResponseEntity<HeroResp> update(@PathVariable UUID id, @RequestBody HeroResp hero) {
        try {
            updateHeroUseCase.update(id, hero);
            return ResponseEntity.ok().build();
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
}
