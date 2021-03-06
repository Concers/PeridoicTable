package com.example.peridoictable.mockdata

import com.example.peridoictable.mockdata.model.PeriodTableModel

object Data {

    fun getData(): List<PeriodTableModel> {
        val elementList: ArrayList<PeriodTableModel> = arrayListOf()


        val hydrogen = PeriodTableModel(
            name = "Hydrogen",
            atomicnumber = 1,
            symbol = "H",
            category = ElementGroup.NOBLEGAS,
            atomicweight = "1.008",
            atomicweightfull = "[1.00784, 1.00811]",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 1,
            period = 1,
            block = "s",
            tablerow18col = 1,
            tablecolumn18col = 1,
            visible = true

        )

        val helium = PeriodTableModel(
            name = "Helium",
            atomicnumber = 2,
            symbol = "He",
            category = ElementGroup.NOBLEGAS,
            atomicweight = "4.0026",
            atomicweightfull = "4.002602(2)",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 18,
            period = 1,
            block = "s",
            tablerow18col = 1,
            tablecolumn18col = 18,
            visible = true
        )

        val lithium = PeriodTableModel(
            name = "Lithium",
            atomicnumber = 3,
            symbol = "Li",
            category = ElementGroup.ALKALIMETAL,
            atomicweight = "6.94",
            atomicweightfull = "[6.938, 6.997]",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 1,
            period = 2,
            block = "s",
            tablerow18col = 2,
            tablecolumn18col = 1,
            visible = true
        )


        val beryllium = PeriodTableModel(
            name = "Beryllium",
            atomicnumber = 4,
            symbol = "Be",
            category = ElementGroup.ALKALINEEARTH_METAL,
            atomicweight = "9.0122",
            atomicweightfull = "9.0121831(5)",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 2,
            period = 2,
            block = "s",
            tablerow18col = 2,
            tablecolumn18col = 2,
            visible = true
        )
        val boron = PeriodTableModel(
            name = "Boron",
            atomicnumber = 5,
            symbol = "B",
            category = ElementGroup.METALLOID,
            atomicweight = "10.81",
            atomicweightfull = "[10.806, 10.821]",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 13,
            period = 2,
            block = "p",
            tablerow18col = 2,
            tablecolumn18col = 13,
            visible = true

        )


        val carbon = PeriodTableModel(

            name = "Carbon",
            atomicnumber = 6,
            symbol = "C",
            category = ElementGroup.NONMETAL,
            atomicweight = "12.011",
            atomicweightfull = "[12.0096, 12.0116]",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 14,
            period = 2,
            block = "p",
            tablerow18col = 2,
            tablecolumn18col = 14,
            visible = true
        )

        val nitrogen = PeriodTableModel(
            name = "Nitrogen",
            atomicnumber = 7,
            symbol = "N",
            category = ElementGroup.NONMETAL,
            atomicweight = "14.007",
            atomicweightfull = "[14.00643, 14.00728]",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 15,
            period = 2,
            block = "p",
            tablerow18col = 2,
            tablecolumn18col = 15,
            visible = true

        )

        val oxygen = PeriodTableModel(

            name = "Oxygen",
            atomicnumber = 8,
            symbol = "O",
            category = ElementGroup.NONMETAL,
            atomicweight = "15.999",
            atomicweightfull = "[15.99903, 15.99977]",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 16,
            period = 2,
            block = "p",
            tablerow18col = 2,
            tablecolumn18col = 16,
            visible = true
        )

        val fluorine = PeriodTableModel(
            name = "Fluorine",
            atomicnumber = 9,
            symbol = "F",
            category = ElementGroup.NONMETAL,
            atomicweight = "18.998",
            atomicweightfull = "18.998403163(6)",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 17,
            period = 2,
            block = "p",
            tablerow18col = 2,
            tablecolumn18col = 17,
            visible = true
        )

        val neon = PeriodTableModel(
            name = "Neon",
            atomicnumber = 10,
            symbol = "Ne",
            category = ElementGroup.NOBLEGAS,
            atomicweight = "20.18",
            atomicweightfull = "20.1797(6)",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 18,
            period = 2,
            block = "p",
            tablerow18col = 2,
            tablecolumn18col = 18,
            visible = true
        )

        val sodium = PeriodTableModel(
            name = "Sodium",
            atomicnumber = 11,
            symbol = "Na",
            category = ElementGroup.ALKALIMETAL,
            atomicweight = "22.99",
            atomicweightfull = "22.98976928(2) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 1,
            period = 3,
            block = "s",
            tablerow18col = 3,
            tablecolumn18col = 1,
            visible = true
        )
        val magnesium = PeriodTableModel(
            name = "Magnesium",
            atomicnumber = 12,
            symbol = "Mg",
            category = ElementGroup.ALKALINEEARTH_METAL,
            atomicweight = "24.305",
            atomicweightfull = "[24.304, 24.307] ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 2,
            period = 3,
            block = "s",
            tablerow18col = 3,
            tablecolumn18col = 2,
            visible = true
        )


        val aluminum = PeriodTableModel(

            name = "Aluminium",
            atomicnumber = 13,
            symbol = "Al",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "26.982",
            atomicweightfull = "26.9815384(3) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 13,
            period = 3,
            block = "p",
            tablerow18col = 3,
            tablecolumn18col = 13,
            visible = true
        )

        val silicon = PeriodTableModel(
            name = "Silicon",
            atomicnumber = 14,
            symbol = "Si",
            category = ElementGroup.METALLOID,
            atomicweight = "28.085",
            atomicweightfull = "[28.084, 28.086] ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 14,
            period = 3,
            block = "p",
            tablerow18col = 3,
            tablecolumn18col = 14,
            visible = true
        )

        val phosphorus = PeriodTableModel(
            name = "Phosphorus",
            atomicnumber = 15,
            symbol = "P",
            category = ElementGroup.NONMETAL,
            atomicweight = "30.974",
            atomicweightfull = "30.973761998(5) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 15,
            period = 3,
            block = "p",
            tablerow18col = 3,
            tablecolumn18col = 15,
            visible = true
        )

        val sulfur = PeriodTableModel(
            name = "Sulfur",
            atomicnumber = 16,
            symbol = "S",
            category = ElementGroup.NONMETAL,
            atomicweight = "32.06",
            atomicweightfull = "[32.059, 32.076] ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 16,
            period = 3,
            block = "p",
            tablerow18col = 3,
            tablecolumn18col = 16,
            visible = true
        )

        val calcium = PeriodTableModel(
            name = "Calcium",
            atomicnumber = 20,
            symbol = "Ca",
            category = ElementGroup.ALKALINEEARTH_METAL,
            atomicweight = "40.078",
            atomicweightfull = "40.078(4) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 2,
            period = 4,
            block = "s",
            tablerow18col = 4,
            tablecolumn18col = 2,
            visible = true
        )
        val potassium = PeriodTableModel(
            name = "Potassium",
            atomicnumber = 19,
            symbol = "K",
            category = ElementGroup.ALKALIMETAL,
            atomicweight = "39.098",
            atomicweightfull = "39.0983(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 1,
            period = 4,
            block = "s",
            tablerow18col = 4,
            tablecolumn18col = 1,
            visible = true
        )
        val chlorine = PeriodTableModel(
            name = "Chlorine",
            atomicnumber = 17,
            symbol = "Cl",
            category = ElementGroup.NONMETAL,
            atomicweight = "35.45",
            atomicweightfull = "[35.446, 35.457] ",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 17,
            period = 3,
            block = "p",
            tablerow18col = 3,
            tablecolumn18col = 17,
            visible = true
        )
        val argon = PeriodTableModel(
            name = "Argon",
            atomicnumber = 18,
            symbol = "Ar",
            category = ElementGroup.NOBLEGAS,
            atomicweight = "39.95",
            atomicweightfull = "[39.792, 39.963] ",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 18,
            period = 3,
            block = "p",
            tablerow18col = 3,
            tablecolumn18col = 18,
            visible = true
        )


        val scandium = PeriodTableModel(
            name = "Scandium",
            atomicnumber = 21,
            symbol = "Sc",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "44.956",
            atomicweightfull = "44.955908(5) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 3,
            period = 4,
            block = "d",
            tablerow18col = 4,
            tablecolumn18col = 3,
            visible = true
        )

        val titanium = PeriodTableModel(

            name = "Titanium",
            atomicnumber = 22,
            symbol = "Ti",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "47.867",
            atomicweightfull = "47.867(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 4,
            period = 4,
            block = "d",
            tablerow18col = 4,
            tablecolumn18col = 4,
            visible = true
        )


        val vanadium = PeriodTableModel(

            name = "Vanadium",
            atomicnumber = 23,
            symbol = "V",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "50.942",
            atomicweightfull = "50.9415(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 5,
            period = 4,
            block = "d",
            tablerow18col = 4,
            tablecolumn18col = 5,
            visible = true
        )

        val chromium = PeriodTableModel(
            name = "Chromium",
            atomicnumber = 24,
            symbol = "Cr",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "51.996",
            atomicweightfull = "51.9961(6) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 6,
            period = 4,
            block = "d",
            tablerow18col = 4,
            tablecolumn18col = 6,
            visible = true
        )



        val iron = PeriodTableModel(

            name = "Iron",
            atomicnumber = 26,
            symbol = "Fe",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "55.845",
            atomicweightfull = "55.845(2) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 8,
            period = 4,
            block = "d",
            tablerow18col = 4,
            tablecolumn18col = 8,
            visible = true
        )


        val cobalt = PeriodTableModel(
            name = "Cobalt",
            atomicnumber = 27,
            symbol = "Co",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "58.933",
            atomicweightfull = "58.933194(3) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 9,
            period = 4,
            block = "d",
            tablerow18col = 4,
            tablecolumn18col = 9,
            visible = true
        )
        val nickel = PeriodTableModel(
            name = "Nickel",
            atomicnumber = 28,
            symbol = "Ni",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "58.693",
            atomicweightfull = "58.6934(4) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 10,
            period = 4,
            block = "d",
            tablerow18col = 4,
            tablecolumn18col = 10,
            visible = true
        )
        val copper = PeriodTableModel(
            name = "Copper",
            atomicnumber = 29,
            symbol = "Cu",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "63.546",
            atomicweightfull = "63.546(3) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 11,
            period = 4,
            block = "d",
            tablerow18col = 4,
            tablecolumn18col = 11,
            visible = true
        )


        val zinc = PeriodTableModel(
            name = "Zinc",
            atomicnumber = 30,
            symbol = "Zn",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "65.38",
            atomicweightfull = "65.38(2) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 12,
            period = 4,
            block = "d",
            tablerow18col = 4,
            tablecolumn18col = 12,
            visible = true
        )

        val gallium = PeriodTableModel(
            name = "Gallium",
            atomicnumber = 31,
            symbol = "Ga",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "69.723",
            atomicweightfull = "69.723(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 13,
            period = 4,
            block = "p",
            tablerow18col = 4,
            tablecolumn18col = 13,
            visible = true
        )

        val germanium = PeriodTableModel(
            name = "Germanium",
            atomicnumber = 32,
            symbol = "Ge",
            category = ElementGroup.METALLOID,
            atomicweight = "72.63",
            atomicweightfull = "72.630(8) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 14,
            period = 4,
            block = "p",
            tablerow18col = 4,
            tablecolumn18col = 14,
            visible = true
        )

        val arsenic = PeriodTableModel(
            name = "Arsenic",
            atomicnumber = 33,
            symbol = "As",
            category = ElementGroup.METALLOID,
            atomicweight = "74.922",
            atomicweightfull = "74.921595(6) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 15,
            period = 4,
            block = "p",
            tablerow18col = 4,
            tablecolumn18col = 15,
            visible = true
        )

        val selenium = PeriodTableModel(
            name = "Selenium",
            atomicnumber = 34,
            symbol = "Se",
            category = ElementGroup.NONMETAL,
            atomicweight = "78.971",
            atomicweightfull = "78.971(8) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 16,
            period = 4,
            block = "p",
            tablerow18col = 4,
            tablecolumn18col = 16,
            visible = true
        )

        val bromine = PeriodTableModel(
            name = "Bromine",
            atomicnumber = 35,
            symbol = "Br",
            category = ElementGroup.NONMETAL,
            atomicweight = "79.904",
            atomicweightfull = "[79.901, 79.907] ",
            occurrence = "Liquid",
            stateofmatter = "Primordial",
            group = 17,
            period = 4,
            block = "p",
            tablerow18col = 4,
            tablecolumn18col = 17,
            visible = true
        )

        val kryton = PeriodTableModel(
            name = "Krypton",
            atomicnumber = 36,
            symbol = "Kr",
            category = ElementGroup.NOBLEGAS,
            atomicweight = "83.798",
            atomicweightfull = "83.798(2) ",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 18,
            period = 4,
            block = "p",
            tablerow18col = 4,
            tablecolumn18col = 18,
            visible = true
        )


        val rubidiu = PeriodTableModel(
            name = "Rubidium",
            atomicnumber = 37,
            symbol = "Rb",
            category = ElementGroup.ALKALIMETAL,
            atomicweight = "85.468",
            atomicweightfull = "85.4678(3) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 1,
            period = 5,
            block = "s",
            tablerow18col = 5,
            tablecolumn18col = 1,
            visible = true
        )

        val strontium = PeriodTableModel(
            name = "Strontium",
            atomicnumber = 38,
            symbol = "Sr",
            category = ElementGroup.ALKALINEEARTH_METAL,
            atomicweight = "87.62",
            atomicweightfull = "87.62(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 2,
            period = 5,
            block = "s",
            tablerow18col = 5,
            tablecolumn18col = 2,
            visible = true
        )

        val yttrium = PeriodTableModel(

            name = "Yttrium",
            atomicnumber = 39,
            symbol = "Y",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "88.906",
            atomicweightfull = "88.90584(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 3,
            period = 5,
            block = "d",
            tablerow18col = 5,
            tablecolumn18col = 3,
            visible = true
        )

        val zirconium = PeriodTableModel(


            name = "Zirconium",
            atomicnumber = 40,
            symbol = "Zr",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "91.224",
            atomicweightfull = "91.224(2) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 4,
            period = 5,
            block = "d",
            tablerow18col = 5,
            tablecolumn18col = 4,
            visible = true
        )



        val molybdenum = PeriodTableModel(
            name = "Molybdenum",
            atomicnumber = 42,
            symbol = "Mo",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "95.95",
            atomicweightfull = "95.95(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 6,
            period = 5,
            block = "d",
            tablerow18col = 5,
            tablecolumn18col = 6,
            visible = true
        )


        val tecnetium = PeriodTableModel(

            name = "Technetium",
            atomicnumber = 43,
            symbol = "Tc",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "[97]",
            atomicweightfull = "-",
            occurrence = "Solid",
            stateofmatter = "From decay",
            group = 7,
            period = 5,
            block = "d",
            tablerow18col = 5,
            tablecolumn18col = 7,
            visible = true
        )

        val ruthenium = PeriodTableModel(
            name = "Ruthenium",
            atomicnumber = 44,
            symbol = "Ru",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "101.07",
            atomicweightfull = "101.07(2) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 8,
            period = 5,
            block = "d",
            tablerow18col = 5,
            tablecolumn18col = 8,
            visible = true
        )



        val palladium = PeriodTableModel(
            name = "Palladium",
            atomicnumber = 46,
            symbol = "Pd",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "106.42",
            atomicweightfull = "106.42(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 10,
            period = 5,
            block = "d",
            tablerow18col = 5,
            tablecolumn18col = 10,
            visible = true
        )

        val silver = PeriodTableModel(
            name = "Silver",
            atomicnumber = 47,
            symbol = "Ag",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "107.87",
            atomicweightfull = "107.8682(2) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 11,
            period = 5,
            block = "d",
            tablerow18col = 5,
            tablecolumn18col = 11,
            visible = true
        )

        val cadmium = PeriodTableModel(

            name = "Cadmium",
            atomicnumber = 48,
            symbol = "Cd",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "112.41",
            atomicweightfull = "112.414(4) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 12,
            period = 5,
            block = "d",
            tablerow18col = 5,
            tablecolumn18col = 12,
            visible = true
        )
        val indium = PeriodTableModel(
            name = "Indium",
            atomicnumber = 49,
            symbol = "In",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "114.82",
            atomicweightfull = "114.818(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 13,
            period = 5,
            block = "p",
            tablerow18col = 5,
            tablecolumn18col = 13,
            visible = true
        )

        val tin = PeriodTableModel(
            name = "Tin",
            atomicnumber = 50,
            symbol = "Sn",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "118.71",
            atomicweightfull = "118.710(7) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 14,
            period = 5,
            block = "p",
            tablerow18col = 5,
            tablecolumn18col = 14,
            visible = true
        )

        val antimony = PeriodTableModel(
            name = "Antimony",
            atomicnumber = 51,
            symbol = "Sb",
            category = ElementGroup.METALLOID,
            atomicweight = "121.76",
            atomicweightfull = "121.760(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 15,
            period = 5,
            block = "p",
            tablerow18col = 5,
            tablecolumn18col = 15,
            visible = true
        )

        val tellurium = PeriodTableModel(
            name = "Tellurium",
            atomicnumber = 52,
            symbol = "Te",
            category = ElementGroup.METALLOID,
            atomicweight = "127.6",
            atomicweightfull = "127.60(3) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 16,
            period = 5,
            block = "p",
            tablerow18col = 5,
            tablecolumn18col = 16,
            visible = true
        )

        val iodine = PeriodTableModel(
            name = "Iodine",
            atomicnumber = 53,
            symbol = "I",
            category = ElementGroup.NONMETAL,
            atomicweight = "126.9",
            atomicweightfull = "126.90447(3) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 17,
            period = 5,
            block = "p",
            tablerow18col = 5,
            tablecolumn18col = 17,
            visible = true
        )

        val xenon = PeriodTableModel(
            name = "Xenon",
            atomicnumber = 54,
            symbol = "Xe",
            category = ElementGroup.NOBLEGAS,
            atomicweight = "131.29",
            atomicweightfull = "131.293(6) ",
            occurrence = "Gas",
            stateofmatter = "Primordial",
            group = 18,
            period = 5,
            block = "p",
            tablerow18col = 5,
            tablecolumn18col = 18,
            visible = true
        )


        val barium = PeriodTableModel(
            name = "Barium",
            atomicnumber = 56,
            symbol = "Ba",
            category = ElementGroup.ALKALINEEARTH_METAL,
            atomicweight = "137.33",
            atomicweightfull = "137.327(7) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 2,
            period = 6,
            block = "s",
            tablerow18col = 6,
            tablecolumn18col = 2,
            visible = true
        )
        val lanthanum = PeriodTableModel(
            name = "Lanthanum",
            atomicnumber = 57,
            symbol = "La",
            category = ElementGroup.LANTHANIDE,
            atomicweight = "138.91",
            atomicweightfull = "138.90547(7) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 3,
            period = 6,
            block = "d",
            tablerow18col = 6,
            tablecolumn18col = 3,
            visible = true
        )

        val cerium = PeriodTableModel(
            name = "Cerium",
            atomicnumber = 58,
            symbol = "Ce",
            category = ElementGroup.LANTHANIDE,
            atomicweight = "140.12",
            atomicweightfull = "140.116(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 0,
            period = 6,
            block = "f",
            tablerow18col = 8,
            tablecolumn18col = 4,
            visible = true
        )

        val praseodymium = PeriodTableModel(
            name = "Praseodymium",
            atomicnumber = 59,
            symbol = "Pr",
            category = ElementGroup.LANTHANIDE,
            atomicweight = "140.91",
            atomicweightfull = "140.90766(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 0,
            period = 6,
            block = "f",
            tablerow18col = 8,
            tablecolumn18col = 5,
            visible = true
        )

        val neodymium = PeriodTableModel(
            name = "Neodymium",
            atomicnumber = 60,
            symbol = "Nd",
            category = ElementGroup.LANTHANIDE,
            atomicweight = "144.24",
            atomicweightfull = "144.242(3) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 0,
            period = 6,
            block = "f",
            tablerow18col = 8,
            tablecolumn18col = 6,
            visible = true
        )


        val promethium = PeriodTableModel(
            name = "Promethium",
            atomicnumber = 61,
            symbol = "Pm",
            category = ElementGroup.LANTHANIDE,
            atomicweight = "[145]",
            atomicweightfull = "-",
            occurrence = "Solid",
            stateofmatter = "From decay",
            group = 0,
            period = 6,
            block = "f",
            tablerow18col = 8,
            tablecolumn18col = 7,
            visible = true


        )

        val samarium = PeriodTableModel(
            name = "Samarium",
            atomicnumber = 62,
            symbol = "Sm",
            category = ElementGroup.LANTHANIDE,
            atomicweight = "150.36",
            atomicweightfull = "150.36(2) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 0,
            period = 6,
            block = "f",
            tablerow18col = 8,
            tablecolumn18col = 8,
            visible = true

        )






        val hafnium = PeriodTableModel(
            name = "Hafnium",
            atomicnumber = 72,
            symbol = "Hf",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "178.49",
            atomicweightfull = "178.49(2) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 4,
            period = 6,
            block = "d",
            tablerow18col = 6,
            tablecolumn18col = 4,
            visible = true

        )

        val tantalum = PeriodTableModel(

            name = "Tantalum",
            atomicnumber = 73,
            symbol = "Ta",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "180.95",
            atomicweightfull = "180.94788(2) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 5,
            period = 6,
            block = "d",
            tablerow18col = 6,
            tablecolumn18col = 5,
            visible = true
        )


        val tungsten = PeriodTableModel(

            name = "Tungsten",
            atomicnumber = 74,
            symbol = "W",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "183.84",
            atomicweightfull = "183.84(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 6,
            period = 6,
            block = "d",
            tablerow18col = 6,
            tablecolumn18col = 6,
            visible = true
        )

        val rhenium = PeriodTableModel(

            name = "Rhenium",
            atomicnumber = 75,
            symbol = "Re",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "186.21",
            atomicweightfull = "186.207(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 7,
            period = 6,
            block = "d",
            tablerow18col = 6,
            tablecolumn18col = 7,
            visible = true
        )

        val osmium = PeriodTableModel(

            name = "Osmium",
            atomicnumber = 76,
            symbol = "Os",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "190.23",
            atomicweightfull = "190.23(3) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 8,
            period = 6,
            block = "d",
            tablerow18col = 6,
            tablecolumn18col = 8,
            visible = true
        )



        val platinum = PeriodTableModel(

            name = "Platinum",
            atomicnumber = 78,
            symbol = "Pt",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "195.08",
            atomicweightfull = "195.084(9) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 10,
            period = 6,
            block = "d",
            tablerow18col = 6,
            tablecolumn18col = 10,
            visible = true
        )

        val gold = PeriodTableModel(
            name = "Gold",
            atomicnumber = 79,
            symbol = "Au",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "196.97",
            atomicweightfull = "196.966570(4) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 11,
            period = 6,
            block = "d",
            tablerow18col = 6,
            tablecolumn18col = 11,
            visible = true

        )

        val mercury = PeriodTableModel(


            name = "Mercury",
            atomicnumber = 80,
            symbol = "Hg",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "200.59",
            atomicweightfull = "200.592(3) ",
            occurrence = "Liquid",
            stateofmatter = "Primordial",
            group = 12,
            period = 6,
            block = "d",
            tablerow18col = 6,
            tablecolumn18col = 12,
            visible = true
        )


        val lead = PeriodTableModel(
            name = "Lead",
            atomicnumber = 82,
            symbol = "Pb",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "207.2",
            atomicweightfull = "207.2(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 14,
            period = 6,
            block = "p",
            tablerow18col = 6,
            tablecolumn18col = 14,
            visible = true

        )


        val bismuth = PeriodTableModel(

            name = "Bismuth",
            atomicnumber = 83,
            symbol = "Bi",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "208.98",
            atomicweightfull = "208.98040(1) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 15,
            period = 6,
            block = "p",
            tablerow18col = 6,
            tablecolumn18col = 15,
            visible = true

        )

        val polonium = PeriodTableModel(
            name = "Polonium",
            atomicnumber = 84,
            symbol = "Po",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "[209]",
            atomicweightfull = "-",
            occurrence = "Solid",
            stateofmatter = "From decay",
            group = 16,
            period = 6,
            block = "p",
            tablerow18col = 6,
            tablecolumn18col = 16,
            visible = true

        )

        val astatine = PeriodTableModel(
            name = "Astatine",
            atomicnumber = 85,
            symbol = "At",
            category = ElementGroup.METALLOID,
            atomicweight = "[210]",
            atomicweightfull = "-",
            occurrence = "Solid",
            stateofmatter = "From decay",
            group = 17,
            period = 6,
            block = "p",
            tablerow18col = 6,
            tablecolumn18col = 17,
            visible = true

        )


        val radon = PeriodTableModel(


            name = "Radon",
            atomicnumber = 86,
            symbol = "Rn",
            category = ElementGroup.NOBLEGAS,
            atomicweight = "[222]",
            atomicweightfull = "-",
            occurrence = "Gas",
            stateofmatter = "From decay",
            group = 18,
            period = 6,
            block = "p",
            tablerow18col = 6,
            tablecolumn18col = 18,
            visible = true
        )

        val francium = PeriodTableModel(
            name = "Francium",
            atomicnumber = 87,
            symbol = "Fr",
            category = ElementGroup.ALKALIMETAL,
            atomicweight = "[223]",
            atomicweightfull = "-",
            occurrence = "Solid",
            stateofmatter = "From decay",
            group = 1,
            period = 7,
            block = "s",
            tablerow18col = 7,
            tablecolumn18col = 1,
            visible = true
        )

        val radium = PeriodTableModel(
            name = "Radium",
            atomicnumber = 88,
            symbol = "Ra",
            category = ElementGroup.ALKALINEEARTH_METAL,
            atomicweight = "[226]",
            atomicweightfull = "-",
            occurrence = "Solid",
            stateofmatter = "From decay",
            group = 2,
            period = 7,
            block = "s",
            tablerow18col = 7,
            tablecolumn18col = 2,
            visible = true
        )

        val actinium = PeriodTableModel(
            name = "Actinium",
            atomicnumber = 89,
            symbol = "Ac",
            category = ElementGroup.ACTINIDE,
            atomicweight = "[227]",
            atomicweightfull = "-",
            occurrence = "Solid",
            stateofmatter = "From decay",
            group = 3,
            period = 7,
            block = "d",
            tablerow18col = 7,
            tablecolumn18col = 3,
            visible = true
        )

        val thorium = PeriodTableModel(
            name = "Thorium",
            atomicnumber = 90,
            symbol = "Th",
            category = ElementGroup.ACTINIDE,
            atomicweight = "232.04",
            atomicweightfull = "232.0377(4) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 0,
            period = 7,
            block = "f",
            tablerow18col = 9,
            tablecolumn18col = 4,
            visible = true
        )




        val uranium = PeriodTableModel(
            name = "Uranium",
            atomicnumber = 92,
            symbol = "U",
            category = ElementGroup.ACTINIDE,
            atomicweight = "238.03",
            atomicweightfull = "238.02891(3) ",
            occurrence = "Solid",
            stateofmatter = "Primordial",
            group = 0,
            period = 7,
            block = "f",
            tablerow18col = 9,
            tablecolumn18col = 6,
            visible = true
        )

        val neptunium = PeriodTableModel(


            name = "Neptunium",
            atomicnumber = 93,
            symbol = "Np",
            category = ElementGroup.ACTINIDE,
            atomicweight = "[237]",
            atomicweightfull = "-",
            occurrence = "Solid",
            stateofmatter = "From decay",
            group = 0,
            period = 7,
            block = "f",
            tablerow18col = 9,
            tablecolumn18col = 7,
            visible = true
        )

        val plutonium = PeriodTableModel(
            name = "Plutonium",
            atomicnumber = 94,
            symbol = "Pu",
            category = ElementGroup.ACTINIDE,
            atomicweight = "[244]",
            atomicweightfull = "-",
            occurrence = "Solid",
            stateofmatter = "From decay",
            group = 0,
            period = 7,
            block = "f",
            tablerow18col = 9,
            tablecolumn18col = 8,
            visible = true
        )



        val rutherfordium = PeriodTableModel(

            name = "Rutherfordium",
            atomicnumber = 104,
            symbol = "Rf",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "[267]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 4,
            period = 7,
            block = "d",
            tablerow18col = 7,
            tablecolumn18col = 4,
            visible = true
        )

        val dubnium = PeriodTableModel(

            name = "Dubnium",
            atomicnumber = 105,
            symbol = "Db",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "[268]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 5,
            period = 7,
            block = "d",
            tablerow18col = 7,
            tablecolumn18col = 5,
            visible = true
        )

        val seaborgium = PeriodTableModel(
            name = "Seaborgium",
            atomicnumber = 106,
            symbol = "Sg",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "[269]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 6,
            period = 7,
            block = "d",
            tablerow18col = 7,
            tablecolumn18col = 6,
            visible = true
        )
        val bohrium = PeriodTableModel(
            name = "Bohrium",
            atomicnumber = 107,
            symbol = "Bh",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "[270]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 7,
            period = 7,
            block = "d",
            tablerow18col = 7,
            tablecolumn18col = 7,
            visible = true
        )
        val hassium = PeriodTableModel(
            name = "Hassium",
            atomicnumber = 108,
            symbol = "Hs",
            category = ElementGroup.TRANSITION_METAL,
            atomicweight = "[269]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 8,
            period = 7,
            block = "d",
            tablerow18col = 7,
            tablecolumn18col = 8,
            visible = true
        )
        val meitnerium = PeriodTableModel(
            name = "Meitnerium",
            atomicnumber = 109,
            symbol = "Mt",
            category = ElementGroup.LANTHANIDE,
            atomicweight = "[278]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 9,
            period = 7,
            block = "d",
            tablerow18col = 7,
            tablecolumn18col = 9,
            visible = true
        )
        val darmstadium = PeriodTableModel(
            name = "Darmstadtium",
            atomicnumber = 110,
            symbol = "Ds",
            category = ElementGroup.ACTINIDE,
            atomicweight = "[281]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 10,
            period = 7,
            block = "d",
            tablerow18col = 7,
            tablecolumn18col = 10,
            visible = true
        )
        val roentgenium = PeriodTableModel(
            name = "Roentgenium",
            atomicnumber = 111,
            symbol = "Rg",
            category = ElementGroup.NOBLEGAS,
            atomicweight = "[282]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 11,
            period = 7,
            block = "d",
            tablerow18col = 7,
            tablecolumn18col = 11,
            visible = true
        )


       
        val nihoium = PeriodTableModel(
            name = "Nihonium",
            atomicnumber = 113,
            symbol = "Nh",
            category = ElementGroup.ALKALINEEARTH_METAL,
            atomicweight = "[286]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 13,
            period = 7,
            block = "p",
            tablerow18col = 7,
            tablecolumn18col = 13,
            visible = true
        )

        val flerovium = PeriodTableModel(
            name = "Flerovium",
            atomicnumber = 114,
            symbol = "Fl",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "[289]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 14,
            period = 7,
            block = "p",
            tablerow18col = 7,
            tablecolumn18col = 14,
            visible = true
        )

        val moscovium = PeriodTableModel(
            name = "Moscovium",
            atomicnumber = 115,
            symbol = "Mc",
            category = ElementGroup.NONMETAL,
            atomicweight = "[290]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 15,
            period = 7,
            block = "p",
            tablerow18col = 7,
            tablecolumn18col = 15,
            visible = true

        )

        val livermorium = PeriodTableModel(

            name = "Livermorium",

            atomicnumber = 116,
            symbol = "Lv",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "[293]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 16,
            period = 7,
            block = "p",
            tablerow18col = 7,
            tablecolumn18col = 16,
            visible = true
        )


        val oganesson = PeriodTableModel(
            name = "Oganesson",
            atomicnumber = 118,
            symbol = "Og",
            category = ElementGroup.POST_TRANSITION_METAL,
            atomicweight = "[294]",
            atomicweightfull = "-",
            occurrence = "unknown",
            stateofmatter = "Synthetic",
            group = 18,
            period = 7,
            block = "p",
            tablerow18col = 7,
            tablecolumn18col = 18,
            visible = true
        )

        val empty = PeriodTableModel(
            name = "",
            atomicnumber = null,
            symbol = "",
            category = ElementGroup.UNKNOWN,
            atomicweight = "",
            atomicweightfull = "",
            occurrence = "",
            stateofmatter = "",
            group = null,
            period = null,
            block = "",
            tablecolumn18col = null,
            tablerow18col = null,
            visible = false


        )





        elementList.add(hydrogen)
        elementList.add(lithium)
        elementList.add(sodium)
        elementList.add(potassium)
        elementList.add(rubidiu)
        elementList.add(cerium)
        elementList.add(francium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(beryllium)
        elementList.add(magnesium)
        elementList.add(calcium)
        elementList.add(strontium)
        elementList.add(barium)
        elementList.add(radium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(scandium)
        elementList.add(yttrium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(lanthanum)
        elementList.add(actinium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(titanium)
        elementList.add(zirconium)
        elementList.add(hafnium)
        elementList.add(rutherfordium)
        elementList.add(cerium)
        elementList.add(thorium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(vanadium)
        elementList.add(nihoium)
        elementList.add(tantalum)
        elementList.add(dubnium)
        elementList.add(praseodymium)
        elementList.add(promethium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(chromium)
        elementList.add(molybdenum)
        elementList.add(tungsten)
        elementList.add(seaborgium)
        elementList.add(neodymium)
        elementList.add(uranium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(magnesium)
        elementList.add(tecnetium)
        elementList.add(rhenium)
        elementList.add(bohrium)
        elementList.add(promethium)
        elementList.add(neptunium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(iron)
        elementList.add(ruthenium)
        elementList.add(osmium)
        elementList.add(hassium)
        elementList.add(samarium)
        elementList.add(plutonium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(cobalt)
        elementList.add(ruthenium)
        elementList.add(nickel)
        elementList.add(meitnerium)
        elementList.add(palladium)
        elementList.add(platinum)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(darmstadium)
        elementList.add(copper)
        elementList.add(silver)
        elementList.add(roentgenium)
        elementList.add(gold)
        elementList.add(zinc)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(cadmium)
        elementList.add(mercury)
        elementList.add(silver)
        elementList.add(phosphorus)
        elementList.add(aluminum)
        elementList.add(gallium)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(nitrogen)
        elementList.add(copper)
        elementList.add(silver)
        elementList.add(carbon)
        elementList.add(gold)
        elementList.add(zinc)
        elementList.add(empty)
        elementList.add(empty)
        elementList.add(aluminum)
        elementList.add(gallium)
        elementList.add(indium)
        elementList.add(nihoium)
        elementList.add(carbon)
        elementList.add(silicon)
        elementList.add(germanium)
        elementList.add(empty)
        elementList.add(tin)
        elementList.add(lead)
        elementList.add(flerovium)
        elementList.add(arsenic)
        elementList.add(antimony)
        elementList.add(bismuth)
        elementList.add(moscovium)
        elementList.add(oxygen)
        elementList.add(empty)
        elementList.add(sulfur)
        elementList.add(selenium)
        elementList.add(tellurium)
        elementList.add(polonium)
        elementList.add(livermorium)
        elementList.add(fluorine)
        elementList.add(chlorine)
        elementList.add(bromine)
        elementList.add(helium)
        elementList.add(neon)
        elementList.add(argon)
        elementList.add(kryton)
        elementList.add(xenon)
        elementList.add(radon)
        elementList.add(boron)
        elementList.add(oganesson)
        elementList.add(iodine)


        return elementList
    }



}