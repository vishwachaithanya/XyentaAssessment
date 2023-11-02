import { Component } from '@angular/core';
import { LinkedinService } from 'src/app/services/linkedin.service';

@Component({
  selector: 'app-maps',
  templateUrl: './maps.component.html',
  styleUrls: ['./maps.component.css']
})
export class MapsComponent {
  constructor(private _data:LinkedinService){}
  message:any;
  ngOnInit(){
  this._data.myFunction().subscribe((res)=>{
    this.message=res;
    console.log(res);
  })
  }

}
