package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
final class OD0 {

    /* renamed from: a, reason: collision with root package name */
    private final ND0 f17854a;

    /* renamed from: b, reason: collision with root package name */
    private int f17855b;

    /* renamed from: c, reason: collision with root package name */
    private long f17856c;

    /* renamed from: d, reason: collision with root package name */
    private long f17857d;

    /* renamed from: e, reason: collision with root package name */
    private long f17858e;

    /* renamed from: f, reason: collision with root package name */
    private long f17859f;

    public OD0(AudioTrack audioTrack) {
        this.f17854a = new ND0(audioTrack);
        h(0);
    }

    private final void h(int i8) {
        this.f17855b = i8;
        long j8 = 10000;
        if (i8 == 0) {
            this.f17858e = 0L;
            this.f17859f = -1L;
            this.f17856c = System.nanoTime() / 1000;
        } else {
            if (i8 == 1) {
                this.f17857d = 10000L;
                return;
            }
            j8 = (i8 == 2 || i8 == 3) ? 10000000L : 500000L;
        }
        this.f17857d = j8;
    }

    public final long a() {
        return this.f17854a.a();
    }

    public final long b() {
        return this.f17854a.b();
    }

    public final void c() {
        if (this.f17855b == 4) {
            h(0);
        }
    }

    public final void d() {
        h(4);
    }

    public final void e() {
        h(0);
    }

    public final boolean f() {
        return this.f17855b == 2;
    }

    public final boolean g(long j8) {
        if (j8 - this.f17858e < this.f17857d) {
            return false;
        }
        this.f17858e = j8;
        boolean c8 = this.f17854a.c();
        int i8 = this.f17855b;
        if (i8 == 0) {
            if (!c8) {
                if (j8 - this.f17856c <= 500000) {
                    return false;
                }
                h(3);
                return false;
            }
            if (this.f17854a.b() < this.f17856c) {
                return false;
            }
            this.f17859f = this.f17854a.a();
            h(1);
            return true;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return c8;
                }
                if (!c8) {
                    return false;
                }
                h(0);
                return true;
            }
            if (!c8) {
                h(0);
                return false;
            }
        } else {
            if (!c8) {
                h(0);
                return false;
            }
            if (this.f17854a.a() > this.f17859f) {
                h(2);
                return true;
            }
        }
        return true;
    }
}
