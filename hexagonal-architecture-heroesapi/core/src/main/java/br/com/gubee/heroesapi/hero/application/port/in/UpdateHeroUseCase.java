package br.com.gubee.heroesapi.hero.application.port.in;


import br.com.gubee.heroesapi.hero.domain.response.HeroResp;

import java.util.UUID;

public interface UpdateHeroUseCase {
    UUID update(UUID id, HeroResp hero);
}
