package org.amazon.lab3_06.Model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InternalTask {
    @Id
    private Long id;
    @Embedded
    Tasks tasks;

    public InternalTask(Long id, Tasks tasks) {
        this.id = id;
        this.tasks = tasks;
    }
    public InternalTask() {

    }

    public Long getId() {
        return id;
    }
    public Tasks getTasks() {
        return tasks;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "InternalTask{" +
                "id=" + id +
                ", tasks=" + tasks +
                '}';
    }
}
