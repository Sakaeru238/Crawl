package Utils;

public class BuildTag {
	public static String NHLTag(String title) {

		StringBuilder builder = new StringBuilder();
		builder.append("\"");
		builder.append(NHLTeamName.PARENT_CATEGORY);
		builder.append(Constants.COMAS);

		if (title.toLowerCase().contains(NHLTeamName.Arizona_Coyotes_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Arizona_Coyotes_FULL_NAME);
		} else if (title.toLowerCase().contains(NHLTeamName.Anaheim_Ducks_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Anaheim_Ducks_FULL_NAME);
		}
		if (title.toLowerCase().contains(NHLTeamName.Boston_Bruins_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Boston_Bruins_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Buffalo_Sabres_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Buffalo_Sabres_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Colorado_Avalanche_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Colorado_Avalanche_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Chicago_BlackHawks_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Chicago_BlackHawks_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Columbus_Blue_Jackets_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Columbus_Blue_Jackets_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Calgary_Flames_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Calgary_Flames_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Carolina_Hurricanes_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Carolina_Hurricanes_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Detroit_Red_Wings_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Detroit_Red_Wings_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Dallas_Stars_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Dallas_Stars_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Edmonton_Oilers_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Edmonton_Oilers_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Florida_Panthers_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Florida_Panthers_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Los_Angeles_Kings_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Los_Angeles_Kings_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Montreal_Canadiens_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Montreal_Canadiens_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Minnesota_Wild_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Minnesota_Wild_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.New_Jersey_Devils_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.New_Jersey_Devils_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Nashville_Predators_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Nashville_Predators_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.NYI_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.NYI_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.NYR_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.NYR_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Ottawa_Senators_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Ottawa_Senators_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Philadelphia_Flyers_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Philadelphia_Flyers_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Pittsburgh_Penguins_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Pittsburgh_Penguins_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.San_Jose_Sharks_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.San_Jose_Sharks_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Seattle_Kraken_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Seattle_Kraken_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.St_Louis_Blues_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.St_Louis_Blues_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Tampa_Bay_Lightning_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Tampa_Bay_Lightning_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Toronto_Maple_Leafs_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Toronto_Maple_Leafs_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Vancouver_Canucks_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Vancouver_Canucks_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Vegas_Golden_Knights_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Vegas_Golden_Knights_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Washington_Capitals_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Washington_Capitals_FULL_NAME);
		}
		if (title.toLowerCase().toLowerCase().contains(NHLTeamName.Winnipeg_Jets_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Winnipeg_Jets_FULL_NAME);
		}
		builder.append("\"");
		
		return builder.toString();
	}
	
