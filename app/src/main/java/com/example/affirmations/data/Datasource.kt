package com.example.affirmations.data

import com.example.affirmations.model.Affirmation
import com.putri.recyclerviewapp.R

// TODO 3: menyiapkan suatu list yang memanggil string Affirmation di string.xml
// pada class Datasource digunakan untuk menyiapkan list yang akan memanggil string Affirmation pada
// string.xml yang ditempatkan sesuai name affirmationnya.
class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}