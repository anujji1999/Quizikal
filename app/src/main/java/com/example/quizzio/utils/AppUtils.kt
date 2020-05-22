package com.example.quizzio.utils

import android.graphics.drawable.Drawable
import com.example.quizzio.R
import com.example.quizzio.views.ui.CategoryItemType

object AppUtils {

    fun getDrawableIdFromCategoryType(featureType:CategoryItemType):Int{
        return when(featureType){
            CategoryItemType.CATEGORY_ENTERTAINMENT->{
                R.drawable.entertainment
            }
            CategoryItemType.CATEGORY_MUSIC->{
                R.drawable.music
            }
            CategoryItemType.CATEGORY_FOOD_AND_DRINK->{
                R.drawable.food_and_drink
            }
            CategoryItemType.CATEGORY_GENERAL->{
                R.drawable.general
            }
            CategoryItemType.CATEGORY_HISTORY_AND_HOLIDAYS->{
                R.drawable.historyandholidays
            }
            CategoryItemType.CATEGORY_KIDS->{
                R.drawable.kids
            }
            CategoryItemType.CATEGORY_LANGUAGE->{
                R.drawable.language
            }
            CategoryItemType.CATEGORY_MATHEMATICS->{
                R.drawable.mathematics
            }
            CategoryItemType.CATEGORY_PEOPLE_AND_PLACES->{
                R.drawable.people_and_places
            }
            CategoryItemType.CATEGORY_RELIGION_AND_MYTHOLOGY->{
                R.drawable.religion_and_mythology
            }
            CategoryItemType.CATEGORY_SCIENCE_AND_NATURE->{
                R.drawable.science_and_nature
            }
            CategoryItemType.CATEGORY_SPORTS_AND_LEISURE->{
                R.drawable.sportandleisure
            }
            CategoryItemType.CATEGORY_TECH_AND_VIDEO_GAMES->{
                R.drawable.tech_and_video_games
            }
            CategoryItemType.CATEGORY_TOYS_AND_GAMES->{
                R.drawable.toys_and_games
            }
            CategoryItemType.CATEGORY_ART_AND_LITERATURE->{
                R.drawable.art_and_literature
            }
            else->{
                R.drawable.entertainment
            }

        }
    }
}