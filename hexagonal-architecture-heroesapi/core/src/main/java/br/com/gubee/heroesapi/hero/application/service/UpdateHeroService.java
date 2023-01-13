package br.com.gubee.heroesapi.hero.application.service;

import br.com.gubee.heroesapi.hero.application.port.in.UpdateHeroUseCase;
import br.com.gubee.heroesapi.hero.application.port.out.UpdateHeroPort;
import br.com.gubee.heroesapi.hero.domain.response.HeroResp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class UpdateHeroService implements UpdateHeroUseCase {

    private final UpdateHeroPort updateHeroPort;

    @Override
    public UUID update(UUID id, HeroResp hero) {
        return updateHeroPort.update(id, hero);
    }
}
