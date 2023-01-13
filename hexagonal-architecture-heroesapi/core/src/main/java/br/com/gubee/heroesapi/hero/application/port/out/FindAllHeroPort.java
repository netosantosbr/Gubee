package br.com.gubee.heroesapi.hero.application.port.out;

import br.com.gubee.heroesapi.hero.domain.response.HeroResp;

import java.util.List;

public interface FindAllHeroPort {
    List<HeroResp> findAll();
}
