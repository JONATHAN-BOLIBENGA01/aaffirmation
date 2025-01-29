package com.example.affirmation.data
import com.example.affirmation.R
import com.example.affirmation.model.Country


class CountrySource {

    companion object {
        fun loadCountrie(): List<Country> {
            return listOf(
                Country("RD congo", "Kinshasa", "243", R.drawable.rdc),
                Country("Congo braza", "Brazavile", "", R.drawable.congobraza),
                Country("Angola", "Lunada", "", R.drawable.angola),
                Country("Republique sud Africain", "", "BR", R.drawable.rsa),
                Country("Egypte", "Caire", "DE", R.drawable.egypte) ,
                Country("Algerie", "Alger", "DE", R.drawable.algerie),
                Country("Mauritanie", "Nouakchott", "DE", R.drawable.mauritanie),
                Country("Niger", "Niamey", "DE", R.drawable.niger),
                Country("Tunisie", "Tunis", "DE", R.drawable.tunisie)

            )
        }
    }


}