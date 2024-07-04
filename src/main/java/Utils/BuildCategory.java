package Utils;

public class BuildCategory {

	public static String NHLCategory(String title) {

		StringBuilder builder = new StringBuilder();
		builder.append(NHLTeamName.PARENT_CATEGORY);
		builder.append(Constants.SPACE);
		builder.append(Constants.RIGHT_ARROW);
		builder.append(Constants.SPACE);

		if (title.toLowerCase().contains(NHLTeamName.Arizona_Coyotes_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Arizona_Coyotes_FULL_NAME);
		} else if (title.toLowerCase().contains(NHLTeamName.Anaheim_Ducks_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Anaheim_Ducks_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Boston_Bruins_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Boston_Bruins_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Buffalo_Sabres_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Buffalo_Sabres_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Colorado_Avalanche_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Colorado_Avalanche_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Chicago_BlackHawks_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Chicago_BlackHawks_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Columbus_Blue_Jackets_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Columbus_Blue_Jackets_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Calgary_Flames_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Calgary_Flames_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Carolina_Hurricanes_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Carolina_Hurricanes_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Detroit_Red_Wings_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Detroit_Red_Wings_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Dallas_Stars_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Dallas_Stars_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Edmonton_Oilers_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Edmonton_Oilers_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Florida_Panthers_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Florida_Panthers_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Los_Angeles_Kings_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Los_Angeles_Kings_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Montreal_Canadiens_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Montreal_Canadiens_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Minnesota_Wild_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Minnesota_Wild_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.New_Jersey_Devils_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.New_Jersey_Devils_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Nashville_Predators_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Nashville_Predators_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.NYI_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.NYI_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.NYR_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.NYR_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Ottawa_Senators_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Ottawa_Senators_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Philadelphia_Flyers_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Philadelphia_Flyers_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Pittsburgh_Penguins_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Pittsburgh_Penguins_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.San_Jose_Sharks_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.San_Jose_Sharks_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Seattle_Kraken_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Seattle_Kraken_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.St_Louis_Blues_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.St_Louis_Blues_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Tampa_Bay_Lightning_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Tampa_Bay_Lightning_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Toronto_Maple_Leafs_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Toronto_Maple_Leafs_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Vancouver_Canucks_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Vancouver_Canucks_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Vegas_Golden_Knights_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Vegas_Golden_Knights_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Washington_Capitals_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Washington_Capitals_FULL_NAME);
		}
		else if (title.toLowerCase().contains(NHLTeamName.Winnipeg_Jets_FULL_NAME.toLowerCase())) {
			builder.append(NHLTeamName.Winnipeg_Jets_FULL_NAME);
		}

		return builder.toString();
	}

	public static String NFLCategory(String title) {

		StringBuilder builder = new StringBuilder();
		builder.append(NFLTeamName.PARENT_CATEGORY);
		builder.append(Constants.SPACE);
		builder.append(Constants.RIGHT_ARROW);
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
		} else if (title.toLowerCase().contains(NFLTeamName.PhiladelphiaEagles_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.PhiladelphiaEagles_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.PittsburghSteelers_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.PittsburghSteelers_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.SanFrancisco49ers_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.SanFrancisco49ers_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.SeattleSeahawks_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.SeattleSeahawks_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.TampaBayBuccaneers_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.TampaBayBuccaneers_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.TennesseeTitans_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.TennesseeTitans_FULL_NAME);
		} else if (title.toLowerCase().contains(NFLTeamName.Washington_FULL_NAME.toLowerCase())) {
			builder.append(NFLTeamName.Washington_FULL_NAME);
		}

		return builder.toString();
	}

	public static String MLBCategory(String title) {

		StringBuilder builder = new StringBuilder();
		builder.append(MLBTeamName.PARENT_CATEGORY);
		builder.append(Constants.SPACE);
		builder.append(Constants.RIGHT_ARROW);
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
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.San_Francisco_Giants_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.San_Francisco_Giants_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.St_Louis_Cardinals_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.St_Louis_Cardinals_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Seattle_Mariners_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Seattle_Mariners_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Toronto_Blue_Jays_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Toronto_Blue_Jays_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Tampa_Bay_Rays_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Tampa_Bay_Rays_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Texas_Rangers_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Texas_Rangers_FULL_NAME);
		} else if (title.toLowerCase().toLowerCase().contains(MLBTeamName.Washington_Nationals_FULL_NAME.toLowerCase())) {
			builder.append(MLBTeamName.Washington_Nationals_FULL_NAME);
		}

		return builder.toString();
	}
}