package br.com.gubee.heroesapi.hero.application.service;

import br.com.gubee.heroesapi.hero.application.port.in.CompareTwoHeroesUseCase;
import br.com.gubee.heroesapi.hero.application.port.out.CompareTwoHeroesPort;
import br.com.gubee.heroesapi.hero.domain.response.HeroCompareResp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class CompareTwoHeroesService implements CompareTwoHeroesUseCase {

    private final CompareTwoHeroesPort compareTwoHeroesPort;

    @Override
    public HeroCompareResp compareTwoHeroes(UUID firstId, UUID secondId) {
        return compareTwoHeroesPort.compareTwoHeroes(firstId, secondId);
    }
}
