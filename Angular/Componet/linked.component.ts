import { Component } from '@angular/core';
import { LinkedinService } from 'src/app/services/linkedin.service';

@Component({
  selector: 'app-linked',
  templateUrl: './linked.component.html',
  styleUrls: ['./linked.component.css']
})
export class LinkedComponent {
  constructor(private _data:LinkedinService){}
  message:any;
  ngOnInit(){
  this._data.myFunction().subscribe((res)=>{
    this.message=res;
    console.log(res);
  })
  }

}
