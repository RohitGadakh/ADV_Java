package com.app.pojos;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long Id;
}
