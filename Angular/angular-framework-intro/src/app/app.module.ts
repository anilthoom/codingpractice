import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { UsernameComponent } from './username/username.component';
import { FormsModule } from '@angular/forms';
import { InfoComponent } from './info/info.component';

@NgModule({
  declarations: [
    AppComponent,
    UsernameComponent,
    InfoComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
