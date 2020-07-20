package com.example.FavouritePlaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PlaceDao {

    @Insert
    void insertAll(Places... places);

    @Delete
    void delete(Places place);

    @Update
    void update(Places place);

    @Query("SELECT * from place_table ORDER BY address ASC")
    List<Places> getPlaces();
}

