import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { user } from '../Model/User.component';
import { UserService } from '../user.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  user: user = new user();

  constructor(private route: ActivatedRoute, private router: Router, private userService: UserService) { }

  ngOnInit() {
  }

  updateUser(roleId) {
    console.log(this.user);
    if (roleId == 2) {
      this.user.fkRoleId = roleId;
      let observable = this.userService.createDoctor(this.user);
      observable.subscribe((response) => {
        console.log(response);
      })
    }
    this.router.navigate(['']);
  }

}
