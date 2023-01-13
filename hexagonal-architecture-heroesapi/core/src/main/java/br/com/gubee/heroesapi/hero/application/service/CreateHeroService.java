package br.com.gubee.heroesapi.hero.application.service;

import br.com.gubee.heroesapi.hero.application.port.in.CreateHeroUseCase;
import br.com.gubee.heroesapi.hero.application.port.out.CreateHeroPort;
import br.com.gubee.heroesapi.hero.application.port.out.CreatePowerStatsPort;
import br.com.gubee.heroesapi.hero.domain.Hero;
import br.com.gubee.heroesapi.hero.domain.PowerStats;
import br.com.gubee.heroesapi.hero.domain.request.CreateHeroRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class CreateHeroService implements CreateHeroUseCase {

    private final CreateHeroPort createHeroPort;
    private final CreatePowerStatsPort createPowerStatsPort;

    @Override
    public UUID create(CreateHeroRequest createHeroRequest) {
        return createHeroPort.create(new Hero(createHeroRequest,
                createPowerStatsPort.create(new PowerStats(createHeroRequest))));
    }
}
