package br.com.gubee.heroesapi.hero.application.service;

import br.com.gubee.heroesapi.hero.application.port.in.FindHeroByNameUseCase;
import br.com.gubee.heroesapi.hero.application.port.out.FindHeroByNamePort;
import br.com.gubee.heroesapi.hero.domain.response.HeroResp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class FindHeroByNameService implements FindHeroByNameUseCase {

    private final FindHeroByNamePort findHeroByNamePort;

    @Override
    public List<HeroResp> findByName(String name) {
        return findHeroByNamePort.findByName(name);
    }
}
