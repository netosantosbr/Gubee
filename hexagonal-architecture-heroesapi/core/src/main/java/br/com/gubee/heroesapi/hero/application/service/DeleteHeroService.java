package br.com.gubee.heroesapi.hero.application.service;

import br.com.gubee.heroesapi.hero.application.port.in.DeleteHeroUseCase;
import br.com.gubee.heroesapi.hero.application.port.out.DeleteHeroPort;
import br.com.gubee.heroesapi.hero.application.port.out.DeletePowerStatsPort;
import br.com.gubee.heroesapi.hero.application.port.out.FindPowerStatsIdFromHeroPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class DeleteHeroService implements DeleteHeroUseCase {

    private final DeleteHeroPort deleteHeroPort;
    private final DeletePowerStatsPort deletePowerStatsPort;
    private final FindPowerStatsIdFromHeroPort findPowerStatsIdFromHeroPort;

    @Override
    public void delete(UUID id) {
        UUID powerStatsIdFromHero = findPowerStatsIdFromHeroPort.findPowerStatsIdFromHero(id);
        deleteHeroPort.delete(id);
        deletePowerStatsPort.delete(powerStatsIdFromHero);
    }
}
