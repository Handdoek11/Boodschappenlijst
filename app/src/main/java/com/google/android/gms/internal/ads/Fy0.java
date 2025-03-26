package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
final class Fy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3296lg0 f15227a;

    /* renamed from: b, reason: collision with root package name */
    private final Dy0 f15228b;

    /* renamed from: c, reason: collision with root package name */
    private Ey0 f15229c;

    /* renamed from: e, reason: collision with root package name */
    private float f15231e = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f15230d = 0;

    public Fy0(final Context context, Handler handler, Ey0 ey0) {
        this.f15227a = AbstractC3732pg0.a(new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.By0
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            }
        });
        this.f15229c = ey0;
        this.f15228b = new Dy0(this, handler);
    }

    static /* bridge */ /* synthetic */ void c(Fy0 fy0, int i8) {
        if (i8 == -3 || i8 == -2) {
            if (i8 != -2) {
                fy0.g(4);
                return;
            } else {
                fy0.f(0);
                fy0.g(3);
                return;
            }
        }
        if (i8 == -1) {
            fy0.f(-1);
            fy0.e();
            fy0.g(1);
        } else if (i8 == 1) {
            fy0.g(2);
            fy0.f(1);
        } else {
            HL.f("AudioFocusManager", "Unknown focus change type: " + i8);
        }
    }

    private final void e() {
        int i8 = this.f15230d;
        if (i8 == 1 || i8 == 0 || AbstractC2301cW.f21206a >= 26) {
            return;
        }
        ((AudioManager) this.f15227a.zza()).abandonAudioFocus(this.f15228b);
    }

    private final void f(int i8) {
        Ey0 ey0 = this.f15229c;
        if (ey0 != null) {
            int R7 = Gz0.R(i8);
            Gz0 gz0 = ((Bz0) ey0).f14048o;
            gz0.d0(gz0.x(), i8, R7);
        }
    }

    private final void g(int i8) {
        if (this.f15230d == i8) {
            return;
        }
        this.f15230d = i8;
        float f8 = i8 == 4 ? 0.2f : 1.0f;
        if (this.f15231e != f8) {
            this.f15231e = f8;
            Ey0 ey0 = this.f15229c;
            if (ey0 != null) {
                ((Bz0) ey0).f14048o.a0();
            }
        }
    }

    public final float a() {
        return this.f15231e;
    }

    public final int b(boolean z7, int i8) {
        e();
        g(0);
        return 1;
    }

    public final void d() {
        this.f15229c = null;
        e();
        g(0);
    }
}
