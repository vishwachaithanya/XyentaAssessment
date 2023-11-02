import { Component, ViewChild } from '@angular/core';
import { MatSidenav } from '@angular/material/sidenav';
import { BreakpointObserver } from '@angular/cdk/layout'
import { Router } from '@angular/router';

@Component({
  selector: 'app-office',
  templateUrl: './office.component.html',
  styleUrls: ['./office.component.css']
})
export class OfficeComponent {
  value:any;
  @ViewChild(MatSidenav) sidenav:any=MatSidenav;
 constructor(private _router:Router){}

//  ngAfterViewInit(){
//   this._observer.observe(['(max-width:800px)']).subscribe((res)=>{
//     if(res.matches){
//       this.sidenav.mode='over';
//       this.sidenav.close();

//     }
//     else{
//       this.sidenav='side';
//          this.sidenav.open();
//         }
  // })
 }

