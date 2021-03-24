/**
 * 
 */
package cl.uv.ici.arq.labs.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import cl.uv.ici.arq.labs.dtos.Country;
import cl.uv.ici.arq.labs.service.MondialService;

/**
 * @author c.saez.del.canto
 *
 */
public class MondialServiceImpl implements MondialService {

	public List<Country> getListCountries(String fileName) {
		List<Country> returnList= new ArrayList<Country>();
		
		BufferedReader reader;
		String line="";
		StringTokenizer stk=null;
		
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream is = classloader.getResourceAsStream(fileName);
			
			reader= new BufferedReader(new InputStreamReader(is, "UTF-8"));
			line= reader.readLine();	
			while(line!=null) {				
				stk=new StringTokenizer(line,"*");
				Country c=new Country();
				c.setName(stk.nextToken());
				c.setCode(stk.nextToken());
				c.setCapital(stk.nextToken());
				c.setProvince(stk.nextToken());
				c.setArea(Integer.valueOf(stk.nextToken()));
				c.setPopulation(Integer.valueOf(stk.nextToken()));
				returnList.add(c);			
				line= reader.readLine();	
			}
			reader.close();
			is.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return returnList;
	}

}
