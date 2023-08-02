import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { LoginService } from './../login.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
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

  signUp(){
    let login = this.loginRef.value;
    this.ls.signUp(login).subscribe({
      next:(result:any)=>this.msg=result,
      error:(error:any)=>this.msg=error,
      complete:()=>console.log("completed")
    });

  }

}
