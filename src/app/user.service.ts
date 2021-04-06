import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})

export class UserService {
  // severUrl = "http://localhost:8082";
  constructor(private http: HttpClient) { }
  setDoctor(): Observable<any> {
    let observable = this.http.get<any>("http://localhost:8082/doctor/findAll/");
    return observable;
  }

  setPatient(): Observable<any> {
    let observable = this.http.get("http://localhost:8082/patients/");
    return observable
  }
  setPatientById(id: number): Observable<JSON> {
    let observable = this.http.put<any>("http://localhost:8082/getpatient", {
      "pkUserId": id
    });
    return observable;
  }
  updatePatient(user): Observable<any> {
    console.log(user);
    let observable = this.http.put<any>("http://localhost:8082/updatepatient", user);
    return observable;
  }


  deletePatient(userId): Observable<any> {
    console.log(userId);
    let observable = this.http.put<any>("http://localhost:8080/deletepatient", {
      "pkUserId": userId
    })
    return observable;
  }

  setDoctorById(userId): Observable<any> {
    console.log(userId);
    let observable = this.http.put<any>("http://localhost:8082/readdoctor", {
      "pkUserId": userId
    })
    return observable;
  }

  updateDoctor(user): Observable<any> {
    console.log(user);
    let observable = this.http.put<any>("http://localhost:8082/updatedoctor", user);
    return observable;
  }

  deleteDoctor(userId): Observable<any>{
    console.log(userId);
    let observable = this.http.put<any>("http://localhost:8082/doctor/doctors",{
      "pkUserId" : userId
    })
    return observable;
  }

  createPatient(patient): Observable<any>{
    console.log(patient);
    let observable = this.http.post<any>("http://localhost:8082/addPatient",patient);
    return observable;
  }

  createDoctor(doctor): Observable<any>{
    console.log(this.setDoctorById);
    let observable = this.http.post<any>("http://localhost:8082/doctor/add",doctor);
    return observable;
  }


}