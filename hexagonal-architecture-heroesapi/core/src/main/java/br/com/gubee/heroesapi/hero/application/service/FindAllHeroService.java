package br.com.gubee.heroesapi.hero.application.service;

import br.com.gubee.heroesapi.hero.application.port.in.FindAllHeroUseCase;
import br.com.gubee.heroesapi.hero.application.port.out.FindAllHeroPort;
import br.com.gubee.heroesapi.hero.domain.response.HeroResp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class FindAllHeroService implements FindAllHeroUseCase {

    private final FindAllHeroPort findAllHeroPort;

    @Override
    public List<HeroResp> findAll() {
        return findAllHeroPort.findAll();
    }
}
