package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.BaseEntity;

/**
 * GKislin
 * 06.03.2015.
 */
public class LoggedUser {
    public static int id = 1;

    public static int id() {
        return id;
    }

    public static int getCaloriesPerDay() {
        return 2000;
    }

    public static void setId(int id) {
        LoggedUser.id = id;
    }
}
