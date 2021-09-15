package com.example.peridoictable

object Data {

    fun getData(): List<PeriodTableModel> {
        val elementList: ArrayList<PeriodTableModel> = arrayListOf()

        val hydrogen = PeriodTableModel(
            id = "1", name = "Hydrogen",
            atomic_mass = "1.008",
            symbol = "H",
        )


        val helium = PeriodTableModel(
            id = "2",
            name = "Helium",
            atomic_mass = "4.0026022",
            symbol = "He",


            )

        val lithium = PeriodTableModel(
            id = " 3",
            name = "Lithium",
            atomic_mass = "6.94",
            symbol = "Li",


            )

        val beryllium = PeriodTableModel(
            id = "4",
            name = "Beryllium",
            atomic_mass = "9.0121831",
            symbol = "Be",

            )

        val boron = PeriodTableModel(
            id = "5",
            name = "Boron",
            atomic_mass = "10.81",
            symbol = "B",


            )

        val carbon = PeriodTableModel(
            id = "6",
            name = "Carbon",
            atomic_mass = "12.011",
            symbol = "C",
        )


        val nitrogen = PeriodTableModel(
            id = "7",
            name = "Nitrogen",
            atomic_mass = "14.007",
            symbol = "N",
        )

        val oxygen = PeriodTableModel(
            id = "8",
            name = "Oxygen",
            atomic_mass = "15.999",
            symbol = "O",
        )

        val fluorine = PeriodTableModel(
            id = "8",
            name = "Fluorine",
            atomic_mass = "18.9984031636",
            symbol = "F",
        )
        val emptyItem = PeriodTableModel(
            id = "",
            name = "",
            atomic_mass = "",
            symbol = ""


        )

       for(x in 0..40){
           for(y in 0..9){
               elementList.add(fluorine)
               elementList.add(oxygen)
           }

           elementList.add(emptyItem)
           elementList.add(fluorine)
       }
        elementList.add(emptyItem)
        elementList.add(fluorine)
        elementList.add(fluorine)
        elementList.add(fluorine)
        elementList.add(oxygen)


        return elementList
    }


}