import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private apiUrl = 'http://localhost:8080/users'; // Ajuste para sua URL da API

  constructor(private http: HttpClient) {}

  registerUser(user: any): Observable<any> {
    return this.http.post(this.apiUrl, user);
  }
}
