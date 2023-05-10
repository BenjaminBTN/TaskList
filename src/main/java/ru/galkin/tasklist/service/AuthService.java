package ru.galkin.tasklist.service;

import ru.galkin.tasklist.web.dto.auth.JwtRequest;
import ru.galkin.tasklist.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest lginRequest);
    JwtResponse refresh(String refreshToken);

}
