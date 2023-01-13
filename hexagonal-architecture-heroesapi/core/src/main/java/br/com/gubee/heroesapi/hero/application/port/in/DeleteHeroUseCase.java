package br.com.gubee.heroesapi.hero.application.port.in;

import java.util.UUID;

public interface DeleteHeroUseCase {
    void delete(UUID id);
}
