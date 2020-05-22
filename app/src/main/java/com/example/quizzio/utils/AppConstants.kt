package com.example.quizzio.utils

import com.example.quizzio.views.fragments.EntertainmentFragment
import com.example.quizzio.views.fragments.HomeFragment

object AppConstants {

    const val BASE_URL = "https://quizikal.herokuapp.com/api/v1/"

    var categoryType = "categoryType"
    var categoryTag = "categoryTag"
    var colorId = "colorId"

    object CategoryTag{
        var Entertainment = "Entertainment"
        var Music = "Music"
        var General = "General"
        var SportsAndLeisure = "Sports and Leisure"
        var HistoryAndHolidays = "History and Holidays"
        var FoodAndDrink = "Food and Drinks"
        var ToysAndGames = "Toys and Games"
        var ScienceAndNature = "Science and Nature"
        var PeopleAndPlaces = "People and Places"
        var Language = "Language"
        var Kids = "Kids"
        var ReligionAndMythology = "Religion and Mythology"
        var ArtAndLiterature = "Art and Literature"
        var TechAndVideoGames = "Tech and Video Games"
        var Mathematics = "Mathematics"
    }
}