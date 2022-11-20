# Practicum-FinalCase

PatikaStore için ürün yönetim sistemi

Proje 4 adet sınıf içerir: Main.java , Product.java, Brands.java , PatikaStore.java

Projeyi çalıştırmak için Main.java sınıfını kullanın.
-> Laptop kategorisi için 1
-> Mobil telefon kategorisi için 2
-> Markaları görüntülemek için 3
-> Çıkış yapmak için 0 
yazınız.


Proje ile ilgili genel bilgiler: 

-> PatikaStore.java sınıfı 
Bu sınıfta öncelikle kullanıcıya Menü gösterilir ve  kullanıcıdan seçim için input alınır. 
Seçtiği menüye göre ilgili işlemleri yapabileceği method'lara yönlendirilir.
1 ise laptop menüsü, 2 ise mobil telefon menüsü, 3 ise listeleme menüsü, 0 ise çıkış'a yönlendirilir.
Bu sayılar dışında seçim yapılırsa hata mesajı gösterilir ve tekrar seçim yaptırılır. 
Ayrıca markaları tutacak bir String array'i oluşturulur. İçerisine markalar eklenir.
Bu markalar ve id'ler bir map (Brands.java içerisinde oluşturuldu) içerisine aktarılır.

-> Main.java sınıfı

İçerisinde main methodu olduğu için uygulama çalışmaya bu sınıftan başlar.
Daha sonrasında PatikaStore sınıfından nesne üretilir ve nesne aracılığıyla PatikaStore içerisindeki start() methodu çağırılır. 

-> Brands.java

Brand sınıfı içerisinde markaya karşılık gelecek id ve name değişkenleri, markaları tutacak olan array değişkeni ve marka,id ikilisini tutacak bir HashMap oluşturulur.
Değişkenlerin Constructor'ları, Getter ve Setter'ları generate edilir.
Daha sonrasında markaları alfabetik sırada dizecek olan compare() isimli fonksiyon, listeyecek olan printBrands() isimli bir fonksiyon, bu sınıfta oluşturulan array içerisine marka eklemek için addBrand() fonksiyonu oluşturulur.
Ayrıca addBrand() fonksiyonu parametre olarak marka ismi ve index alır. Daha öncesinde oluşturulmuş olan HashMap içerisine bu ikili eklenir.

-> Product.java

Bu sınıf Laptop ve Mobil telefon ile ilgili bilgileri tutar. 
İlgili kategori ile ilgili menü göstermek için menu(), listeleme işlemi yapmak için listItems(), kategoriye yeni bir ürün eklemek için addItems() , ürün silmek için deleteItems(), filtreleme yapmak için filterItems() ve filtreleme işlemi sonrası kullanıcıya listeyi göstermek için listFilteredItems() fonksiyonu
oluşturulur.

