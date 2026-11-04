

    def silnia(n) {
        def wynik = 1

        for (i in 1..n) {
            wynik = wynik * i
        }

        return wynik
    }

    args.each { liczba ->
        def n = liczba.toInteger()
        println "Silnia z ${n} wynosi ${silnia(n)}"
    }
