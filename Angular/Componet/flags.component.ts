import { Component } from '@angular/core';
import { LinkedinService } from 'src/app/services/linkedin.service';

@Component({
  selector: 'app-flags',
  templateUrl: './flags.component.html',
  styleUrls: ['./flags.component.css']
})
export class FlagsComponent 
{
  constructor(private _data:LinkedinService){}
  message:any;
  ngOnInit(){
  this._data.myFunction().subscribe((res)=>{
    this.message=res;
    console.log(res);
  })

}
}
