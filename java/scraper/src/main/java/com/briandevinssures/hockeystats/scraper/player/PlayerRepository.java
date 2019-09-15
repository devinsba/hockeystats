package com.briandevinssures.hockeystats.scraper.player;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, UUID> {
    Optional<Player> findByNhlId(long nhlId);
}
