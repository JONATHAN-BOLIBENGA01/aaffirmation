package com.example.affirmation.data
import com.example.affirmation.R
import com.example.affirmation.model.Country


class CountrySource {
    fun loadCountrie(): List<Country> {
        return listOf(
            Country("RD congo", "Paris", "FR", R.drawable.rdc),
            Country("Congo braza", "Ottawa", "CA", R.drawable.congobraza),
            Country("Angola", "Tokyo", "JP", R.drawable.angola),
            Country("Republique sud Africain", "Brasília", "BR", R.drawable.rsa),
            Country("Egypte", "Berlin", "DE", R.drawable.egypte) ,
            Country("Algerie", "Berlin", "DE", R.drawable.algerie),
            Country("Mauritanie", "Berlin", "DE", R.drawable.mauritanie),
            Country("Niger", "Berlin", "DE", R.drawable.niger),
            Country("Tunisie", "Berlin", "DE", R.drawable.tunisie)

        )
    }

    companion object {
        fun loadCountrie(): List<Country> {
            return listOf(
                Country("RD congo", "Paris", "FR", R.drawable.rdc),
                Country("Congo braza", "Ottawa", "CA", R.drawable.congobraza),
                Country("Angola", "Tokyo", "JP", R.drawable.angola),
                Country("Republique sud Africain", "Brasília", "BR", R.drawable.rsa),
                Country("Egypte", "Berlin", "DE", R.drawable.egypte) ,
                Country("Algerie", "Berlin", "DE", R.drawable.algerie),
                Country("Mauritanie", "Berlin", "DE", R.drawable.mauritanie),
                Country("Niger", "Berlin", "DE", R.drawable.niger),
                Country("Tunisie", "Berlin", "DE", R.drawable.tunisie)

            )
        }
    }


}