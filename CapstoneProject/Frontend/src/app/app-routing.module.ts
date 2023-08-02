import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { GetAllComponent } from './get-all/get-all.component';
import { LoginComponent } from './login/login.component';
import { OperationComponent } from './operation/operation.component';
import { RetrieveComponent } from './retrieve/retrieve.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { UpdateComponent } from './update/update.component';
import { UserdashboardComponent } from './userdashboard/userdashboard.component';

const routes: Routes = [
  {path:"login", component:LoginComponent},
  {path:"", redirectTo:"login", pathMatch:"full"},
  {path:"adminHome", component:AdmindashboardComponent, children:[
    {path:"getUser", component:RetrieveComponent},
    {path:"getList", component:GetAllComponent}

  ]},
  {path:"userHome", component:UserdashboardComponent, children:[
    {path:"applyUser", component:OperationComponent},
    {path:"updateUser", component:UpdateComponent}
  ]},
  {path:"signUp", component:SignUpComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  
exports: [RouterModule]
})
export class AppRoutingModule { }
