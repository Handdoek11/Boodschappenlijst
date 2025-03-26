package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3988s {

    /* renamed from: a, reason: collision with root package name */
    private final C3811qJ0 f26513a = new C3811qJ0();

    /* renamed from: b, reason: collision with root package name */
    private final C3771q f26514b;

    /* renamed from: c, reason: collision with root package name */
    private final r f26515c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26516d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f26517e;

    /* renamed from: f, reason: collision with root package name */
    private float f26518f;

    /* renamed from: g, reason: collision with root package name */
    private float f26519g;

    /* renamed from: h, reason: collision with root package name */
    private float f26520h;

    /* renamed from: i, reason: collision with root package name */
    private float f26521i;

    /* renamed from: j, reason: collision with root package name */
    private int f26522j;

    /* renamed from: k, reason: collision with root package name */
    private long f26523k;

    /* renamed from: l, reason: collision with root package name */
    private long f26524l;

    /* renamed from: m, reason: collision with root package name */
    private long f26525m;

    /* renamed from: n, reason: collision with root package name */
    private long f26526n;

    /* renamed from: o, reason: collision with root package name */
    private long f26527o;

    /* renamed from: p, reason: collision with root package name */
    private long f26528p;

    /* renamed from: q, reason: collision with root package name */
    private long f26529q;

    public C3988s(Context context) {
        DisplayManager displayManager;
        C3771q c3771q = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new C3771q(this, displayManager);
        this.f26514b = c3771q;
        this.f26515c = c3771q != null ? r.a() : null;
        this.f26523k = -9223372036854775807L;
        this.f26524l = -9223372036854775807L;
        this.f26518f = -1.0f;
        this.f26521i = 1.0f;
        this.f26522j = 0;
    }

    static /* bridge */ /* synthetic */ void b(C3988s c3988s, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c3988s.f26523k = refreshRate;
            c3988s.f26524l = (refreshRate * 80) / 100;
        } else {
            HL.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c3988s.f26523k = -9223372036854775807L;
            c3988s.f26524l = -9223372036854775807L;
        }
    }

    private final void k() {
        Surface surface;
        if (AbstractC2301cW.f21206a < 30 || (surface = this.f26517e) == null || this.f26522j == Integer.MIN_VALUE || this.f26520h == 0.0f) {
            return;
        }
        this.f26520h = 0.0f;
        AbstractC3662p.a(surface, 0.0f);
    }

    private final void l() {
        this.f26525m = 0L;
        this.f26528p = -1L;
        this.f26526n = -1L;
    }

    private final void m() {
        if (AbstractC2301cW.f21206a < 30 || this.f26517e == null) {
            return;
        }
        float a8 = this.f26513a.g() ? this.f26513a.a() : this.f26518f;
        float f8 = this.f26519g;
        if (a8 != f8) {
            if (a8 != -1.0f && f8 != -1.0f) {
                float f9 = 1.0f;
                if (this.f26513a.g() && this.f26513a.d() >= 5000000000L) {
                    f9 = 0.02f;
                }
                if (Math.abs(a8 - this.f26519g) < f9) {
                    return;
                }
            } else if (a8 == -1.0f && this.f26513a.b() < 30) {
                return;
            }
            this.f26519g = a8;
            n(false);
        }
    }

    private final void n(boolean z7) {
        Surface surface;
        if (AbstractC2301cW.f21206a < 30 || (surface = this.f26517e) == null || this.f26522j == Integer.MIN_VALUE) {
            return;
        }
        float f8 = 0.0f;
        if (this.f26516d) {
            float f9 = this.f26519g;
            if (f9 != -1.0f) {
                f8 = this.f26521i * f9;
            }
        }
        if (z7 || this.f26520h != f8) {
            this.f26520h = f8;
            AbstractC3662p.a(surface, f8);
        }
    }

    public final long a(long j8) {
        long j9;
        if (this.f26528p != -1 && this.f26513a.g()) {
            long c8 = this.f26513a.c();
            long j10 = this.f26529q + ((long) ((c8 * (this.f26525m - this.f26528p)) / this.f26521i));
            if (Math.abs(j8 - j10) > 20000000) {
                l();
            } else {
                j8 = j10;
            }
        }
        this.f26526n = this.f26525m;
        this.f26527o = j8;
        r rVar = this.f26515c;
        if (rVar != null && this.f26523k != -9223372036854775807L) {
            long j11 = rVar.f26044o;
            if (j11 != -9223372036854775807L) {
                long j12 = this.f26523k;
                long j13 = j11 + (((j8 - j11) / j12) * j12);
                if (j8 <= j13) {
                    j9 = j13 - j12;
                } else {
                    j13 = j12 + j13;
                    j9 = j13;
                }
                long j14 = this.f26524l;
                if (j13 - j8 >= j8 - j9) {
                    j13 = j9;
                }
                return j13 - j14;
            }
        }
        return j8;
    }

    public final void c(float f8) {
        this.f26518f = f8;
        this.f26513a.f();
        m();
    }

    public final void d(long j8) {
        long j9 = this.f26526n;
        if (j9 != -1) {
            this.f26528p = j9;
            this.f26529q = this.f26527o;
        }
        this.f26525m++;
        this.f26513a.e(j8 * 1000);
        m();
    }

    public final void e(float f8) {
        this.f26521i = f8;
        l();
        n(false);
    }

    public final void f() {
        l();
    }

    public final void g() {
        this.f26516d = true;
        l();
        if (this.f26514b != null) {
            r rVar = this.f26515c;
            rVar.getClass();
            rVar.b();
            this.f26514b.a();
        }
        n(false);
    }

    public final void h() {
        this.f26516d = false;
        C3771q c3771q = this.f26514b;
        if (c3771q != null) {
            c3771q.b();
            r rVar = this.f26515c;
            rVar.getClass();
            rVar.c();
        }
        k();
    }

    public final void i(Surface surface) {
        if (this.f26517e == surface) {
            return;
        }
        k();
        this.f26517e = surface;
        n(true);
    }

    public final void j(int i8) {
        if (this.f26522j == i8) {
            return;
        }
        this.f26522j = i8;
        n(true);
    }
}
