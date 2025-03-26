package com.headcode.ourgroceries.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.adadapted.android.sdk.constants.Config;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f33297a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33298b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f33299c;

    /* renamed from: d, reason: collision with root package name */
    private String f33300d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f33301e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f33302f;

    /* renamed from: g, reason: collision with root package name */
    private int f33303g;

    /* renamed from: h, reason: collision with root package name */
    private int f33304h;

    /* renamed from: i, reason: collision with root package name */
    private long f33305i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f33306j;

    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (str.equals(C.this.f33300d)) {
                C.this.m();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C.this.f33304h != C.this.f33303g) {
                C c8 = C.this;
                c8.f33304h = c8.f33303g;
                C.this.f33305i = C.n();
                if (!C.this.f33302f.getKeepScreenOn() && C.this.o()) {
                    C.this.f33302f.setKeepScreenOn(true);
                    AbstractC6635a.a("OG-AutoLock", "disabling auto-lock");
                }
            } else if (C.n() - C.this.f33305i > Config.DEFAULT_AD_POLLING && C.this.f33302f.getKeepScreenOn()) {
                C.this.f33302f.setKeepScreenOn(false);
                AbstractC6635a.a("OG-AutoLock", "re-enabling auto-lock");
            }
            C.this.f33301e.postDelayed(this, 30000L);
        }
    }

    public C(ViewGroup viewGroup) {
        a aVar = new a();
        this.f33297a = aVar;
        this.f33298b = false;
        this.f33301e = OurApplication.j();
        this.f33306j = new b();
        this.f33302f = viewGroup;
        Context applicationContext = viewGroup.getContext().getApplicationContext();
        this.f33300d = applicationContext.getString(M2.f33898J1);
        SharedPreferences b8 = androidx.preference.k.b(applicationContext);
        this.f33299c = b8;
        b8.registerOnSharedPreferenceChangeListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f33298b) {
            q();
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        return this.f33299c.getBoolean(this.f33300d, true);
    }

    public void l() {
        if (this.f33298b) {
            this.f33303g++;
        }
    }

    public void p() {
        if (this.f33298b) {
            return;
        }
        this.f33298b = true;
        this.f33303g = 0;
        this.f33304h = 0;
        this.f33305i = n();
        this.f33302f.setKeepScreenOn(o());
        this.f33301e.postDelayed(this.f33306j, 30000L);
    }

    public void q() {
        if (this.f33298b) {
            this.f33298b = false;
            this.f33301e.removeCallbacks(this.f33306j);
            this.f33302f.setKeepScreenOn(false);
        }
    }
}
