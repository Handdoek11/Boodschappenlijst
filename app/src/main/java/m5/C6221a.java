package m5;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.adadapted.android.sdk.core.ad.AdContentListener;
import com.adadapted.android.sdk.core.atl.AddToListContent;
import com.adadapted.android.sdk.core.view.AaZoneView;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.P1;
import q5.AbstractC6635a;

/* renamed from: m5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6221a extends n {

    /* renamed from: e, reason: collision with root package name */
    private AaZoneView f39167e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39168f;

    /* renamed from: g, reason: collision with root package name */
    private final AaZoneView.Listener f39169g;

    /* renamed from: h, reason: collision with root package name */
    private final AdContentListener f39170h;

    /* renamed from: m5.a$a, reason: collision with other inner class name */
    class C0291a implements AaZoneView.Listener {
        C0291a() {
        }

        @Override // com.adadapted.android.sdk.core.view.AaZoneView.Listener
        public void onAdLoadFailed() {
            C6221a.this.f39205c.b();
            AbstractC5673x.a("aaAdLoadFailed");
            AbstractC6635a.f("OG-AAProvider", "onAdLoadFailed()");
        }

        @Override // com.adadapted.android.sdk.core.view.AaZoneView.Listener
        public void onAdLoaded() {
            AbstractC5673x.a("aaAdLoaded");
            AbstractC6635a.d("OG-AAProvider", "onAdLoaded()");
        }

        @Override // com.adadapted.android.sdk.core.view.AaZoneView.Listener
        public void onZoneHasAds(boolean z7) {
            AbstractC6635a.d("OG-AAProvider", "onZoneHasAds: " + z7);
            if (z7) {
                return;
            }
            C6221a.this.f39205c.b();
            AbstractC5673x.a("aaZoneHasNoAds");
        }
    }

    C6221a(Context context, k kVar, ViewGroup viewGroup, p pVar) {
        super(context, viewGroup, kVar, pVar);
        this.f39167e = null;
        this.f39168f = false;
        this.f39169g = new C0291a();
        this.f39170h = new b();
    }

    private void o() {
        this.f39167e = new AaZoneView(this.f39203a);
        int a8 = this.f39206d.c() ? 90 : o.a(d());
        this.f39167e.setLayoutParams(new RelativeLayout.LayoutParams(-1, P1.i(a8)));
        D.i(this.f39167e, this.f39206d);
        this.f39204b.removeAllViews();
        this.f39204b.addView(this.f39167e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, P1.i(a8));
        layoutParams.gravity = 17;
        this.f39204b.setLayoutParams(layoutParams);
    }

    @Override // m5.n
    public void b() {
        j();
        this.f39204b.setVisibility(8);
        this.f39204b.removeAllViews();
        this.f39167e = null;
    }

    @Override // m5.n
    public boolean c() {
        o();
        i();
        this.f39204b.setVisibility(0);
        super.f();
        return true;
    }

    @Override // m5.n
    public void i() {
        AaZoneView aaZoneView = this.f39167e;
        if (aaZoneView == null || this.f39168f) {
            return;
        }
        aaZoneView.onStart(this.f39169g, this.f39170h);
        this.f39168f = true;
    }

    @Override // m5.n
    public void j() {
        AaZoneView aaZoneView = this.f39167e;
        if (aaZoneView == null || !this.f39168f) {
            return;
        }
        aaZoneView.onStop(this.f39170h);
        this.f39168f = false;
    }

    /* renamed from: m5.a$b */
    class b implements AdContentListener {
        b() {
        }

        @Override // com.adadapted.android.sdk.core.ad.AdContentListener
        public void onContentAvailable(String str, AddToListContent addToListContent) {
            AbstractC5673x.a("aaAddToList");
            C6221a.this.f39205c.a(addToListContent);
        }

        @Override // com.adadapted.android.sdk.core.ad.AdContentListener
        public void onNonContentAction(String str, String str2) {
        }
    }
}
