package br.com.gubee.heroesapi.hero.adapter.out.persistence;

import br.com.gubee.heroesapi.hero.application.port.out.CreatePowerStatsPort;
import br.com.gubee.heroesapi.hero.application.port.out.DeletePowerStatsPort;
import br.com.gubee.heroesapi.hero.domain.PowerStats;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class PowerStatsRepository implements CreatePowerStatsPort, DeletePowerStatsPort {

    private static final String CREATE_POWER_STATS_QUERY = "INSERT INTO power_stats" +
            " (strength, agility, dexterity, intelligence)" +
            " VALUES (:strength, :agility, :dexterity, :intelligence) RETURNING id";

    private static final String DELETE_QUERY = "DELETE FROM power_stats ps WHERE ps.id = :id";

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void delete(UUID id) {
        SqlParameterSource param = new MapSqlParameterSource("id", id);
        namedParameterJdbcTemplate.update(DELETE_QUERY, param);
    }

    @Override
    public UUID create(PowerStats powerStats) {
        return namedParameterJdbcTemplate.queryForObject(
                CREATE_POWER_STATS_QUERY,
                new BeanPropertySqlParameterSource(powerStats),
                UUID.class);
    }
}
