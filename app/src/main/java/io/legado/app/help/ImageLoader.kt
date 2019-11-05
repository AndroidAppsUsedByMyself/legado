package io.legado.app.help

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import java.io.File

object ImageLoader {

    fun load(context: Context, path: String?): RequestBuilder<Drawable> {
        if (path?.startsWith("http", true) == true) {
            return Glide.with(context).load(path)
        }
        kotlin.runCatching {
            return Glide.with(context).load(File(path))
        }
        return Glide.with(context).load(path)
    }

    fun load(context: Context, @DrawableRes resId: Int?): RequestBuilder<Drawable> {
        return Glide.with(context).load(resId)
    }

    fun load(context: Context, file: File?): RequestBuilder<Drawable> {
        return Glide.with(context).load(file)
    }

    fun load(context: Context, uri: Uri?): RequestBuilder<Drawable> {
        return Glide.with(context).load(uri)
    }

    fun load(context: Context, drawable: Drawable?): RequestBuilder<Drawable> {
        return Glide.with(context).load(drawable)
    }

    fun load(context: Context, bitmap: Bitmap?): RequestBuilder<Drawable> {
        return Glide.with(context).load(bitmap)
    }

    fun load(context: Context, bytes: ByteArray?): RequestBuilder<Drawable> {
        return Glide.with(context).load(bytes)
    }

}
