package com.example.quizzio.utils;
//
//import android.content.res.Resources
//import android.content.res.TypedArray
//import android.graphics.drawable.Drawable
//import android.text.Html
//import android.text.Spanned
//import android.text.TextUtils
//import androidx.core.content.res.ResourcesCompat
//import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
//import com.appwarp.instatools.App
//
//object ResourceUtils {
//
//    internal var resources: Resources
//    internal val PACKAGE_NAME: String
//
//    init {
//        resources = App.context.resources
//        PACKAGE_NAME = App.context.packageName
//    }
//
//    fun toColor(colorId: Int): Int {
//        return resources.getColor(colorId)
//    }
//
//    fun toDimen(dimenId: Int): Float {
//        return resources.getDimension(dimenId)
//    }
//
//    fun toInt(resId: Int): Int {
//        return resources.getInteger(resId)
//    }
//
//    @JvmStatic
//    fun toString(stringId: Int): String {
//        return resources.getString(stringId)
//    }
//
//    fun toHtmlSpan(stringId: Int): Spanned {
//        return Html.fromHtml(resources.getString(stringId))
//    }
//
//    fun toVectorDrawable(drawableId: Int): VectorDrawableCompat? {
//        return VectorDrawableCompat.create(resources, drawableId, App.context.theme)
//    }
//
//    fun toDrawable(drawableId: Int): Drawable? {
//        return ResourcesCompat.getDrawable(resources, drawableId, App.context.theme)
//    }
//
//    fun toDrawable(iconName: String): Drawable? {
//        return if (TextUtils.isEmpty(iconName)) null else toDrawable(toResId(iconName, "drawable"))
//
//    }
//
//    fun toResId(identifier: String, defType: String): Int {
//        return if (TextUtils.isEmpty(identifier)) 0 else resources.getIdentifier(
//            identifier,
//            defType,
//            App.context.packageName
//        )
//
//    }
//
//    fun toDrawableResId(identifier: String): Int {
//        return toResId(identifier, "drawable")
//    }
//
//    fun toString(vararg stringIds: Int): String {
//        val builder = StringBuilder()
//
//        for (i in stringIds.indices) {
//            builder.append(toString(stringIds[i]))
//        }
//        return builder.toString()
//    }
//
//    fun toStringArray(arrayId: Int): Array<String> {
//        return resources.getStringArray(arrayId)
//    }
//
//    fun toIntArray(arrayId: Int): IntArray {
//        return resources.getIntArray(arrayId)
//    }
//
//
//    fun getStyle(styleId: Int, attrs: IntArray): TypedArray {
//        return App.context.obtainStyledAttributes(styleId, attrs)
//    }
//
//    fun getPixelSizeForDimen(dimenId: Int): Int {
//        return resources.getDimensionPixelSize(dimenId)
//    }
//
//    fun toStringFormat(stringId: Int, vararg args: Any): String {
//        return resources.getString(stringId, *args)
//    }
//
//    /* toPluralString : basically format string+returns string based on quantity */
//    fun toPluralString(pluralStringId: Int, quantity: Int, vararg args: Any): String {
//        return resources.getQuantityString(pluralStringId, quantity, *args)
//    }
//
//}