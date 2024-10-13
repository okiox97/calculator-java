### Rezultati Black Box testiranja

1. **Test 1**: 4 + 5 * 2 - 3  
   - Očekivano: 11  
   - Dobijeno: 11  
   - Status: Prolazi

2. **Test 2**: 10 / 2 + 3 * 4  
   - Očekivano: 17  
   - Dobijeno: 17  
   - Status: Prolazi
# Test Results

## Black Box Test Cases

1. **Testiranje osnovnih operacija**:
   - **Izraz:** `4+5` → **Očekivano:** 9, **Rezultat:** 9 (Prošao)
   - **Izraz:** `10-3` → **Očekivano:** 7, **Rezultat:** 7 (Prošao)
   - **Izraz:** `6*2` → **Očekivano:** 12, **Rezultat:** 12 (Prošao)
   - **Izraz:** `8/2` → **Očekivano:** 4, **Rezultat:** 4 (Prošao)

2. **Testiranje prioriteta operacija**:
   - **Izraz:** `4+2*5` → **Očekivano:** 14, **Rezultat:** 14 (Prošao)
   - **Izraz:** `10/2+3` → **Očekivano:** 8, **Rezultat:** 8 (Prošao)

3. **Testiranje komplikovanih izraza**:
   - **Izraz:** `10+5*4-6` → **Očekivano:** 24, **Rezultat:** 24 (Prošao)

4. **Testiranje nevalidnih izraza**:
   - **Izraz:** `4++5` → **Očekivano:** Greška, **Rezultat:** Greška (Prošao)

## Zapažanja

- **Osnovne operacije** rade ispravno.
- **Pr
