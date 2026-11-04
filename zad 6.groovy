
import java.util.Scanner

def scanner = new Scanner(System.in)

def plik = new File("tekst.txt")

println("Wybierz, co chcesz zrobic:")
println("1 - Odczytaj plik")
println("2 - Dodaj tekst do pliku")
println("3 - Odczytaj plik i dodaj tekst")

def wybor = scanner.nextLine()

if (wybor == "1") {

    if (plik.exists()) {
        println("Zawartosc pliku:")
        println(plik.text)
    } else {
        println("Plik nie istnieje!")
    }

} else if (wybor == "2") {

    if (plik.exists()) {
        println("Wpisz tekst do dodania:")
        def tekst = scanner.nextLine()
        plik.append(tekst + "\n")
        println("Tekst zostal dodany!")
    } else {
        println("Plik nie istnieje!")
    }

} else if (wybor == "3") {

    if (plik.exists()) {
        println("Zawartosc pliku:")
        println(plik.text)
    } else {
        println("Plik nie istnieje. Zostanie utworzony.")
    }

    println("Wpisz tekst do dodania:")
    def tekst = scanner.nextLine()

    plik.append(tekst + "\n")

    println("Tekst zostal dodany!")

} else {
    println("Nieprawidlowy wybor!")
}