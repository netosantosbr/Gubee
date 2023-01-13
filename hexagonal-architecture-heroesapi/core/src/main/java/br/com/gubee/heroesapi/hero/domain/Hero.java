package br.com.gubee.heroesapi.hero.domain;

import br.com.gubee.heroesapi.hero.domain.enums.Race;
import br.com.gubee.heroesapi.hero.domain.request.CreateHeroRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

import static lombok.AccessLevel.PRIVATE;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = PRIVATE)
public class Hero {
    private UUID id;
    private String name;
    private Race race;
    private UUID powerStatsId;
    private Instant createdAt;
    private Instant updatedAt;
    private boolean enabled;

    public Hero(CreateHeroRequest createHeroRequest, UUID powerStatsId) {
        this.name = createHeroRequest.getName();
        this.race = createHeroRequest.getRace();
        this.powerStatsId = powerStatsId;
    }

    public Hero(String name, Race race){
        this.name = name;
        this.race = race;
    }
}
