import { Component } from '@angular/core';
import { BeenmappedService } from '../beenmapped.service';

@Component({
  selector: 'app-mappy',
  standalone: true,
  imports: [],
  templateUrl: './mappy.component.html',
  styleUrl: './mappy.component.css'
})
export class MappyComponent {
apple: any = {};
apples: any = {};
  constructor (private beingMapped:BeenmappedService){}

  pickingapples (event: any) {
    this.beingMapped.beenfetched(event.target.id).subscribe((datas: any) => {
      console.log(datas)
      this.apple = {
        ...datas,
      }
    });
    this.beingMapped.beenfetched2(event.target.id).subscribe((data:any) => {
      console.log(data)
      this.apples = {
        ...data,
      }
    });
  }

}
