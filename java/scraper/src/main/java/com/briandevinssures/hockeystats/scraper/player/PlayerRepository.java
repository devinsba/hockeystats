package com.briandevinssures.hockeystats.scraper.player;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Optional<Player> findByNhlId(long nhlId);
}
