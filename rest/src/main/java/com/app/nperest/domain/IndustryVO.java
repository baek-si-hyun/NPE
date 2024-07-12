package com.app.nperest.domain;

import io.swagger.annotations.ApiModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@ApiModel(description = "회원 정보")
@Component
@Getter @Setter @ToString(callSuper = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class IndustryVO extends Period implements Serializable {
    private Long id;
    private String industryName;
}
