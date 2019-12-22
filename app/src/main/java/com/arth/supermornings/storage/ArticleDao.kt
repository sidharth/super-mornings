package com.arth.supermornings.storage

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ArticleDao {
    @Query("SELECT * FROM article")
    fun getAll(): List<Article>

    @Insert
    fun addAll(vararg articles: Article)

    @Delete
    fun delete(article: Article)
}