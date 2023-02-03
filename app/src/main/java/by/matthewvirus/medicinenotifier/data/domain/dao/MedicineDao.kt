package by.matthewvirus.medicinenotifier.data.domain.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import by.matthewvirus.medicinenotifier.data.model.Medicine
import java.util.*

@Dao
interface MedicineDao {

    @Query("SELECT * FROM medicine")
    fun getMedicines(): LiveData<List<Medicine>>

    @Insert
    fun addMedicine(medicine: Medicine)

    @Delete
    fun deleteMedicine(medicine: Medicine)

    @Update
    fun updateMedicine(medicine: Medicine)
}