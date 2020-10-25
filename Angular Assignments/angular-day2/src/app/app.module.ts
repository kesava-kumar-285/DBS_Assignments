import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyserviceService } from './myservice.service';
import { FormsModule } from '@angular/forms';
import { NewCmpComponent } from './new-cmp/new-cmp.component';
import { DetailListComponent } from './detail-list/detail-list.component';
import { DetailEditComponent } from './detail-list/detail-edit/detail-edit.component';
@NgModule({
  declarations: [
    AppComponent,
    NewCmpComponent,
    DetailListComponent,
    DetailEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [MyserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
