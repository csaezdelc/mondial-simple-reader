package cl.uv.ici.arq.labs.service;

import java.util.List;

import cl.uv.ici.arq.labs.dtos.Country;

public interface MondialService {

	public List<Country> getListCountries(String fileName);
}