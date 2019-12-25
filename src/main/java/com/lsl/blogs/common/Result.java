package com.lsl.blogs.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Data
@Getter
@Setter
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -7089837657665109071L;

    private Boolean success;

    private String msg;

    private String code;

    private T t;

}
