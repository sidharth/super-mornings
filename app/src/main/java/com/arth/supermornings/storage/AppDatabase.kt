package com.arth.supermornings.storage

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Article::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
}