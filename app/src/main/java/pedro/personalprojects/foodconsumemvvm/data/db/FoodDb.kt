package pedro.personalprojects.foodconsumemvvm.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import pedro.personalprojects.foodconsumemvvm.data.dao.FoodDao
import pedro.personalprojects.foodconsumemvvm.data.entity.Food

@Database(
    entities = [Food::class],
    version = 1
)

abstract class FoodDb : RoomDatabase() {

    abstract fun foodDao(): FoodDao

    companion object{
        private const val DATABASE_NAME = "db_medicine"
        private lateinit var mInstance: FoodDb

        val instance
            get() = mInstance

        fun inicializate(context: Context) {
            mInstance = Room.databaseBuilder(context, FoodDb::class.java, DATABASE_NAME).build()
        }
    }
}