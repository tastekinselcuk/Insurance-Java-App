package com.InsuranceProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.InsuranceProject.business.abstracts.CitiesService;
import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.core.utilities.results.SuccesDataResult;
import com.InsuranceProject.dataAccess.abstracts.CitiesDao;
import com.InsuranceProject.entities.concretes.Cities;

@Service
public class CitiesManager implements CitiesService{
	
	private CitiesDao citiesDao;
	
	@Autowired
	public CitiesManager(CitiesDao citiesDao) {
		this.citiesDao = citiesDao;
	}

	@Override
	public Cities getByCityName(String cityName) {
    	System.out.println(citiesDao.getByCityName(cityName));
		return citiesDao.getByCityName(cityName);
	}


	
	public int findCityByName(String CityName) {
		String[] sehirler={"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
		int[] sizes={14030, 7614, 14230, 11376, 5520, 25706, 20723, 7436, 8007, 14292, 4307, 8125, 6707, 7410, 6887, 11043, 9737, 7388, 12820, 11868, 15355, 6279, 9153, 11909, 25066, 13652, 6000, 6934, 6575, 7121, 5403, 8993, 15853, 5196, 11973, 9587, 13108, 1691, 6550, 6570, 3626, 38257, 11889, 12313, 13810, 14327, 8891, 13338, 8196, 5467, 7312, 6001, 3920, 4817, 9579, 5406, 5862, 28488, 6218, 9959, 6685, 7774, 18584, 5341, 19069, 14123, 4420, 7626, 3652, 9163, 4365, 4694, 7172, 2120, 5661, 3593, 847, 2420, 1642, 3767, 3641};
		int citySize = 0;
		for(int i=0;i<sehirler.length;i++){
			if(sehirler[i].equals(CityName)) {
				citySize = sizes[i];
			}
		}
		return citySize;
	}

	@Override
	public DataResult<List<Cities>> getAllCities() {
		return new SuccesDataResult<List<Cities>>(this.citiesDao.findAll(),"Data Listelendi");
				//this.customerDao.findAll();
	}

	@Override
	public List<Cities> getAllCar() {
		ModelAndView mav = new ModelAndView("list-cities");
		mav.addObject("cars", citiesDao.findAll());
		return this.citiesDao.findAll();
	}

}
