import csv
import ast

with open('artists.csv') as f:
    with open('src/main/resources/out.csv', mode='w') as out:
        reader = csv.reader(f, delimiter=',', quotechar='"')
        writer = csv.writer(out, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)

        line = 0
        for row in reader:
            if line == 0:
                writer.writerow(row)
            else:
                genre = row[2]
                try:
                    genre_json = ast.literal_eval(genre)
                except Exception as e:
                    print(genre, e)
                if len(genre_json) == 0:
                    genre = ''
                else:
                    genre = genre_json[0]
                row[2] = genre
                writer.writerow(row)

            line += 1
