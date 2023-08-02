import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms'
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { Login } from './../login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  msg:string = "";
  loginRef= new FormGroup({
    emailid:new FormControl(),
    password:new FormControl(),
    typeOfUser:new FormControl()
  });

  constructor(public ls:LoginService, public router: Router) { }

  ngOnInit(): void {
  }
 
  signInNow(){
    let login = this.loginRef.value;
    this.ls.signIn(login).subscribe({
      next:(result:any)=>{
        if(result == "Admin sucessfully login"){
          sessionStorage.setItem("userDetails",login.emailid);
          this.router.navigate(["adminHome"]);
        }
        else if(result == "User successfully login"){
          sessionStorage.setItem("userDetails",login.emailid);
          this.router.navigate(["userHome"]);
        }else{
          this.msg = result;
        }
      },
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed..")
    });

  }

  note(){
    let login = this.loginRef.value;
    this.ls.note1().subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed..")
    });

  }

}
