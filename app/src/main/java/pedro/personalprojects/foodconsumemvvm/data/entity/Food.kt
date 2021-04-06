package pedro.personalprojects.foodconsumemvvm.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food")
data class Food(val name : String,
                val amount: Int,
                val measure: String,
                val kind: String) {

    @PrimaryKey(autoGenerate = true)
    var id : Int? = null
}
