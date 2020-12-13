## Classic Meme Stickers app

This is one of my personal favourite, it is simply perfect for the meme lovers.  
its is based on the official Repository provided by Whatsapp - https://github.com/WhatsApp  
I made this for the purpose of inserting and testing Admob ads. and Firebase analytics.

> Admob Banner ad Method in Activity.java

     public void displaybanner() {
            MobileAds.initialize(this, initializationStatus -> {
            });
            AdView mAdView = findViewById(R.id.adView);
            // AdResources adResources = new AdResources();

            // https://developers.google.com/admob/android/banner
             mAdView.loadAd(new AdRequest.Builder().build());
         }
            
> Admob Banner ad Layout in Activity.xml

     <com.google.android.gms.ads.AdView
            android:id="@+id/adView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:foregroundGravity="center"
            ads:adSize="BANNER"
            ads:adUnitId="@string/admob_banner_id"/>
            

> Admob Interstitial ad Method to initialize(load) ad in Activity.java            

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
    
    
> Admob Interstitial ad Method to display ad in Activity.java 

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


   

 
