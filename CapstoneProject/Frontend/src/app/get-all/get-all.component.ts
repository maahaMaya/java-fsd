import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-get-all',
  templateUrl: './get-all.component.html',
  styleUrls: ['./get-all.component.css']
})
export class GetAllComponent implements OnInit {
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

  deleteUser(emailid:string){
    // this.ls.deleteUser(emailid).subscribe({
    //   next:(result:any)=>console.log(result),
    //   error:(error:any)=>console.log(error),
    //   complete:()=>console.log("completed")
    // });

    if(confirm("Are You sure, You want to delete the this Aadhar?")){
      this.ls.deleteUser(emailid).subscribe({
        next:(result:any) => console.log(result),
        error:(error:any) => console.log(error),
        complete:()=>{
          this.getAllUser();
        }
      });
    }

  }

}
