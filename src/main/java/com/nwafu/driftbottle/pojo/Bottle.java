package com.nwafu.driftbottle.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bottle {
    private Integer id;
    private String content;
    private LocalDateTime putTime;
    private LocalDateTime takeTime;
    private Short status;
    private String putName;
}
