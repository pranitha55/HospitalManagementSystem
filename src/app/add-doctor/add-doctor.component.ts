import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { doctor } from '../Model/Doctor.component';


import { UserService } from '../user.service';

@Component({
  selector: 'app-add-doctor',
  templateUrl: './add-doctor.component.html',
  styleUrls: ['./add-doctor.component.css']
})
export class AddDoctorComponent implements OnInit {
  doctor: doctor = new doctor();

  constructor(private route: ActivatedRoute, private router: Router, private userService: UserService) { }

  ngOnInit() {
  }

  updateDoctor(roleId) {
    console.log(this.doctor);
    if (roleId == 2) {
      this.doctor.fkRoleId = roleId;
      let observable = this.userService.createDoctor(this.doctor);
      observable.subscribe((response) => {
        console.log(response);
      })
    }
    this.router.navigate(['']);
  }


}
