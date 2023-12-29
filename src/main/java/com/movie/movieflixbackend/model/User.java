package com.movie.movieflixbackend.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Users")
public class User {
        @Id
        @GeneratedValue
        private Long id;

        @Column(name = "username", length = 20)
        private String userName;

        @Column(name = "for_name", length = 25)
        private String firstName;
        @Column(name = "last_name", length = 25)
        private String lastName;

        @Column(name = "role")
        private String roleUser;
        private LocalDate dob;


        public Long getId() {
            return id;
        }

        public String getUsername() {
            return userName;
        }

        public String getForName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public LocalDate getDob() {
            return dob;
        }

        public String getRoleUser() {
            return roleUser;
        }

        //setters

        void setUserName(String userName) {
            this.userName = userName;
        }

        void setForName(String firstName) {
            this.firstName = firstName;
        }

        void setLastName(String lastName) {
            this.lastName = lastName;
        }

        void setRoleUser(String roleUser) {
            this.roleUser = roleUser;
        }
        void setDob(LocalDate dob) {
            this.dob = dob;
        }
}
