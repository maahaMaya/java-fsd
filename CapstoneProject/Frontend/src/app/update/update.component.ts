import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { Login } from '../login';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  login:Array<Login> = [];
  user:string = "";
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
  constructor(public ls:LoginService, public router:Router) { }

  ngOnInit(): void {
  let obj = sessionStorage.getItem("userDetails");
    if(obj!=null){
      this.user = obj;
    }
  }

  update(){
    if(confirm("Are You sure, You want to delete the this Aadhar?")){
      this.ls.updateUser(this.user).subscribe({
        next:(result:any) => console.log(result),
        error:(error:any) => console.log(error),
        complete:()=>console.log("completed")
      })
    } 
  }

  back(){
    this.router.navigate(["userHome"]);
  }

}
