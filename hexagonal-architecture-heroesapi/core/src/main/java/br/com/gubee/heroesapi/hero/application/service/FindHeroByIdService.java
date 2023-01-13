package br.com.gubee.heroesapi.hero.application.service;

import br.com.gubee.heroesapi.hero.application.port.in.FindHeroByIdUseCase;
import br.com.gubee.heroesapi.hero.application.port.out.FindHeroByIdPort;
import br.com.gubee.heroesapi.hero.domain.response.HeroResp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class FindHeroByIdService implements FindHeroByIdUseCase {

    private final FindHeroByIdPort findHeroByIdPort;

    @Override
    public HeroResp findById(UUID id) {
        return findHeroByIdPort.findById(id);
    }
}
