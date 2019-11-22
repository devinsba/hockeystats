package com.briandevinssuresh.hockeystats.monolith.nhl.game;

import java.time.Instant;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document("games")
public class Game {
  @Id
  long gameId;

  GameType gameType;
  String seasonId;
  Instant startAt;
  String venue;
  GameStatus gameStatus;

  long awayTeamId;
  int awayScore;
  long homeTeamId;
  int homeScore;

  @Setter(AccessLevel.PACKAGE)
  @Version
  private Long version;

  @Setter(AccessLevel.PACKAGE)
  @CreatedDate
  private Instant created;

  @Setter(AccessLevel.PACKAGE)
  @LastModifiedDate
  private Instant lastModified;
}
