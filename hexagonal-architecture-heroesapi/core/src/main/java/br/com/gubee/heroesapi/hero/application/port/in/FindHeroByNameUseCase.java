package br.com.gubee.heroesapi.hero.application.port.in;

import br.com.gubee.heroesapi.hero.domain.response.HeroResp;

import java.util.List;

public interface FindHeroByNameUseCase {
    List<HeroResp> findByName(String name);
}
