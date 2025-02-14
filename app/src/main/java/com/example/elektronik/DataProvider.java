package com.example.elektronik;

import android.content.Context;
import model.Elektronik;
import model.Handphone;
import model.Laptop;
import model.Televisi;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private static List<Elektronik> elektroniks = new ArrayList<>();

    private static List<Handphone> initCoktail(Context ctx) {
        List<Handphone> handphones = new ArrayList<>();
        handphones.add(new Handphone("Infinix", "Android","Infinix Hot 10 [64GB/4GB]\n" +
                "Infinix HOT 10 hadir dengan layar TFT HD+ 6,78\", ditenagai oleh prosesor gaming MediaTek Helio G70 dengan RAM 4GB dan varian memori 64GB/128GB. Baterai 5200mAh, quad kamera belakang lensa utama 16MP, kamera selfie 8MP.",R.drawable.hp_infinix));
        handphones.add(new Handphone("Xiomi",
                "Adroid", "Xiaomi Redmi 9C ini memiliki layar 6,53 inci dengan resolusi 720 x 1600 pixels, di lengkapi dengan triple kamera utama yaitu 13MP+2MP+2MP dan Selfie kamera 5MP, dengan dibekali chipset MediaTek Helio G35 (12 nm) octa-core 1,8GHz dan baterai Li-Po 5.000 mAh.\n" +
                "\n" +
                "Network : 2G, 3G, 4G (LTE)\n" +
                "Dimensions : 164.9 x 77 x 9 mm (6.49 x 3.03 x 0.35 in)\n" +
                "Weight : 196 g (6.91 oz)\n" +
                "SIM : Dual SIM (Nano-SIM, dual stand-by)\n" +
                "Display Type : IPS LCD capacitive touchscreen, 16M colors\n" +
                "Size : 6.53 inches, 102.9 cm2 (~81.1% screen-to-body ratio)\n" +
                "Resolution : 720 x 1600 pixels, 20:9 ratio (~269 ppi density) 400 nits typ. brightness (advertised)\n" +
                "OS : Android 10, MIUI 12\n" +
                "Chipset : MediaTek Helio G35 (12 nm)\n" +
                "CPU : Octa-core (4x2.3 GHz Cortex-A53 & 4x1.8 GHz Cortex-A53)\n" +
                "GPU : PowerVR GE8320 Card slot : microSDXC (dedicated slot)\n" +
                "Kamera : Kamera Belakang 13MP + 2MP + 2MP, Kamera Depan 5MP\n" +
                "WLAN : Wi-Fi 802.11 b/g/n, Wi-Fi Direct, hotspot\n" +
                "Bluetooth : 5.0, A2DP, LE\n" +
                "GPS : Yes, with A-GPS, GLONASS, BDS\n" +
                "Radio : FM radio USB : microUSB 2.0, USB On-The-Go\n" +
                "Sensors : Fingerprint (rear-mounted), accelerometer, proximity\n" +
                "Battery : Li-Po 5000 mAh, non-removable\n" +
                "Charging : Charging 10W\n" +
                "Colors : Midnight Gray, Sunrise Orange, Twilight Blue\n" +
                "Models : M2006C3MG", R.drawable.hp_xiomi));
        handphones.add(new Handphone("OPPO Reno4 F Smartphone","Samatphone","• OS: Android 10, ColorOS 7.2\n" +
                "• Size: 6.43 inches\n" +
                "• Resolution: 1080 x 2400 pixels\n" +
                "• Main Camera : 48MP + 8MP + 2MP + 2MP, Front Camera : 8MP + 2MP\n" +
                "• Battery: Li-Po 4000 mAh", R.drawable.hp_oppo));
        handphones.add(new Handphone("Nokia 110 Handphone - Black", "Hanphone","Ukuran layar : 1.8 Inch 128 x 160 piksel (~20.2% screen-to-body ratio)\n" +
                "Memori : RAM 256 MB & internal 10 MB\n" +
                "Terdapat slot micro SD : Up to 32 GB\n" +
                "Keypad alfanumeriknya yang dilapisi karet sehingga nyaman untuk Anda gunakan saat mengetik\n" +
                "Terbuat dari bahan plastik berkualitas pada bagian casing.", R.drawable.hp_noxia));
        handphones.add(new Handphone("BalackBery", "Anroid","Blackberry Aurora: Pertama Dengan Dual SIM & Android\n" +
                "Berbeda dengan di negara lain, Blackberry di Indonesia kini meluncurkan model terbarunya. Blackberry Aurora merupakan ponsel keluaran Blackberry yang ada di Indonesia. Aurora merupakan Blackberry pertama yang didesain untuk Dual Sim Card dan menggunakan system operasi Android. Selain itu, smartphone yang satu ini dilengkapi dengan kualitas kamera 13MP dan 8MP dengan autofocus dan dual LED flash. Hadir dengan Chipset Qualcom Snapdragon 425 dan RAM 4GB serta memori 32GB, Anda bisa mengakses aplikasi dan hiburan tanpa kendala.", R.drawable.hp_blackbery));
        return handphones;
    }

    private static List<Laptop> initMocktail(Context ctx) {
        List<Laptop> laptops = new ArrayList<>();

        laptops.add(new Laptop("Lenovo", "Intel", "Deskripsi Laptop Lenovo IdeaPad Slim 3i 14IGL05-46ID Celeron®N4020/SSD 256GB/4GB:\n" +
                "\n" +
                "Processor: Celeron®N4020\n" +
                "Storage: SSD 256GB M2 2242 NVME\n" +
                "Memory: 4GB Onboard DDR4 2400\n" +
                "Graphics: Integrated\n" +
                "Display: 14\" FHD TN AG 220N\n" +
                "OS: W10\n" +
                "Color: ABYSS BLUE\n" +
                "\n" +
                "Other:\n" +
                "0.3MP Webcam\n" +
                "Mic\n" +
                "2Cell 35Wh\n" +
                "OHS 2019\n" +
                "2Y", R.drawable.laptop_lenovo));
        laptops.add(new Laptop("Toshiba", "Intel", "Notebook TOSHIBA DYNABOOK C40H /I3-1005G1/4GB/256GB SSD/14\"/WIN 10/\n" +
                "Notebook TOSHIBA DYNABOOK C40H\n" +
                "Intel Core I3-1005G1\n" +
                "DDR 4 4GB\n" +
                "256GB SSD\n" +
                "Layar 14\"\n" +
                "WIN 10 Ori\n" +
                "Garansi Resmi Dari Toshiba Indonesia\n" +
                "Garansi Laptop, Adaptor & Baterai Selama 1th.", R.drawable.laptop_toshiba));
        laptops.add(new Laptop("HP", "HDD", "Processor : Intel Core i5-1135G7 Processor up to 4.7 GHz, Gen-11 Processor\n" +
                "RAM : 16 GB DDR4\n" +
                "Storage : 512GB PCIe SSD\n" +
                "Display : 14 Inch Full HD (1920×1080) IPS Display\n" +
                "Graphics : Nvidia GeForce MX450 2GB VRAM\n" +
                "OS: Windows 10 Home\n" +
                "Free Microsoft Office Home Student 2019 (Pre-installed)\n" +
                "Pilihan Warna: Grey atau Gold\n" +
                "Garansi Resmi HP Indonesia 2 Tahun", R.drawable.laptp_hp));
        laptops.add(new Laptop("Assus", "Intel", "1.High performance\n" +
                "Best productivity performance and smoother visual with up to Intel 11th Gen CPU and GeForce MX330\n" +
                "2. Dual Storage\n" +
                "For faster loading speed and bigger capacity\n" +
                "3. NanoEdge Display with 83% screen to body ratio\n" +
                "Provide bigger screen for work and entertainment in smaller form factor.\n" +
                "4. Super lightweight 15,6\"\" Laptop\n" +
                "Easier mobility and portability\n" +
                "5. Upgradeable Storage and RAM\n" +
                "Enhance your storage capacity and multitasking performance\n" +
                "6. Full options I/O Port\n" +
                "Easier to connect all of your peripherals\n" +
                "7. EAR HDD protection\n" +
                "Protect your HDD and your data- Thin & Lightweight\n" +
                "\n" +
                "\n" +
                "- NanoEdge Display\n" +
                "- Up to Intel® Core™ 11th Gen CPU and Up to MX330 Discrete Graphics\n" +
                "- Processor: Intel® Core™ i3-1005G1 Processor 1.2 GHz (4M Cache, up to 3.4 GHz, 2 cores)\n" +
                "- Memory: 4GB DDR4 on board\n" +
                "- Storage: 512GB M.2 NVMe™ PCIe® 3.0 SSD. HDD housing for storage expansion\n" +
                "- Graphic: Intel® UHD Graphics\n" +
                "- Display: 15.6-inch LED Backlit FHD (1920 x 1080) 16:9 200nits anti-glare panel\n" +
                "- Operating System: Windows 10 Home\n" +
                "- FingerPrint easy login", R.drawable.laptop_asus));
        laptops.add(new Laptop("Accer", "Intel", "• Intel® Celeron® processor\n" +
                "• Chrome OS™\n" +
                "• 11.6\" diagonal, HD (1366 x 768), anti-glare, 220 nits, 45% NTSC\n" +
                "• 4 GB LPDDR4-3733 MHz RAM (onboard)\n" +
                "• 32 GB eMMC\n" +
                "• The Chromebook built for schools and designed for learning\n" +
                "• Intel® UHD Graphics 600", R.drawable.laptop_acer));
        return laptops;
    }

    private static List<Televisi> initIndonesianFoos(Context ctx) {
        List<Televisi> televisis = new ArrayList<>();
        televisis.add(new Televisi("LG", "Smart TV", " LG 24TL520A-PT Monitor TV [24 Inch], Layar yang menghadirkan kualitas gambar luar biasa dari sudut manapun. USB AutoRUN menawarkan penggunaan yang lebih banyak. Menampilkan konten secepat Anda menghidupkan monitor dengan menghubungkannya ke USB.", R.drawable.tv_lg));
        televisis.add(new Televisi("Politron", "TV Led", "New Soundbar Design \n" +
                "\n" +
                "Hadir dengan desain baru, soundbar yang terinspirasi dari diamond cut memberikan kesan yang mewah, modern, dan minimalis. Sangat cocok untuk melengkapi ruang keluarga Anda.\n" +
                "\n" +
                "Key Features :\n" +
                "\n" +
                "5 Years Warranty (Including LED panel)\n" +
                "Soundbar with Subwoofer\n" +
                "Frameless\n" +
                "PLD\n" +
                "Specification \n" +
                "\n" +
                "LED TV 32\n" +
                "HD 1366 x 768\n" +
                "2 HDMI input\n" +
                "YUV component input\n" +
                "USB input (Movie, MP3, Jpeg. Txt)\n" +
                "AV input\n" +
                "VGA input\n" +
                "Audio output\n" +
                "Digital Audio Output / SPDIF (optical)\n" +
                "8 picture mode, Preset Equalizer\n" +
                "Eco mode, Screen Standby", R.drawable.tv_polaytron));
        televisis.add(new Televisi("Toshiba 43L5995VJ FHD Android TV LED [43 Inch/ Digital/ USB]", "Tv LED", "Kualitas Gambar Lebih Tajam dan Hidup dengan CEVO Engine\n" +
                "Untuk menghasilkan kualitas gambar dan suara yang lebih baik, TOSHIBA didukung teknologi dari CEVOTM Engine yang dapat meningkatkan kualitas audio dan video secara signifikan. Cevo Engine akan otomatis mengatur gambar agar terlihat lebih jernih, tajam dan penuh detil. Teknologi ini juga turut menghadirkan sederet fitur-fitur seperti Contrast Booster dan AMR.\n" +
                "\n" +
                "Spesifikasi :\n" +
                "\n" +
                "Ukuran Layar : 43 Inch\n" +
                "Resolusi Layar : FHD\n" +
                "SMART TV ATAU ANDROID : YES\n" +
                "NETFLIX : YES\n" +
                "Chromecast built in : YES\n" +
                "SPEAKER OUTPUT : 8W + 8W\n" +
                "AUDIO OUT : 1 ( DIGITAL ) ; (HEADPHONE SOCKET 3,5 MM )\n" +
                "Dolby Version : Dolby Digital Plus\n" +
                "Konsumsi Daya : 60 Watt\n" +
                "HDMI : 3\n" +
                "USB : 2\n" +
                "Power\n" +
                "\n" +
                "Regulator Tegangan OtomatisAC 100V-240V 50 / 60Hz\n" +
                "Konsumsi Daya < 85 Watt\n" +
                "Siaga <0,5 Watt\n" +
                "Ukuran\n" +
                "\n" +
                "Dimensi Tanpa Dudukan (Lebar x Tinggi x Kedalaman) (969 x 575 x 85) mm\n" +
                "Dimensi Dengan Dudukan (Lebar x Tinggi x Kedalaman) (969 x 616 x 201) mm-Dimensi Kemas (Lebar x Tinggi x Kedalaman) (1080 x 661 x 145) mm\n" +
                "Berat\n" +
                "\n" +
                "Berat Tanpa Stand 6.9 kg\n" +
                "Berat Dengan Stand 7.1 kg\n" +
                "Dikemas Berat 9,5 kg\n", R.drawable.tv_toshiba));
        return televisis;
    }


    private static void initAllElektronik(Context ctx) {
        elektroniks.addAll(initCoktail(ctx));
        elektroniks.addAll(initMocktail(ctx));
        elektroniks.addAll(initIndonesianFoos(ctx));
    }

    public static List<Elektronik> getElektroniksByTipe(Context ctx, String jenis) {
        List<Elektronik> elektroniksByType = new ArrayList<>();
        if (elektroniks.size() == 0) {
            initAllElektronik(ctx);
        }
        for (Elektronik h : elektroniks) {
            if (h.getElektronik().equals(jenis)) {
                elektroniksByType.add(h);
            }
        }
        return elektroniksByType;
    }
}
