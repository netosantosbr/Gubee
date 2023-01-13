package br.com.gubee.heroesapi.hero.application.port.out;

import br.com.gubee.heroesapi.hero.domain.Hero;

import java.util.UUID;

public interface CreateHeroPort {
    UUID create(Hero hero);
}
