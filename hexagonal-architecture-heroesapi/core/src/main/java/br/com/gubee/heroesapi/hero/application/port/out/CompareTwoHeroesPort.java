package br.com.gubee.heroesapi.hero.application.port.out;

import br.com.gubee.heroesapi.hero.domain.response.HeroCompareResp;

import java.util.UUID;

public interface CompareTwoHeroesPort {
    HeroCompareResp compareTwoHeroes(UUID firstId, UUID secondId);
}
