import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBottleComponent } from './add-bottle.component';

describe('AddBottleComponent', () => {
  let component: AddBottleComponent;
  let fixture: ComponentFixture<AddBottleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddBottleComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddBottleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
