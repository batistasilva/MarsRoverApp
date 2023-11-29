package com.example.mainrover.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface MarsRoverSavedPhotoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(marsRoverSavedLocalModel: MarsRoverSavedLocalModel)
}