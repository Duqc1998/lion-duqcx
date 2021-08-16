package org.example.Lambda;

import lombok.Getter;

public enum SpecialityEnum {

    SING("",""),

    DANCE("",""),

    SWIMMING("",""),

    RUNNING("","");

    @Getter
    private String code;
    @Getter
    private String desc;

    SpecialityEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
