package com.briandevinssuresh.hockeystats.monolith.nhl_api.stats;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class StatsSeasons {
  List<StatsSeason> seasons = new ArrayList<>();
}
