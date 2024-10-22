### Metrika (LOC - Broj linija koda):
- Ukupan broj linija koda za Java fajlove: 148
- Prazne linije: 61
- Linije komentara: 5



### Statička analiza koda - PMD rezultati

#### Calculator.java
1. **NoPackage** (linija 4): Sve klase moraju biti u definisanom paketu.
2. **UseUtilityClass** (linija 4): Klasa ima javni konstruktor, iako sadrži samo statičke metode.
3. **ClassWithOnlyPrivateConstructorsShouldBeFinal** (linija 8): Klasa ima samo privatne konstruktore i može biti finalna.
4. **MethodNamingConventions** (linija 18): Ime metode `ToString` ne prati Java konvenciju imenovanja.
5. **MethodNamingConventions** (linija 24): Ime metode `Run` ne prati Java konvenciju imenovanja.
6. **ForLoopCanBeForeach** (linija 53): For petlja može biti zamenjena foreach petljom.
7. **LiteralsFirstInComparisons** (linija 55, 57): Literali bi trebalo da budu na prvom mestu u poređenju.
8. **UnnecessaryLocalBeforeReturn** (linija 70): Promenljiva `textResult` može biti izostavljena i vrednost direktno vraćena.
9. **MethodNamingConventions** (linija 74): Ime metode `Calculate` ne prati Java konvenciju imenovanja.
10. **UnnecessaryReturn** (linija 183): Nepotrebna return izjava na kraju metode.

#### Start.java
1. **NoPackage** (linija 3): Sve klase moraju biti u definisanom paketu.
2. **UseUtilityClass** (linija 3): Klasa ima javni konstruktor, iako sadrži samo statičke metode.
3. **LocalVariableNamingConventions** (linija 6): Ime lokalne promenljive `Expression` ne prati Java konvenciju imenovanja.
4. **CloseResource** (linija 9): Scanner objekat nije zatvoren nakon upotrebe.
5. **LiteralsFirstInComparisons** (linija 15): Literali bi trebalo da budu na prvom mestu u poređenju.
# Kalkulator - Projekat

Ovo je jednostavan kalkulator koji podržava osnovne aritmetičke operacije: sabiranje, oduzimanje, množenje i deljenje. Kalkulator takođe poštuje pravila prioriteta operacija (npr. množenje i deljenje imaju veći prioritet od sabiranja i oduzimanja).

## Kako koristiti

Korisnik unosi aritmetički izraz u obliku stringa, a kalkulator vraća rezultat izračunavanja izraza. Na primer:

- Izraz: `4 + 5 * 2 - 3` → Rezultat: 11
- Izraz: `10 / 2 + 3 * 4` → Rezultat: 17

## Testiranje

Testovi su implementirani u okviru **CalculatorTest.java** koristeći JUnit. Testirane su osnovne operacije, prioritet operacija, kao i složeniji izrazi. Detalji testiranja se nalaze u fajlu **TEST-RESULTS.md**.

## Metrika (LOC - Broj linija koda):

- Ukupan broj linija koda za Java fajlove: 148
  - Prazne linije: 61
  - Linije komentara: 5

## Statička analiza koda - PMD rezultati

### Calculator.java

1. **NoPackage** (linija 4): Sve klase moraju biti u definisanom paketu.
2. **UseUtilityClass** (linija 4): Klasa ima javni konstruktor, iako sadrži samo statičke metode.
3. **MethodNamingConventions** (linija 18): Ime metode `ToString` ne prati Java konvenciju imenovanja.
4. **UnnecessaryReturn** (linija 183): Nepotrebna return izjava na kraju metode.

### Start.java

1. **NoPackage** (linija 3): Sve klase moraju biti u definisanom paketu.
2. **CloseResource** (linija 9): Scanner objekat nije zatvoren nakon upotrebe.
