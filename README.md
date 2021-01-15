# Weather Application

## Descriere
### Această aplicație este una de tip MVC și este folosită pentru a obține informații legate de starea vremii într-un anumit oraș. Odată cu pornirea aplicației,va apărea o interfață grafică,unde se va selecta țara și orașul a căror detalii legate de vreme vrem să le aflăm.La apăsarea butonului Weather, se va afișa într-un AlertBox , un mesaj conținând informațiile solicitate.Pentru închiderea acelei ferestre de alertă se va apăsa butonul OK sau căsuța marcată cu X specifică închiderii paginii.

### Resurse utilizate 
#### Aplicația este implementată folosind limbajul JAVA.Pentru conectarea la server și obținerea informațiilor legate de vreme ,am folosit API-ul OpenWeatherApi. Răspunsul serverului va fi sub forma unui obiect JSON , din care se vor extrage doar informațiile solicitate. Informațiile inițiale legate de orașe sunt extrase din fișierul de intrare Cities.txt. Pentru testarea aplicației, am creat câteva clase de test, utilizând librăriile junit și mockito.

#### Utilizarea aplicației
#### Aplicația necesită fișierul de intrare din care se vor extrage orașele și se vor popula listele care sunt afișate în interfața grafică. Clientul va selecta mai întâi o țară, iar în funcție de țara selectată, va fi afișată lista de orașe din acea țară. După selectarea orașului se va apăsa butonul Weather. În momentul apăsării acestui buton se va face un request către server, iar răspunsul va fi afișat folosind un AlertBox. Totodată, în fișierul de ieșire WeatherHistory.txt se vor reține toate răspunsurile primite de la server în legătură cu vremea în orașul selectat.


##### Output-ul aplicației 
#####În urma apăsării acestui buton se va afișa:
1. Numele orașului
2. Descrierea pe scurt a vremii
3. Starea 
4. Temperatura în grade C
5. Temperatura resimțită
6. Presiunea
7. Umiditatea
8. Vântul

###### Aplicație realizată de: 
**Runcan Lăcrămioara 
Grupa: C114 A**