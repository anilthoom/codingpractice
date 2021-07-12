import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  firstname = 'Anil';
  lastname = 'Thoom';
  elements = ['Playing Cricket', 'Reading'];
  message: string = '';
  hobby: string = '';

  onChangeName() {
    this.firstname = 'Shrihan';
  }
  onAddElement(newHobby) {
    this.elements.push(newHobby);
  }
  onRemoveElement(element) {
    const position = this.elements.indexOf(element);
    this.elements.splice(position, 1);
  }
  onUserWasClicked(userName: string) {
    alert(userName);
  }
}
