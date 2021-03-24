package cl.uv.ici.arq.labs.dtos;

import lombok.Data;

@Data
public class Country {

	private String code;
	private String name;
	private String capital;
	private String province;
	private Integer area;
	private Integer population;
	
}