import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LinkedinService {

  constructor(private _ln:HttpClient) { }
  // url:string="http://65.1.178.54/app/index.php/Staff/getFilteredReport?SERVICE_NAME=Painter&CITY=Hyde";
  url:string="https://restcountries.com/v3.1/all";
  myFunction():Observable<any>{
    return this._ln.get<any>(this.url)
  }
}
