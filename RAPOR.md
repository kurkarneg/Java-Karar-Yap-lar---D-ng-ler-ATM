# Rapor

**Ad Soyad: Ege KARADUMAN **
**Numara: 793 **

## 1. Algoritma Açıklaması
<!-- Programın nasıl çalıştığını adım adım, kendi cümlelerinizle yazın. -->
Ilk odeve benziyoir bir menu yapiyoruz ewhile + switch ile ona gorede case leri yailandirriyoruz.


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-Menu tercihi islem icin gerekli olan miktar

**İşlemler:**
-Para cekme
-Para yatirma

**Çıktılar:**
-Ilem mikrtari
-Kalan bakiye

## 3. Sözde Kod (Pseudocode)

```
1.gIRDILERI AL
2.Islemleri yap
3.Ciktiyi ver
```

## 4. Akış Şeması

Ayni sorun bir onceki odevde belirttim

## 5. Test Senaryoları (en az 8)

| No | Yapılan işlem / girdi | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 | 3,100,4 | Islem miktari 1
Kalan bakiye 9900
Sistemden cikilyor | Islem miktari 1
Kalan bakiye 9900
Sistemden cikilyor | dogru |
| 2 | 4 | - | Islem sonlandiriliyor | yanlis |
| 3 | 1,4 | Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor | Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor | dogru |
| 4 | 6,1,4 | Gecersiz menu secimi         Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor | Gecersiz menu secimi        Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor  | dogru |
| 5 | 1,6,4  | Gecersiz menu secimi                       Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor
 | Gecersiz menu secimi                              Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor
| dogru |
| 6 | -1,1,4 | Gecersiz menu secimi                              Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor | Gecersiz menu secimi                              Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor | dogru |
| 7 | 0,4| Gecersiz menu secimi                              Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor | Gecersiz menu secimi                              Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor | dogru |
| 8 | 1,2,-3,4 | Gecersiz miktar menuye yonlendiriliyorusunuz                         Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor | Gecersiz miktar menuye yonlendiriliyorusunuz                     Islem miktari 0
Kalan bakiye 10000
Sistemden cikilyor | dogru |
