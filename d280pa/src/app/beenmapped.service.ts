import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class BeenmappedService {

  constructor(private http: HttpClient) { }
  

  ohsofetching(country: string){
    let api = `http://api.geonames.org/countryInfoJSON?country=${country}&username=midweekvermin`;
    
    
    return this.http.get(api)
  }
  ohsofetching2(country: string){
    let api2 = `https://api.worldbank.org/v2/country/${country}?format=json`
    
    return this.http.get(api2)
  }

  beenfetched(country: string){ 
    let suby = new Subject();

    this.ohsofetching(country).subscribe((datas: any) => {
      suby.next({
        cname: datas.geonames[0].countryName,
        capital: datas.geonames[0].capital,
        region: datas.geonames[0].continentName, 
        currency: datas.geonames[0].currencyCode,
        pops: datas.geonames[0].population,

        
      })
    })
    return suby.asObservable();
  }
  beenfetched2(country: string){ 
    let subys = new Subject();

    this.ohsofetching2(country).subscribe((data: any) => {
      subys.next({
        income: data[1][0].incomeLevel.value,

        
      })
    })
    return subys.asObservable();
  }

}
