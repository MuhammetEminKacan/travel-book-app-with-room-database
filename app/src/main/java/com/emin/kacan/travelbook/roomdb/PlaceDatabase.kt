package com.emin.kacan.travelbook.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.emin.kacan.travelbook.model.Place


@Database(entities = [Place ::class], version = 1)
abstract class  PlaceDatabase : RoomDatabase(){
    abstract fun placeDao() : PlaceDao
}