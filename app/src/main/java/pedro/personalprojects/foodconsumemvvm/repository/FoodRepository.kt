package pedro.personalprojects.foodconsumemvvm.repository

import pedro.personalprojects.foodconsumemvvm.data.db.FoodDb
import pedro.personalprojects.foodconsumemvvm.data.entity.Food

class FoodRepository {

    private val dao = FoodDb.instance.foodDao()

    suspend fun save(food: Food){
        dao.save(food)
    }

    suspend fun findAll(): List<Food>{
        return dao.findAll()
    }
}