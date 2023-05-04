package com.kbstar.dto;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ItemSearch {
    private int id;
    private int price;
    private String imgname;
    private String name;
    private Date rdate;



}
