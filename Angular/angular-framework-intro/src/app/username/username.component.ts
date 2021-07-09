import { Component, Input, OnInit, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-username',
  templateUrl: './username.component.html',
  styleUrls: ['./username.component.css']
})
export class UsernameComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  @Input() username: string;
  @Output() userClicked = new EventEmitter<string>();

  onUsernameClicked(){
    this.userClicked.emit(this.username);
  }
}
