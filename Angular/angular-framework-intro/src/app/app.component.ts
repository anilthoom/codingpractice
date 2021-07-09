import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  firstname = 'Anil';
  lastname = 'Thoom';
  elements = ['Playing Cricket', 'Reading']

  onChangeName(){
    this.firstname = "Shrihan"
  }
  onAddElement(){
    this.elements.push('Added');
  }
  onUserWasClicked(userName: string){
    alert(userName);
  }
}
