<<<<<<< HEAD
package com.test_spring_boot.test_spring_boot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;
    private Date dueData;
    private Boolean completed;

    @ManyToOne
    private Project project;

    @ManyToOne
    private User user;
}
=======
package com.test_spring_boot.test_spring_boot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;
    private Date dueData;
    private Boolean completed;

    @ManyToOne
    private Project project;

    @ManyToOne
    private User user;
}
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
