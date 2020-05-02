package ie.wit.models

import android.util.Log

var lastId = 0L

internal fun getId(): Long {
    return lastId++
}

class SheetMemStore : SheetStore {

        val donations = ArrayList<SheetModel>()

        override fun findAll(): List<SheetModel> {
            return donations
        }

        override fun findById(id:Long) : SheetModel? {
            val foundSheet: SheetModel? = donations.find { it.id == id }
            return foundSheet
        }

        override fun create(sheet: SheetModel) {
            sheet.id = getId()
            donations.add(sheet)
            logAll()
        }

        fun logAll() {
            Log.v("Sheet","** Sheets List **")
            donations.forEach { Log.v("Sheet","${it}") }
        }
    }
