package com.nwafu.driftbottle.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result sucess(){
        return new Result(1,"success",null);
    }

    public static Result error(){
        return new Result(0,"error",null);
    }

    public static Result success(Object obj){
        return new Result(1,"success",obj);
    }
}
