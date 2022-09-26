# spotify-unpopular-songs

## Rahmenbedingungen

1. selbst ein Datensatz wählen, in etwa: >=1000 rows, >=3Columns, 2Tables, z.B. von ✔️
   - https://www.kaggle.com/datasets
   - https://opendata.swiss
   - https://www.coderstool.com/sql-test-data-generator
2. Abgabe am Mo 2022-09-26 als git-Repository
3. H2-Datenbank und Daten werden beim Programmstart geladen ✔️
4. ein Spring Data repository als reines Interface mit folgenden Methoden:
   - ein SELECT mit mindestens zwei WHERE (Desi)
   - ein SELECT mit Limit (bestenfals mit spring `Paging`) (Desi)
   - ein DELETE mit einem WHERE (Kimy) ✔️
   - ein SELECT mit einem JOIN der zwei Tabellen (Kimy)
   - eine komplizierte Abfrage welche nur mit einem `@Query` möglich ist (Nils)
5. alle Methoden mit JUnit getestet (alle)
6. alle Methoden als REST-endpunkt verfügbar (alle)
7. eine Selbsteinschätzung im README:
was ging gut, was ist toll, was fehlt noch, erwartete Note (min 4.5)
8. Bonus: eine Methode, welche SQL-Injection anfällig ist (Nils)