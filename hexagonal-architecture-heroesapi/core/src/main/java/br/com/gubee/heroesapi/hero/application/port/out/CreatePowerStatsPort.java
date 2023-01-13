package br.com.gubee.heroesapi.hero.application.port.out;


import br.com.gubee.heroesapi.hero.domain.PowerStats;

import java.util.UUID;

public interface CreatePowerStatsPort {
    UUID create(PowerStats powerStats);
}
