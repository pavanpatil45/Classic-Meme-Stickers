## Classic Meme Stickers app

This is one of my personal favourite, simply perfect for the meme lovers.  
it is based on the official Repository provided by Whatsapp - https://github.com/WhatsApp  
I made this for the purpose of inserting and testing Admob ads. and Firebase analytics.



> Banner ad Method in Activity.java
```java
     public void displaybanner() {
            MobileAds.initialize(this, initializationStatus -> {
            });
            AdView mAdView = findViewById(R.id.adView);
            // AdResources adResources = new AdResources();

            // https://developers.google.com/admob/android/banner
             mAdView.loadAd(new AdRequest.Builder().build());
         }
            
> Banner ad Layout in Activity.xml

     <com.google.android.gms.ads.AdView
            android:id="@+id/adView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:foregroundGravity="center"
            ads:adSize="BANNER"
            ads:adUnitId="@string/admob_banner_id"/>
            

> Interstitial ad Method to load ad in Activity.java            

    public void initInterstitial() {
        MobileAds.initialize(this, getString(R.string.admob_app_id));
        AdRequest adIRequest = new AdRequest.Builder().build();

        // Prepare the Interstitial Ad Activity
        interstitial = new InterstitialAd(this);

        // Insert the Ad Unit ID
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));

        // Interstitial Ad load Request
        interstitial.loadAd(adIRequest);
    }
    
    
> Interstitial ad Method to display ad in Activity.java 

    public void displayInterstitial()
    {
        // If Interstitial Ads are loaded then show else show nothing.
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial.isLoaded()) {
                    interstitial.show();
                }
            }
        });
    }
    
    
> Test ad Ids in strings.xml

    <string name="admob_app_id" translatable="false">ca-app-pub-3940256099942544~3347511713</string>
    <string name="admob_banner_id" translatable="false">ca-app-pub-3940256099942544/6300978111</string>
    <string name="admob_interstitial_id" translatable="false">ca-app-pub-3940256099942544/1033173712</string>


   

 
