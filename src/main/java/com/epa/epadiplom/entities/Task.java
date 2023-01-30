package com.epa.epadiplom.entities;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Task {

    //Columns in table Task
    @Id
    private long id;
    private Date date_task;
    private String name_of_task;





    // Getters, setters, constructors for Task
    public Task() {
    }
    public Task(Date date_task, String name_of_task, Set<Employee> employees) {
        this.date_task = date_task;
        this.name_of_task = name_of_task;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Date getDate_task() {
        return date_task;
    }
    public void setDate_task(Date date_task) {
        this.date_task = date_task;
    }
    public String getName_of_task() {
        return name_of_task;
    }
    public void setName_of_task(String name_of_task) {
        this.name_of_task = name_of_task;
    }


    //Standard methods
    @Override
    public String toString() {
        return "Task {" +
                "id = " + id +
                ", date_task = " + date_task +
                ", name_of_task = '" + name_of_task + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
