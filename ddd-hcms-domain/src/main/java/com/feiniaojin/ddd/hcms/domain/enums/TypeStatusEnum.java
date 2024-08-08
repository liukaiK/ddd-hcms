package com.feiniaojin.ddd.hcms.domain.enums;

import lombok.Getter;

@Getter
public enum TypeStatusEnum {
    DRAFT(0, "草稿状态"),
    PUBLISH(1, "发布状态"),
    UNPUBLISH(2, "撤回状态");

    private final Integer code;

    private final String name;


    TypeStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
