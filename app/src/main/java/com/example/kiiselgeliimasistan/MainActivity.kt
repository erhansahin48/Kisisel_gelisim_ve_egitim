package com.example.kiiselgeliimasistan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewmain: RecyclerView
    private lateinit var adapter: GelisimAdapter
    private lateinit var gelisimVerileri: List<GelisimVerisi>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewmain = findViewById(R.id.recyclerViewmain)
        recyclerViewmain.layoutManager = LinearLayoutManager(this)

        gelisimVerileri = createGelisimVerileri()
        adapter = GelisimAdapter(this, gelisimVerileri)
        recyclerViewmain.adapter = adapter
    }


    private fun createGelisimVerileri(): List<GelisimVerisi> {
        val veri1 = GelisimVerisi(
            R.drawable.sabahegzersiz,
            "Egzersiz",
            "Günün sabah yapılabilecek gelişim etkinliği","1 - Şınav\n" +
                    "İlk hareket hepimizin bildiği şınav pozisyonu. Bu egzersizlerin hepsini yaklaşık 10-12 tekrar ile 2 ya da 3 set şeklinde uygulayın. Vücut dengenizi sağlamak için de oldukça faydalı bir hareket ve şınav çekerken karın kaslarından kuvvet almaya dikkat edin.\n" +
                    "\n2 - Squat\n" +
                    "İkinci hareketimiz squat. Squatı bilmeyen kalmadı ve gerçekten biz bayanların istediği harika kalçalara kavuşmak için en temel hareket. Squat pozisyonunda kalçanızı iyice dışarı çıkarıp bir sandalye üzerinde oturur gibi dizlerinizi kırarak duruyorsunuz. Bu şekilde yere doğru eğilip kalkma hareketi de yapabilirsiniz ya da görseldeki gibi çömel-zıpla şeklinde hareketi tamamlayabilirsiniz.\n\n" +
                    "3 - Sağ-Sol Bir-Ki\n" +
                    "Üçüncü harekette sağ ve sol şeklinde hareketi tamamlayacağız. Dizlerimizi kırıp gövdemizi sol tarafa döndürüp daha sonra kollarımızı uzatmış halde ayakta pozisyonuna geçiyoruz. Daha sonra hareketin aynısını sağ tarafa dönerek tekrarlıyoruz ve bütün hareket bir sol bir sağ şeklinde ilerliyor.\n\n" +
                    "Bu güne zinde başlamanız için çok önemli"
        )
        val veri2 = GelisimVerisi(
            R.drawable.kitapokuma,
            "Bir kaç saat kitap okuma",
            "Günün sabah yapılabilecek gelişim etkinliği","Okuma alışkanlığı kazanmak için mutlaka Şeker Portakalı, Satranç, Uçurtma Avcısı, Fareler ve İnsanlar, Kuyucaklı Yusuf, Martin Eden, Kürk Mantolu Madonna, Hayvan Çiftliği, Bülbülü Öldürmek, Genç Werther'in Acıları, 1984, Serenad, Nil'de Ölüm, Harry Potter Serisi gibi kitaplar okunmalı."
        )
        val veri3 = GelisimVerisi(
            R.drawable.mola,
            "Mola ver ve zihnini dinlendir",
            "Günün öğle vaktinde yapılabilecek gelişim etkinliği","1.Yöntem\n\nDuş alın. Su rahatlatır. Diriltir. Hele ki masabaşında yaptığınız işten uzaklaşmak için duş almak gerilen kaslarınızı gevşetir. Enerji verecek ve sizi canlandıracak aromalara sahip duş jeli veya sabunlardan yararlanabilirsiniz. Özellikle ayak bileklerinize buz gibi su tutarak metabolizmanızı hızlandırabilirsiniz. İsterseniz şarkı da söyleyin\n\n" +
                    "2.\n" +
                    "\nYöntemMum yakın. Özellikle gece çalışanlardansanız, masanızda bir mum yakmayı deneyin. Kokulu ya da kokusuz, farketmez. Mum ışığı ortamı yumuşatacaktır. Üstelik, alevin dinginliğine bakarak siz de dinlenebilirsiniz. Yorgunluktan boşluğa bakakalmaktansa mum ateşini seyredebilirsiniz. Aman dikkat, mayışmayın!\n\n" +
                    "3.\n" +
                    "\nYöntem Diyaframınıza nefes alın. Uyurken aldığımız o deriiiin nefesleri aslında hep diyaframımıza aldığımızı biliyor muydunuz? Mola verdiğinizde diyaframa nefes alarak bünyenizi kısa bir şekerleme yapmış gibi kandırabilirsiniz.\n\n" +
                    "4.\n" +
                    "\nYöntem Taze çiçekler alın. Neden sadece misafirliğe giderken, hasta ziyaretlerinde ve anneler gününde çiçek alalım ki? Köşebaşındaki çiçekçi teyzeye gidin ve en sevdiğiniz çiçekten bir buket alın. Kendiniz için. En sevdiğiniz vazoya yerleştirin. Çalışırken görüş alanınızda bir vazo dolusu taze çiçek olması içinizi açacaktır. Yakınlar da çiçek toplayabileceğiniz bir alan varsa"
        )
        val veri4 = GelisimVerisi(
            R.drawable.hafiftemp,
            "Hafif tempolu yürüyüş",
            "Günün öğle vaktinde yapılabilecek gelişim etkinliği","Saatte 3 kilometrelik bir hızla yapılan yürüyüş hafif tempolu, saatte 4 kilometre hızla yapılan yürüyüş orta tempolu ve saate 5 kilometre ve üstünde bir hızla yapılan yürüyüş ise hızlı tempolu yürüyüş olarak tanımlanır.\n\n" +
                    "Günlük yürüme süresi 30-60 dakika arasında olmalı. Haftada en az 3 gün, ideali 5 gün yürümeniz. Uzun süreli ve dinlenme periyodu yetersiz yürüyüşlerde vücudunuzun zarar görme ve yaralanma riskinin olduğunu unutmayın.\n\n" +
                    "Sağlıklı yaşam için ya orta şiddetli (yürüyüş) veya yüksek şiddetli (koşu) aerobik aktivite yapılmasını öneren uzmanlar, ideal temponun 10 dakikada bin adım olduğunu söyledi. Doğru egzersizle ilgili önemli tüyolar: 30 dakika tempolu yürüdükten sonra 30 dakika mola vermeden koşun. Koşu bittikten sonra aniden durmayın."
        )
        val veri5 = GelisimVerisi(
            R.drawable.drawing,
            "Resim Çizme",
            "Günün öğleden sonra yapılabilecek gelişim etkinliği","Güzel ve teknik bir resim için ilk olarak kişinin resim konusunda kendisini geliştirebilmesi ve elini kuvvetlendirebilmesi gereklidir. Biraz alıştırma ve teknik detayları kullanarak, kısa sürede profesyonel çizimler yapılabilmesi mümkün olacaktır. Estetik bir resim çizmek için yeni başlayanların, ilk etapta şu 3 yöntemi uygulaması gerekecektir;\n" +
                    "\n" +
                    "Yeni başlayanların ilk olarak gördüğü her şeyi çizmesi gereklidir. Özellikle ilginç gördüğü şekilleri çizmeye çalışarak, elini yatkınlaştırmak adına önemlidir.\n" +
                    "Resim çizme konusunda kendisini geliştirmek isteyenlerin, gördüğü tüm şekilleri zihninde tutarak çizmeye çalışması gereklidir. Eğer zihinlerinde tutma konusunda problem yaşıyorlarsa bu durumda, resme sürekli olarak bakmaları önerilmektedir.\n" +
                    "Resim çizmek isteyen kişilerin kağıt üzerinde ilk olarak şeklin taslağını çıkarması, daha sonrasında ise gölgelendirme yapması gereklidir.\n" +
                    "Figür Çizim Teknik Nelerdir?\n" +
                    "Resim çizme teknikleri arasında kategori içeriği oldukça fazladır. Bu kategoriler içerisinde yer alan figür çizim teknikleri çok zor olduğu konusunda genel bir yargı vardır. Bu yargı gerçeği yansıtmamakla birlikte, kurallara uyum gösterildiği takdirde kısa sürede pratik kazanmak mümkün olabilecektir.\n" +
                    "\n" +
                    "Figür çizimi için mutlaka figürün odağı belirlenmeli ve çizime buradan başlanmalıdır. Bir insan çizimi yapılacaksa resmin odağı yüz olacağından, baş kısmından çizime başlanmalıdır.\n" +
                    "\n" +
                    "Çizim sırasında figürün boyu 8 baş ölçüsü kadar, eni ise 2 baş ölçüsü olacak şekilde belirlenmelidir. İnsan çiziminde üst gövde 3 baş boyutu kadar, alt gövde ise 4 baş boyutunda olmalıdır.\n" +
                    "\n" +
                    "İnsan figürü çizimlerinde kadın ve erkek çizimi elbette farklılık gösterecektir. Kadın çizimlerindeki baş boyutu, daima erkek çizimlerinin baş boyutundan küçük olmalıdır. Yine bel kısmı ve omuz kısmı erkeklerden daha dar çizilmelidir.\n" +
                    "\n" +
                    "Kadınların meme çiziminde ise çenenin çizildiği yerden hemen sonra bir baş çizimi pay bırakılmalıdır. Yine kadınların meme çizimi erkek figürünün göğüs kısmından daha aşağıda başlamalıdır.\n" +
                    "\n" +
                    "Portre Çizim Teknikleri Nelerdir?\n" +
                    "Portre çizimi, resim çizim teknikleri ile yapıldığı takdirde oldukça gerçekçi sonuçlar elde edilebilecektir. Portre resim kesinlikle kusursuz bir oran ile çizilmelidir. Aksi takdirde istenilen gerçekçi çizimi yakalayabilmek mümkün olmayabilir. İlk olarak yüzün tamamı enine olacak şekilde 5 eşit parçaya bölünmelidir.\n" +
                    "\n" +
                    "3. Çizginin bulunduğu kısım mutlaka gözlerin çizilmesi gerekecektir. Bu alanın genişliğine 5 göz çizilecek şekilde ayarlanmalı 2. ve 4. Bölüme gözler çizilmelidir. 5 eşit parçaya bölünen çizginin 2 ve 4. Kısmı burun sınırlarının olduğu alandır. Göz pınarlarının hemen üzerinden başlayan burun sınırları 4. alanın sonuna dek devam etmelidir.\n" +
                    "\n" +
                    "Resim çizim teknikleri kapsamında üstten 4. ve 5. çizginin geçtiği alana ise dudak çizimi tasarlanmalıdır. Dudağın sınırları ise göz bebeklerinin tam ortasındaki hizadan başlamalı ve 4. İla 5. Çizgi arasındaki alanı doldurmalıdır. Bu tekniklere doğru bir şekilde yer verildiği takdirde portre çizimi oldukça kolay bir şekilde gerçekleştirilebilecektir."
        )
        val veri6 = GelisimVerisi(
            R.drawable.enstruman,
            "Enstrüman Çalma ",
            "Günün öğleden sonra yapılabilecek gelişim etkinliği","Öğrenmesi en kolay müzik aleti şüphesiz gitardır. Gitar çalmak, deneyimli bir öğretici ile kısa sürede öğrenilebilir. Yaygın şekilde öğrenilen bir çalgı aleti olması, hakkındaki kaynakları arttırmıştır. Öğrenmek isteyen kişiler için geniş çapta kaynağa ulaşılması mümkündür.\n\n" +
                    "Piyano\n" +
                    " \n" +
                    "Başlangıç düzeyinde müzik aleti öğrenimi için bir diğer tercih piyanodur. Öğrenmesi en kolay müzik aleti için piyano elbette ilk sırada yer almaz. Ama bununla birlikte çocuk yaşlardan itibaren alınan düzenli dersler ile daha kolay bir öğrenim gerçekleştirilebilir. \n" +
                    "\n" +
                    "Piyano öğrenimi, müzik kulağını güçlendirir. Kişilerin özel bir müzik zevki oluşmasını sağlar. Her yaşta öğrenim için uygundur. Deneyimli bir öğretici ile kısa sürede, öğrenimi hızlandırmak mümkündür.  Piyano öğreniminin geçmişe dayanması, öğrenim tekniklerini arttırmıştır. \n\n" +
                    "En Kolay Öğrenilen 5 Müzik Aleti;\n" +
                    "\n" +
                    "Mızıka\n" +
                    "Bongo\n" +
                    "Org\n" +
                    "Tef\n" +
                    "Ukulele\n" +
                    " \n" +
                    "Öğrenmesi en kolay müzik aleti grubunda yer alan müzik aletlerini öğrenmek, kendinize olan güveni arttırır. En kolay çalınan müzik aletlerini şu şekilde sıralamak mümkündür:\n" +
                    "\n" +
                    "Keman öğrenimi özellikle çocukluk döneminde başlamak için oldukça uygundur. 6 yaş ve üstü çocuklar için uygunluk gösterir. \n" +
                    " \n" +
                    "Başlaması kemandan daha kolay olan çello da tercihleriniz arasında yer alabilir. Keman grubunda yer alması da sizin için bir artı olacaktır. \n" +
                    " \n" +
                    "En popüler müzik aletlerinden birisi de flütlerdir. Özellikle yan flüt, öğrenim için idealdir. 10 yaş ve üzeri için uygundur. "
        )
        val veri7 = GelisimVerisi(
            R.drawable.spor,
            "Spor",
            "Günün akşam üstü yapılabilecek gelişim etkinliği","En Kolay Öğrenilen 5 Müzik Aleti;\n" +
                    "\n" +
                    "Mızıka\n" +
                    "Bongo\n" +
                    "Org\n" +
                    "Tef\n" +
                    "Ukulele\n" +
                    " \n" +
                    "Öğrenmesi en kolay müzik aleti grubunda yer alan müzik aletlerini öğrenmek, kendinize olan güveni arttırır. En kolay çalınan müzik aletlerini şu şekilde sıralamak mümkündür:\n" +
                    "\n" +
                    "Keman öğrenimi özellikle çocukluk döneminde başlamak için oldukça uygundur. 6 yaş ve üstü çocuklar için uygunluk gösterir. \n" +
                    " \n" +
                    "Başlaması kemandan daha kolay olan çello da tercihleriniz arasında yer alabilir. Keman grubunda yer alması da sizin için bir artı olacaktır. \n" +
                    " \n" +
                    "En popüler müzik aletlerinden birisi de flütlerdir. Özellikle yan flüt, öğrenim için idealdir. 10 yaş ve üzeri için uygundur. "
        )
        val veri8 = GelisimVerisi(
            R.drawable.hobi,
            "Hobilerinle İlgilenme",
            "Günün akşam üstü yapılabilecek gelişim etkinliği","1. Çanağa çömleğe para dağıtmaya gerek yok, seramik atölyeleri ile kendiniz yapın.\n" +
                    "\n" +
                    "1. Çanağa çömleğe para dağıtmaya gerek yok, seramik atölyeleri ile kendiniz yapın.\n" +
                    "Kim yeni ev ziyaretinde kendi ellerinizle yaptığınız çerez kaselerinin hediye edilmesini istemez ki? Şimdi çok revaçta olan seramik ürünleri kendiniz dizayn edebilir, istediğiniz renge boyayabilir ve evinizi tekrar dekore edebilirsiniz. İsterseniz sadece kendinize saklar, isterseniz de sosyal medya aracılığıyla satışını yaparsınız.\n" +
                    "\n" +
                    "2. Masaj yapmayı öğrenin. Ortamların en sevilen ismi olmaya hazır mısınız?\n" +
                    "\n" +
                    "2. Masaj yapmayı öğrenin. Ortamların en sevilen ismi olmaya hazır mısınız?\n" +
                    "Masaj yapmayı bilen bir arkadaşımız olsaydı eğer, bağımlısı olurduk. Elbette medikal masaj için katedilmesi gereken çok yol var, sertifikalı olmak ise hem bütçe hem de zaman gerektiriyor. Fakat ömür boyu kullanabileceğiniz bir yetenek edinmiş, hem de belki de mesleğe çevirmiş olursunuz.\n" +
                    "\n" +
                    "3. Fotoğrafçılık hem size harika vakit geçirtecek, hem de para kazanmanıza yardımcı olacak.\n" +
                    "\n" +
                    "3. Fotoğrafçılık hem size harika vakit geçirtecek, hem de para kazanmanıza yardımcı olacak.\n" +
                    "İyi bir kurs ve ardından iyi bir kamera ile siz de fotoğrafçı olabilirsiniz. Elbette bir yetenek söz konusu ama belki siz de çalışarak onlar kadar olmasa da güzel fotoğraflar çekebilirsiniz. Üstelik sertifikalı olur ve özel bir alanda uzmanlaşırsanız, doğum fotoğrafçılığı veya düğün fotoğrafçılığı gibi alanlarda da iyi paralar kazanabilirsiniz.\n" +
                    "\n" +
                    "4. Nefes Alma Teknikleri eğitimlerine katılın, hayatınızı değiştirin.\n" +
                    "\n" +
                    "4. Nefes Alma Teknikleri eğitimlerine katılın, hayatınızı değiştirin.\n" +
                    "Gün içinde binlerce kez yaptığımız için nefes almak bize sıradan bir olay gibi geliyor. Aslında hem stres yönetiminde hem de sağlığımızda büyük rolü var. Bu yolla odaklanma problemlerini çözmeye çalışanlar bile var. Bir eğitmen bulun ve başlayın, bakalım hayatınızda neler değişecek.\n" +
                    "\n" +
                    "5. Evinizin bir odasını kiraya verin, yeni insanlarla tanışın.\n" +
                    "\n" +
                    "5. Evinizin bir odasını kiraya verin, yeni insanlarla tanışın.\n" +
                    "Artık sadece maddi sebeplerle değil, birileriyle tanışmak ve arkadaşlık kurmak için de oda kiralama uygulamaları kullanılmaya başlandı. Siz de odanızı güzelce dekore eder ve temiz tutarsanız, iyi bir ev sahibi olursanız, dünyanın dört bir yanından insanı evinizde ağırlayabilirsiniz. Hatta buradan kazandığınız paralarla da yurt dışına seyahate gitmek harika olmaz mı?\n" +
                    "\n" +
                    "İçeriğin Devamı Aşağıda\n" +
                    "6. Doğaçlama tiyatro ile günün bütün stresini atın.\n" +
                    "\n" +
                    "6. Doğaçlama tiyatro ile günün bütün stresini atın.\n" +
                    "Doğaçlama tiyatro ile ilgili bir kurstan sonra, hemen amatör bir ekibe dahil olun. Hem sürekli düşünme, beyni canlı tutma işine alışın hem de eğlenin. İnsanların size bakarak; 'Ne akıl yahu, nasıl planlamadan yapıyorlar bunu?' dediklerini de fark edince, en büyük eğlenceniz olacak.\n" +
                    "\n" +
                    "7. Kendinizi daha güvende hissetmek ve korumak için yakın dövüş eğitimleri alın.\n" +
                    "\n" +
                    "7. Kendinizi daha güvende hissetmek ve korumak için yakın dövüş eğitimleri alın.\n" +
                    "Kadın erkek fark etmez, herkesin kendini koruyabilmesi gerek. En azından koruyabileceğinizi bildiğiniz için bile çok daha iyi hissedebilirsiniz. Form tutar, bedeninizin hakimiyetini sağlar ve hak edenlere yıldızları saydırırsınız.\n" +
                    "\n" +
                    "8. Kendi süslemenizi kendiniz yapın, toprakla uğraşın. Teraryum atölyeleri hiç olmadığı kadar revaçta.\n" +
                    "\n" +
                    "8. Kendi süslemenizi kendiniz yapın, toprakla uğraşın. Teraryum atölyeleri hiç olmadığı kadar revaçta.\n" +
                    "Harika bir teraryumu çok cüzi bir bütçe ile yapabildikten sonra, daha önce eşe dosta gönderdiğiniz 200-250 liralık teraryumlara çok üzüleceksiniz. Üstelik her şey sizin hayal ettiğiniz gibi olacak. Toprakla ve çiçeklerle uğraşmak da enerjinizi değiştirecek, sizi sakinleştirecek.\n" +
                    "\n" +
                    "9. Hazır ateş pahası olmuşken kendi damak tadınıza göre bira yapmak kulağa nasıl geliyor?\n" +
                    "\n" +
                    "9. Hazır ateş pahası olmuşken kendi damak tadınıza göre bira yapmak kulağa nasıl geliyor?\n" +
                    "Bira kitlerinden edinerek ve internetteki eğitici videoları da izleyerek kendi biranızı yapabilirsiniz. Başlarda zahmetli olacak ve belki de ilk biralarınızdan mutlu olmayacaksınız. Ama zamanla kendinizi geliştirdiğinizde üzerinize fotoğrafınızı bile basabilir, misafirlere ikram edebilir ve hediye olarak götürebilirsiniz. Ama unutmayın, yasal olarak satamazsınız.\n" +
                    "\n" +
                    "10. Ortamlara havalı girişiniz eksik mi olsun: Müzik Prodüksiyonu & Miksleme\n" +
                    "\n"
        )

        return listOf(veri1, veri2, veri3, veri4, veri5, veri6, veri7, veri8 /* ve diğerleri */)
    }
}
