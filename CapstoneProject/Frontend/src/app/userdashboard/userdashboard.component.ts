import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from '../login';

@Component({
  selector: 'app-userdashboard',
  templateUrl: './userdashboard.component.html',
  styleUrls: ['./userdashboard.component.css']
})
export class UserdashboardComponent implements OnInit {
  login:Array<Login> = [];
  user:string = "";
  constructor(public router:Router) { }

  ngOnInit(): void {
    let obj = sessionStorage.getItem("userDetails");
    if(obj!=null){
      this.user = obj;
    }
  }

  logout(){
    sessionStorage.removeItem("userDetails");
    this.router.navigate(["login"]);
  }

  updateUser(emailid:string){
    console.log(emailid);

  }

}
