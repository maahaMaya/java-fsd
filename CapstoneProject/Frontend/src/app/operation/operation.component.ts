import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms'
import { LoginService } from '../login.service';

@Component({
  selector: 'app-operation',
  templateUrl: './operation.component.html',
  styleUrls: ['./operation.component.css']
})
export class OperationComponent implements OnInit {
  msg:string = "";
  loginRef= new FormGroup({
    emailid:new FormControl(),
    password:new FormControl(),
    typeOfUser:new FormControl(),
    id:new FormControl(),
    name:new FormControl(),
    address:new FormControl(),
    phone:new FormControl(),
    dob:new FormControl(),
  });
  constructor(public ls:LoginService) { }

  ngOnInit(): void {
  }

  applyUser(){
    let login = this.loginRef.value;
    this.ls.apply(login).subscribe({
      next:(result:any)=>this.msg=result,
      error:(error:any)=>this.msg=error,
      complete:()=>console.log("completed")
    });


    this.loginRef.reset();
  }

}  
