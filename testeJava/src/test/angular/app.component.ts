import { Component } from '@angular/core';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  user = {
    nome: '',
    cpf: '',
    dataNascimento: '',
    email: '',
    senha: ''
  };

  constructor(private userService: UserService) {}

  onSubmit() {
    this.userService.registerUser(this.user).subscribe(response => {
      console.log('Usuário cadastrado', response);
    });
  }
}
