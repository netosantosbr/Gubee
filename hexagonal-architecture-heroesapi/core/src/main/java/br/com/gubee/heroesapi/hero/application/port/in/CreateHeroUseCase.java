package br.com.gubee.heroesapi.hero.application.port.in;


import br.com.gubee.heroesapi.hero.domain.request.CreateHeroRequest;

import java.util.UUID;

public interface CreateHeroUseCase {
    UUID create(CreateHeroRequest createHeroRequest);
}