	public static String NFLTag(String title) {

		StringBuilder builder = new StringBuilder();
		builder.append("\"");
		builder.append(NFLTeamName.PARENT_CATEGORY);
		builder.append(Constants.COMAS);
		builder.append(Constants.SPACE);

		if (title.toLowerCase().contains(NFLTeamName.ArizonaCardinals_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.ArizonaCardinals_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.AtlantaFalcons_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.AtlantaFalcons_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.BuffaloBills_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.BuffaloBills_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.BaltimoreRavens_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.BaltimoreRavens_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.ChicagoBears_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.ChicagoBears_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.CincinnatiBengals_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.CincinnatiBengals_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.ClevelandBrowns_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.ClevelandBrowns_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.CarolinaPanthers_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.CarolinaPanthers_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.DenverBroncos_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.DenverBroncos_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.DallasCowboysls_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.DallasCowboysls_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.DetroitLions_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.DetroitLions_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.GreenBayPackers_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.GreenBayPackers_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.HoustonTexans_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.HoustonTexans_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.IndianapolisColts_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.IndianapolisColts_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.JacksonvilleJaguars_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.JacksonvilleJaguars_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.KansasCityChiefs_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.KansasCityChiefs_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.LosAngelesChargers_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.LosAngelesChargers_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.LosAngelesRams_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.LosAngelesRams_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.LasVegasRaiders_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.LasVegasRaiders_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.MiamiDolphins_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.MiamiDolphins_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.MinnesotaVikings_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.MinnesotaVikings_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.NewEnglandPatriots_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.NewEnglandPatriots_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.NewOrleansSaints_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.NewOrleansSaints_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.NewYorkGiants_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.NewYorkGiants_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.NewYorkJets_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.NewYorkJets_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(NFLTeamName.PhiladelphiaEagles_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.PhiladelphiaEagles_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(NFLTeamName.PittsburghSteelers_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.PittsburghSteelers_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(NFLTeamName.SanFrancisco49ers_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.SanFrancisco49ers_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(NFLTeamName.SeattleSeahawks_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.SeattleSeahawks_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(NFLTeamName.TampaBayBuccaneers_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.TampaBayBuccaneers_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(NFLTeamName.TennesseeTitans_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.TennesseeTitans_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(NFLTeamName.Washington_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.Washington_FULL_NAME);
		}
		builder.append("\"");

		return builder.toString();
	}

	public static String MLBTag(String title) {

		StringBuilder builder = new StringBuilder();
		builder.append("\"");
		builder.append(MLBTeamName.PARENT_CATEGORY);
		builder.append(Constants.COMAS);
		builder.append(Constants.SPACE);

		if (title.toLowerCase().contains(MLBTeamName.Atlanta_Braves_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Atlanta_Braves_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Arizona_Diamondbacks_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Arizona_Diamondbacks_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Baltimore_Orioles_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Baltimore_Orioles_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Boston_Red_Sox_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Boston_Red_Sox_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Chicago_Cubs_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Chicago_Cubs_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Cleveland_Guardians_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Cleveland_Guardians_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Cleveland_Indians_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Cleveland_Guardians_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Cincinnati_Reds_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Cincinnati_Reds_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Colorado_Rockies_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Colorado_Rockies_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Chicago_White_Sox_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Chicago_White_Sox_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Detroit_Tigers_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Detroit_Tigers_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Houston_Astros_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Houston_Astros_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Kansas_City_Royals_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Kansas_City_Royals_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Los_Angeles_Angels_of_Anaheim_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Los_Angeles_Angels_of_Anaheim_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Los_Angeles_Angels_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Los_Angeles_Angels_of_Anaheim_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Los_Angeles_Dodgers_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Los_Angeles_Dodgers_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Milwaukee_Brewers_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Milwaukee_Brewers_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Miami_Marlins_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Miami_Marlins_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Minnesota_Twins_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Minnesota_Twins_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.New_York_Mets_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.New_York_Mets_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.NewYork_Yankees_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.NewYork_Yankees_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Oakland_Athletics_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Oakland_Athletics_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Pittsburgh_Pirates_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Pittsburgh_Pirates_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Philadelphia_Phillies_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Philadelphia_Phillies_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.San_Diego_Padres_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.San_Diego_Padres_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.San_Francisco_Giants_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.San_Francisco_Giants_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.St_Louis_Cardinals_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.St_Louis_Cardinals_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Seattle_Mariners_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Seattle_Mariners_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Toronto_Blue_Jays_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Toronto_Blue_Jays_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Tampa_Bay_Rays_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Tampa_Bay_Rays_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Texas_Rangers_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Texas_Rangers_FULL_NAME);
		} else if (title.toLowerCase().contains(MLBTeamName.Washington_Nationals_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Washington_Nationals_FULL_NAME);
		}
		builder.append("\"");

		return builder.toString();
	}
	
	public static String AFLTag(String title) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("\"");
		builder.append(MLBTeamName.PARENT_CATEGORY);
		builder.append(Constants.COMAS);
		builder.append(Constants.SPACE);
		
		if (title.toLowerCase().contains(AFLTeamName.Port_Adelaide_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Port_Adelaide_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Western_Bulldogs_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Western_Bulldogs_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Carlton_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Carlton_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Geelong_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Geelong_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Collingwood_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Collingwood_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Adelaide_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Adelaide_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.West_Coast_Eagles_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.West_Coast_Eagles_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Essendon_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Essendon_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Fremantle_Dockers_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Fremantle_Dockers_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Greater_Western_Sydney_Giants_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Greater_Western_Sydney_Giants_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Hawthorn_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Hawthorn_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.St_Kilda_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.St_Kilda_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Brisbane_Lions_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Brisbane_Lions_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Melbourne_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Melbourne_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.North_Melbourne_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.North_Melbourne_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Richmond_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Richmond_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Gold_Coast_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Gold_Coast_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(AFLTeamName.Sydney_Swans_FULL_NAME.toLowerCase())) {
			builder.append(AFLTeamName.Sydney_Swans_FULL_NAME);
		}
		
		builder.append("\"");

		return builder.toString();
	}
	
	public static String NRLTag(String title) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("\"");
		builder.append(MLBTeamName.PARENT_CATEGORY);
		builder.append(Constants.COMAS);
		builder.append(Constants.SPACE);
		
		if (title.toLowerCase().contains(NRLTeamName.Brisbane_Broncos_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Brisbane_Broncos_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Canterbury_Bankstown_Bulldogs_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Canterbury_Bankstown_Bulldogs_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.North_Queensland_Cowboys_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.North_Queensland_Cowboys_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.St_George_Illawarra_Dragons_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.St_George_Illawarra_Dragons_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Manly_Warringah_Sea_Eagles_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Manly_Warringah_Sea_Eagles_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Parramatta_Eels_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Parramatta_Eels_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Newcastle_Knights_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Newcastle_Knights_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Penrith_Panthers_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Penrith_Panthers_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.South_Sydney_Rabbitohs_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.South_Sydney_Rabbitohs_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Canberra_Raiders_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Canberra_Raiders_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Sydney_Roosters_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Sydney_Roosters_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Cronulla_Sutherland_Sharks_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Cronulla_Sutherland_Sharks_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Melbourne_Storm_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Melbourne_Storm_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Wests_Tigers_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Wests_Tigers_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Gold_Coast_Titans_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Gold_Coast_Titans_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.New_Zealand_Warriors_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.New_Zealand_Warriors_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Gold_Coast_Football_Club_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Gold_Coast_Football_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(NRLTeamName.Dolphins_FULL_NAME.toLowerCase())) {
			builder.append(NRLTeamName.Dolphins_FULL_NAME);
		}
		
		builder.append("\"");

		return builder.toString();
	}
	
	public static String PLLTag(String title) {
		
		StringBuilder builder = new StringBuilder();
		builder.append("\"");
		builder.append(NLLTeamName.NLL_TAG);
		builder.append(Constants.COMAS);
		builder.append(Constants.SPACE);
		
		if (title.toLowerCase().contains(NLLTeamName.Albany_FireWolves_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Albany_FireWolves_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Buffalo_Bandits_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Buffalo_Bandits_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Colorado_Mammoth_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Colorado_Mammoth_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Calgary_Roughnecks_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Calgary_Roughnecks_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Georgia_Swarm_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Georgia_Swarm_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Halifax_Thunderbirds_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Halifax_Thunderbirds_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Las_Vegas_Desert_Dogs_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Las_Vegas_Desert_Dogs_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.New_York_Riptide_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.New_York_Riptide_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Panther_City_Lacrosse_Club_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Panther_City_Lacrosse_Club_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Philadelphia_Wings_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Philadelphia_Wings_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Rochester_Knighthawks_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Rochester_Knighthawks_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.San_Diego_Seals_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.San_Diego_Seals_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Saskatchewan_Rush_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Saskatchewan_Rush_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Toronto_Rock_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Toronto_Rock_FULL_NAME);
		} else if (title.toLowerCase().contains(NLLTeamName.Vancouver_Warriors_FULL_NAME.toLowerCase())) {
			builder.append(NLLTeamName.Vancouver_Warriors_FULL_NAME);
		}

		builder.append("\"");

		return builder.toString();
	}
	
	public static String OHLTag(String title) {
		StringBuilder builder = new StringBuilder();
		builder.append("\"");
		builder.append(NLLTeamName.PARENT_CATEGORY);
		builder.append(Constants.COMAS);
		builder.append(Constants.SPACE);
		builder.append("\"");
		
		if (title.toLowerCase().contains(OHLTeamName.Barrie_Colts_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Barrie_Colts_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Erie_Otters_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Erie_Otters_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Flint_Firebirds_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Flint_Firebirds_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Guelph_Storm_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Guelph_Storm_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Brantford_Bulldogs_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Brantford_Bulldogs_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Kingston_Frontenacs_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Kingston_Frontenacs_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Kitchener_Rangers_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Kitchener_Rangers_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.London_Knights_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.London_Knights_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Mississauga_Steelheads_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Mississauga_Steelheads_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.North_Bay_Battalion_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.North_Bay_Battalion_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Niagara_IceDogs_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Niagara_IceDogs_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Ottawa_67s_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Ottawa_67s_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Oshawa_Generals_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Oshawa_Generals_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Owen_Sound_Attack_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Owen_Sound_Attack_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Peterborough_Petes_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Peterborough_Petes_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Sault_Ste_Marie_Greyhounds_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Sault_Ste_Marie_Greyhounds_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Saginaw_Spirit_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Saginaw_Spirit_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Sarnia_Sting_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Sarnia_Sting_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Sudbury_Wolves_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Sudbury_Wolves_FULL_NAME);
		} else if (title.toLowerCase().contains(OHLTeamName.Windsor_Spitfires_FULL_NAME.toLowerCase())) {
			builder.append(OHLTeamName.Windsor_Spitfires_FULL_NAME);
		}

		return builder.toString();
	}	
	
}
