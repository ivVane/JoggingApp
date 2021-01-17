package com.joggingapp.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converters {

    // Function that takes the Bytes (from the ByteArray we created in the fromBitmap function)
    // and convert them to Bitmap object.
    @TypeConverter
    fun toBitmap(bytes: ByteArray): Bitmap {
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
    }

    // This function will take a Bitmap as a parameter and will return a ByteArray
    // we want to use to save the Bitmap into the RoomDatabase (the Bitmap will be
    // convert to ByteArray and that ByteArray will be saved into the Database).
    @TypeConverter
    fun fromBitmap(bmp: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }
}