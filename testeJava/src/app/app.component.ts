import { Component } from '@angular/core';
import { Router } from '@angular/router';
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

  constructor(
    private userService: UserService,
    private router: Router
  ) {}

  onSubmit() {
    this.userService.registerUser(this.user).subscribe((response: any) => {
      console.log('Usuário cadastrado', response);
      // Redirecionar para a página de login
      this.router.navigate(['/login']); 
    });
  }
}
