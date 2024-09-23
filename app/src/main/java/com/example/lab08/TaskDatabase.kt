package com.example.lab08

import androidx.room.Database
import androidx.room.RoomDatabase

//@Database: Marca esta clase como la base de datos de Room.
// Define qué entidades manejará (Task) y la versión de la base de datos.
@Database(entities = [Task::class], version = 1)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}