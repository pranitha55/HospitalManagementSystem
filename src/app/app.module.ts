import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { CardComponent } from './card/card.component';
import { PatientComponent } from './patient/patient.component';
import { DoctorComponent } from './doctor/doctor.component';
import { HttpClientModule } from '@angular/common/http';
import { EditComponent } from './edit/edit.component';
import { CreateComponent } from './create/create.component';
import { HighlightDirective } from './highlight.directive';
import { AddComponent } from './add/add.component';
import { AppointmentComponent } from './appointment/appointment.component';
import { AddDoctorComponent } from './add-doctor/add-doctor.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { MatSidenavModule } from '@angular/material';




@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    HeaderComponent,
    CardComponent,
    PatientComponent,
    DoctorComponent,
    EditComponent,
    CreateComponent,
    HighlightDirective,
    AddComponent,
    AppointmentComponent,
    AddDoctorComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatSidenavModule
   

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
