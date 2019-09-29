package com.example.aruna.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MyUserDetail implements UserDetails{

    private String userName;
    private String password;
    private boolean active = true;
    private List<GrantedAuthority> authorities;

    public MyUserDetail() {
    }

    public MyUserDetail(AppUser appUser) {
        this.userName = appUser.getUserName();
        this.password = appUser.getPassword();
        this.authorities = Arrays.asList(appUser.getRoles().split(",")).stream().map(SimpleGrantedAuthority :: new).collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
