import { Component } from '@angular/core';
import { LinkedinService } from 'src/app/services/linkedin.service';

@Component({
  selector: 'app-region',
  templateUrl: './region.component.html',
  styleUrls: ['./region.component.css']
})
export class RegionComponent {
  constructor(private _data:LinkedinService){}
  message:any;
  ngOnInit(){
  this._data.myFunction().subscribe((res)=>{
    this.message=res;
    console.log(res);
  })
  }

}
