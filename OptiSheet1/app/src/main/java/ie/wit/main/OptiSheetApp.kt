package ie.wit.main

import android.app.Application
import android.util.Log
import ie.wit.models.SheetMemStore
import ie.wit.models.SheetStore

class OptiSheetApp : Application() {

    lateinit var sheetStore: SheetStore

    override fun onCreate() {
        super.onCreate()
        sheetStore = SheetMemStore()
        Log.v("OptiSheet","OptiSheet app started")
    }
}