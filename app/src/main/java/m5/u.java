package m5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.MobileAds;
import com.headcode.ourgroceries.android.A2;
import com.headcode.ourgroceries.android.F2;
import com.headcode.ourgroceries.android.OurApplication;
import q5.AbstractC6635a;
import w2.C6882h;

/* loaded from: classes2.dex */
public abstract class u extends n {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f39225f = false;

    /* renamed from: g, reason: collision with root package name */
    private static SharedPreferences.OnSharedPreferenceChangeListener f39226g;

    /* renamed from: e, reason: collision with root package name */
    private long f39227e;

    u(Context context, k kVar, ViewGroup viewGroup, p pVar) {
        super(context, viewGroup, kVar, pVar);
        this.f39227e = 0L;
    }

    public static void t(final Context context, final A2 a22) {
        z(context);
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: m5.r
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                u.u(a22, context, sharedPreferences, str);
            }
        };
        f39226g = onSharedPreferenceChangeListener;
        a22.f0(onSharedPreferenceChangeListener);
        new Thread(new Runnable() { // from class: m5.s
            @Override // java.lang.Runnable
            public final void run() {
                u.w(context);
            }
        }).start();
        f39225f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(A2 a22, Context context, SharedPreferences sharedPreferences, String str) {
        if (str.equals(a22.z())) {
            z(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Context context) {
        try {
            MobileAds.a(context, new B2.c() { // from class: m5.t
                @Override // B2.c
                public final void a(B2.b bVar) {
                    u.v(bVar);
                }
            });
        } catch (RuntimeException e8) {
            com.google.firebase.crashlytics.a.b().e(e8);
            AbstractC6635a.c("OG-GoogleAd", e8);
        }
    }

    private static void z(Context context) {
        SharedPreferences b8 = androidx.preference.k.b(context);
        if (A2.f33140n0.y()) {
            b8.edit().remove("gad_rdp").apply();
        } else {
            b8.edit().putInt("gad_rdp", 1).apply();
        }
    }

    @Override // m5.n
    public void b() {
        this.f39204b.setVisibility(8);
        this.f39204b.removeAllViews();
    }

    @Override // m5.n
    public boolean c() {
        if (!f39225f) {
            return false;
        }
        if (!OurApplication.f34286H.f().i()) {
            AbstractC6635a.d("OG-GoogleAd", "Not permitted to show Google Ads");
            return false;
        }
        this.f39227e = 0L;
        r();
        this.f39204b.setVisibility(0);
        super.f();
        return true;
    }

    @Override // m5.n
    public void m(j jVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = this.f39227e;
        if (j8 == 0 || elapsedRealtime - j8 >= 60000) {
            x(jVar);
            this.f39227e = elapsedRealtime;
        }
    }

    protected abstract void r();

    protected C6882h s() {
        Resources d8 = d();
        if (d8 == null) {
            return C6882h.f44277o;
        }
        DisplayMetrics displayMetrics = d8.getDisplayMetrics();
        if (displayMetrics == null) {
            return C6882h.f44277o;
        }
        int round = Math.round(displayMetrics.widthPixels / displayMetrics.density);
        if (!this.f39206d.c()) {
            return C6882h.a(this.f39203a, round);
        }
        return C6882h.b(this.f39203a, Math.min(round, Math.round(d8.getDimensionPixelSize(F2.f33445e) / displayMetrics.density)));
    }

    protected abstract void x(j jVar);

    protected void y(C6882h c6882h) {
        if (this.f39206d.c()) {
            k();
            return;
        }
        int d8 = c6882h.d(this.f39203a);
        if (d8 == 0) {
            d8 = -2;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, d8);
        layoutParams.gravity = 1;
        this.f39204b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(B2.b bVar) {
    }
}
