package br.com.gubee.heroesapi.hero.application.port.out;

import java.util.UUID;

public interface DeleteHeroPort {
    void delete(UUID id);
}
