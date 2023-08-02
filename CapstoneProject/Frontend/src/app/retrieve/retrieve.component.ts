import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-retrieve',
  templateUrl: './retrieve.component.html',
  styleUrls: ['./retrieve.component.css']
})
export class RetrieveComponent implements OnInit {
  login:Array<Login> = [];
  constructor(public ls:LoginService) { }

  ngOnInit(): void {
    this.getAllUser();
  }

  getAllUser(){
    this.ls.findAllUser().subscribe({
      next:(result:any)=>this.login=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    });

  }

}
