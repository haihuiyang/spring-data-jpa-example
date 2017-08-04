package com.yhh.spring.data.jpa.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "group")
@AllArgsConstructor
@NoArgsConstructor
public class Group implements Serializable {
    private static final long serialVersionUID = -7238485458544109833L;
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "group_name")
    private String groupName;
}

