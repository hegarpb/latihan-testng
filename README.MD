## Deskripsi

ini merupakan uji coba perbandingan test menggunakan metode sekuensial dan metode parallel
Terdapat dua test yang dijalankan.

## Test1

berisi kelas FibonacciTest.java untuk melakukan pengujian otomatis terhadap algoritma perhitungan bilangan Fibonacci ke-n yang di jalankan sebanyak 500 kali dan kelas MultipleTest.java untuk melakukan test memastikan bahwa setiap bilangan dari 1 hingga 4000, jika dikalikan 2, hasilnya selalu genap.

## Test2

berisi kelas SignInTest.java untuk melakukan pengujian otomatis simulasi login sebanyak 2000 kali, dan KasirTest.java untuk melakukan pengujian otomatis menguji perhitungan total harga di sistem kasir dijalankan sebanyak 4000 kali

##

## Hasil laporan time menggunakan test Parallel ![alt text](<src/Asset/Test Parallel.png>)

## Hasil laporan time menggunakan test Sekuensial ![alt text](<src/Asset/Test Sekuensial.png>)

## Analisis

Dari kedua hasil laporan test diatas bisa dilihat bahwa test menggunakan metode sekuensial lebih cepat dengan total (4 menit) dibandingkan test paralel dengan total (5 menit) dengan menggunakan 3 thread pada setiap method yang dijalnkan. Semua test ber status pass (berhasil) dengan total (10500) methods.
Secara teori seharusnya test paralel lebih cepat dibandingkan test sekuensial, karena test sekuensial melakukan eksekusi satu per satu (satu thread ) sedangkan test paralel melakukan beberapa thread secara bersamaan, namun dalam kasus ini test sekuensial lebih cepat daripada test parallel.
Kenapa ini bisa terjadi ? mungkin perlu kita teliti lebih dalam terkait faktor faktor apa saja yang membuat hasil test sekuensial lebih cepat dibandingkan test paralel dalam kasus ini .
