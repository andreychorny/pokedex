package com.example.pokedex.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DbType(
    @PrimaryKey
    val typeId: Long,
    val name: String
)