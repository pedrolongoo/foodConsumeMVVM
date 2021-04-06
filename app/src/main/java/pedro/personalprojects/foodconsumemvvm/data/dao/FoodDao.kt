package pedro.personalprojects.foodconsumemvvm.data.dao

import androidx.room.*
import pedro.personalprojects.foodconsumemvvm.data.entity.Food

@Dao
interface FoodDao {

    @Insert
    suspend fun save(food : Food)

    @Update
    suspend fun update(food: Food)

    @Delete
    suspend fun delete(food: Food)

    @Query("select * from food")
    suspend fun findAll() : List<Food>

    @Query("select * from food where id = :foodId")
    suspend fun findById(foodId: Int): Food
}