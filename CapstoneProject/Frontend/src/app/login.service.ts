import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from './login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  baseURL:string = "http://localhost:7070/login";
  operationURL:String = "http://localhost:7070/operation";
  constructor(public http:HttpClient) { }

  note1():Observable<any>{
    return this.http.get("http://localhost:7070/login/note",{responseType:"text"} );
  }

  signIn(login:any):Observable<string>{
    return this.http.post(this.baseURL+"/signIn", login,{responseType:"text"});
  }

  signUp(login:any):Observable<string>{
    return this.http.post(this.baseURL+"/signUp", login,{responseType:"text"});
  }

  //***********oparations**************

  apply(login:any):Observable<string>{
    return this.http.post(this.operationURL+"/apply", login,{responseType:"text"});
  }

  updateUser(login:any):Observable<string>{
    return this.http.patch(this.operationURL+"/update", login, {responseType:"text"});
  }

  findAllUser():Observable<Login[]>{
    return this.http.get<Login[]>(this.operationURL+"/getAll");
  } 

  findById(id:number):Observable<Login[]>{
    return this.http.get<Login[]>(this.operationURL+"/getUser/"+id);
  }

  deleteUser(emailid:string):Observable<string>{
    return this.http.delete(this.operationURL+"/delete/"+emailid, {responseType:"text"});
  }

  

}
