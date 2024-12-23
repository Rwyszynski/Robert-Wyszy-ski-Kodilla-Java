package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private final String taskName;
    private final String where;
    private final String using;

    private boolean isDone = false;

    public DrivingTask(String taskName, String where, String using){
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        isDone = true;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
