package com.web.domain.enums;

/**
 * Created by KimYJ on 2017-07-12.
 */
public enum BoardType {
    notice("��������"),
    free("�����Խ���");

    private String value;

    BoardType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}