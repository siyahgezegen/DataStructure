## Create Linked List
```
LinkedList list_name = new LinkedList();
```

## Show All List Element
```
LinkedList list_name = new LinkedList();
list_name.GetList();
```
## Get Element In List
```
LinkedList list_name = new LinkedList();
list_name.GetElementInList();
```
## Add Element In Head 
```
LinkedList list_name = new LinkedList();
list_name.AddElementInHead(Student());
```
## Add Element In Tail
```
LinkedList list_name = new LinkedList();
list_name.AddElementInTail(Student());
```
## Add Element In Between
```
LinkedList list_name = new LinkedList();
list_name.AddElementInBetween(Student(),Student());
```
## Delete Element In Tail
```
LinkedList list_name = new LinkedList();
list_name.DeleteElementInTail();
```

## Delete Element In Head
```
LinkedList list_name = new LinkedList();
list_name.DeleteElementInHead();
```

## Delete Element

```
LinkedList list_name = new LinkedList();
list_name.DeleteElement();
```

# Linked List - (Bağlı Liste)
Bir elemanın içerisinde data ve next bulunan veri yapısı.
Data içerisinde tutulacak bilgi saklanır. Örnek bizim oluşturduğumuz yapıda int değer tutuyoruz ama bu bir değer yerine başka bir class da olabilir ya da herhangi bir değişken de olabilir. fakat her eleman tanımlanan eleman türünde olmalıdır yani eğer 1. elemannın datası integer bir ifade tutuyorsa 2. elemanın da datası integer tutmak zorunda.(Çünkü önceden bunu tanımlıyoruz).

Dizilerden en önemli farkı boyutu tanımlanmaz ve hafızada dağınık yer tutar.
örnek verecek olursal bir dizimiz olsun

    String[] d1 = new String[5];

Bu dizimizin her elemanı hafızada ardı ardına yer tutar yani;

d1[0]   hafızadaki adresi 15F9
d1[1]   hafızadaki adresi 15FA
d1[2]   hafızadaki adresi 15FB
d1[3]   hafızadaki adresi 15FC
d1[4]   hafızadaki adresi 15FD

hafızada tutulan adresler birbiri ardınadır.

ayrıca d1[4] elemanının değeri olmasın ya da "" boş olsun. bu durumda d1[4] hafızada boş yere yer tutar. bu da ilerleyen durumlarda veri üzerinde işlme karmaşıklığını arttırabilir.

Fakat LinkedListte durum farklıdır her eleman hafızada farklı lokasyonlarda yer alabilir
örnke olarak

Linked listteki 1. eleman hafızada 384F noktasında bulunurken
Linked listteki 2. eleman hafızada 85D2 noktasında bulunabilir.

Linked Listlerde ; 

    
    Eleman ekleme Karmaşıklığı O(1)
    Başa eleman Ekleme Karmaşıklığı O(1)
    Kuyruğa eleman Ekleme Karmaşıklığı O(1)
    Kuyruktan eleman silme Karmaşıklığı O(1)
    Baştan eleman silme Karmaşıklığı O(1)

    Aradan eleman silme Karmaşıklığı O(n)
    Araya eleman ekleme Karmaşıklığı O(n)

Araya işlem yapıldığında karmaşıklığın artmasının sebebi. 3. elemanın adresinin doğrudan bilinmemesidir.
ilk eleman içerisinde bulunan next fonksiyonu içerisinde 2. elemanın adresi bulunur. yani ikinci elemana erişmek için;
eleman1.next dememiz gerekir bu sayede 2. elemana erişiriz n tane eleman bulunan bir listede ise bu karmaşıklık O(n) olur.
