package org.amazon.lab3_06.Model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BillableTask {
    @Id
    @GeneratedValue
    private Long id;
    private int hourlyRate;
    @Embedded
    Tasks tasks;

    public BillableTask(Long id, int hourlyRate, Tasks tasks) {
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.tasks = tasks;
    }
    public BillableTask() {

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public Tasks getTasks() {
        return tasks;
    }
    public void setTasks(Tasks tasks) {
        this.tasks = tasks;
    }
    @Override
    public String toString() {
        return "BillableTask{" +
                "id=" + id +
                ", hourlyRate=" + hourlyRate +
                ", tasks=" + tasks +
                '}';
    }
}
