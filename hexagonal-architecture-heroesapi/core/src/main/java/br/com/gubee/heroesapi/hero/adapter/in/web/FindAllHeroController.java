package br.com.gubee.heroesapi.hero.adapter.in.web;

import br.com.gubee.heroesapi.hero.application.port.in.FindAllHeroUseCase;
import br.com.gubee.heroesapi.hero.domain.response.HeroResp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/heroes", produces = APPLICATION_JSON_VALUE)
public class FindAllHeroController {

    private final FindAllHeroUseCase findAllHeroUseCase;

    @GetMapping("/findAll")
    public ResponseEntity<List<HeroResp>> findAll() {
        try{
            return ResponseEntity.ok().body(findAllHeroUseCase.findAll());
        } catch(Exception exception) {
            exception.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }
}
