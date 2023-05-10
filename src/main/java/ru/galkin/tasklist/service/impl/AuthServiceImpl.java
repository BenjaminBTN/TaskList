package ru.galkin.tasklist.service.impl;

import org.springframework.stereotype.Service;
import ru.galkin.tasklist.service.AuthService;
import ru.galkin.tasklist.web.dto.auth.JwtRequest;
import ru.galkin.tasklist.web.dto.auth.JwtResponse;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public JwtResponse login(JwtRequest lginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }

}
