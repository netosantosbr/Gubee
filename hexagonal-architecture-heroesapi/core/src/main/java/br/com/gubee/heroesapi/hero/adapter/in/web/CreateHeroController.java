package br.com.gubee.heroesapi.hero.adapter.in.web;

import br.com.gubee.heroesapi.hero.application.port.in.CreateHeroUseCase;
import br.com.gubee.heroesapi.hero.domain.request.CreateHeroRequest;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

import static java.lang.String.format;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/heroes", produces = APPLICATION_JSON_VALUE)
public class CreateHeroController {

    private final CreateHeroUseCase createHeroUseCase;

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@Validated @RequestBody CreateHeroRequest createHeroRequest) {
        UUID id = createHeroUseCase.create(createHeroRequest);
        return ResponseEntity.created(URI.create(format("/api/v1/heroes/%s", id))).build();
    }
}
