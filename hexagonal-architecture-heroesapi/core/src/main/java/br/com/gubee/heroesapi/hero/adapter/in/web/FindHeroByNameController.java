package br.com.gubee.heroesapi.hero.adapter.in.web;

import br.com.gubee.heroesapi.hero.application.port.in.FindHeroByNameUseCase;
import br.com.gubee.heroesapi.hero.domain.response.HeroResp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api/v1/heroes")
public class FindHeroByNameController {

    private final FindHeroByNameUseCase findHeroByNameUseCase;

    @GetMapping("")
    public ResponseEntity<List<HeroResp>> findByName(@RequestParam String name) {
        try {
            return ResponseEntity.ok().body(findHeroByNameUseCase.findByName(name));
        } catch(Exception exception) {
            exception.printStackTrace();
            return ResponseEntity.ok().build();
        }
    }
}
