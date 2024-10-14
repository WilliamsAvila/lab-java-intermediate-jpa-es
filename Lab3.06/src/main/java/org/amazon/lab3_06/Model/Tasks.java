package org.amazon.lab3_06.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Tasks {
    private String title;
    private String dueDate;
    private boolean status;

    public Tasks(String title, String dueDate, boolean status) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }
    public Tasks() {

    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDueDate() {
        return dueDate;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "title='" + title + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", status=" + status +
                '}';
    }
}
