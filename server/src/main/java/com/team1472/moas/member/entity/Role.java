package com.team1472.moas.member.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    USER("ROLE_USER", "사용자"),
    SUSPENDED_USER("SUSPENDED_USER","정지된 사용자"),
    BLOCKED_USER("BLOCKED_USER","차단된 사용자"),
    ADMIN("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;
}
