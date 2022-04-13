package com.vedatdemirdev;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "My Pet Object", description = "My Pet")
public class Pet {
    @ApiModelProperty(value = "Uniqe id of Pet Object")
    private int id;
    @ApiModelProperty(value = "Name of Pet Object")
    private String name;
    @ApiModelProperty(value = "Date of Pet Object")
    private Date date;
}
