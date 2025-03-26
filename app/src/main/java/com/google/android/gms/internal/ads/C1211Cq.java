package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1211Cq {

    /* renamed from: g, reason: collision with root package name */
    final String f14243g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0611r0 f14244h;

    /* renamed from: a, reason: collision with root package name */
    long f14237a = -1;

    /* renamed from: b, reason: collision with root package name */
    long f14238b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f14239c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f14240d = -1;

    /* renamed from: e, reason: collision with root package name */
    long f14241e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f14242f = new Object();

    /* renamed from: i, reason: collision with root package name */
    int f14245i = 0;

    /* renamed from: j, reason: collision with root package name */
    int f14246j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f14247k = 0;

    public C1211Cq(String str, InterfaceC0611r0 interfaceC0611r0) {
        this.f14243g = str;
        this.f14244h = interfaceC0611r0;
    }

    private final void i() {
        if (((Boolean) AbstractC4057sg.f26721a.e()).booleanValue()) {
            synchronized (this.f14242f) {
                this.f14239c--;
                this.f14240d--;
            }
        }
    }

    public final int a() {
        int i8;
        synchronized (this.f14242f) {
            i8 = this.f14247k;
        }
        return i8;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f14242f) {
            try {
                bundle = new Bundle();
                if (!this.f14244h.L()) {
                    bundle.putString("session_id", this.f14243g);
                }
                bundle.putLong("basets", this.f14238b);
                bundle.putLong("currts", this.f14237a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f14239c);
                bundle.putInt("preqs_in_session", this.f14240d);
                bundle.putLong("time_in_session", this.f14241e);
                bundle.putInt("pclick", this.f14245i);
                bundle.putInt("pimp", this.f14246j);
                Context a8 = AbstractC1389Ho.a(context);
                int identifier = a8.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z7 = false;
                if (identifier == 0) {
                    H2.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == a8.getPackageManager().getActivityInfo(new ComponentName(a8.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z7 = true;
                        } else {
                            H2.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        H2.p.g("Fail to fetch AdActivity theme");
                        H2.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z7);
                bundle.putInt("consent_form_action_identifier", a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f14242f) {
            this.f14245i++;
        }
    }

    public final void d() {
        synchronized (this.f14242f) {
            this.f14246j++;
        }
    }

    public final void e() {
        i();
    }

    public final void f() {
        i();
    }

    public final void g(D2.X1 x12, long j8) {
        Bundle bundle;
        synchronized (this.f14242f) {
            try {
                long d8 = this.f14244h.d();
                long a8 = C2.v.c().a();
                if (this.f14238b == -1) {
                    if (a8 - d8 > ((Long) D2.A.c().a(AbstractC3184kf.f23867d1)).longValue()) {
                        this.f14240d = -1;
                    } else {
                        this.f14240d = this.f14244h.a();
                    }
                    this.f14238b = j8;
                    this.f14237a = j8;
                } else {
                    this.f14237a = j8;
                }
                if (((Boolean) D2.A.c().a(AbstractC3184kf.f23698I3)).booleanValue() || (bundle = x12.f1188t) == null || bundle.getInt("gw", 2) != 1) {
                    this.f14239c++;
                    int i8 = this.f14240d + 1;
                    this.f14240d = i8;
                    if (i8 == 0) {
                        this.f14241e = 0L;
                        this.f14244h.g0(a8);
                    } else {
                        this.f14241e = a8 - this.f14244h.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f14242f) {
            this.f14247k++;
        }
    }
}
