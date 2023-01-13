package br.com.gubee.heroesapi.hero.application.port.out;

import br.com.gubee.heroesapi.hero.domain.response.HeroResp;

import java.util.UUID;

public interface FindHeroByIdPort {
    HeroResp findById(UUID id);
}
