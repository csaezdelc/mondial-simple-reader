package cl.uv.ici.arq.labs.main;

import java.util.List;

import cl.uv.ici.arq.labs.dtos.Country;
import cl.uv.ici.arq.labs.service.MondialService;
import cl.uv.ici.arq.labs.service.impl.MondialServiceImpl;

public class Main {

	public static void main(String[] args) {

		MondialService mondialService= new MondialServiceImpl();
		List<Country> countries = mondialService.getListCountries("MondialDataSet");
		
	/*	for(Country country: countries) {
			System.out.println(country.toString());
		}
		*/
		System.out.println();
		
		countries.stream().forEach((temp) -> System.out.println(temp.toString()));

	}

}
