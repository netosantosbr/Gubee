package br.com.gubee.heroesapi.hero.application.port.out;

import java.util.UUID;

public interface FindPowerStatsIdFromHeroPort {
    public UUID findPowerStatsIdFromHero(UUID id);
}
