package br.com.gubee.heroesapi.hero.application.port.in;

import br.com.gubee.heroesapi.hero.domain.response.HeroCompareResp;

import java.util.UUID;

public interface CompareTwoHeroesUseCase {
    HeroCompareResp compareTwoHeroes(UUID firstId, UUID secondId);
}
