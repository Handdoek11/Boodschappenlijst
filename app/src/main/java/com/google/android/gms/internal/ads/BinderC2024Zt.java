package com.google.android.gms.internal.ads;

import D2.InterfaceC0489b1;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Zt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2024Zt extends D2.X0 {

    /* renamed from: A, reason: collision with root package name */
    private float f20560A;

    /* renamed from: B, reason: collision with root package name */
    private float f20561B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f20562C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f20563D;

    /* renamed from: E, reason: collision with root package name */
    private C1307Fh f20564E;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1567Mr f20565o;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f20567t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f20568u;

    /* renamed from: v, reason: collision with root package name */
    private int f20569v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC0489b1 f20570w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20571x;

    /* renamed from: z, reason: collision with root package name */
    private float f20573z;

    /* renamed from: s, reason: collision with root package name */
    private final Object f20566s = new Object();

    /* renamed from: y, reason: collision with root package name */
    private boolean f20572y = true;

    public BinderC2024Zt(InterfaceC1567Mr interfaceC1567Mr, float f8, boolean z7, boolean z8) {
        this.f20565o = interfaceC1567Mr;
        this.f20573z = f8;
        this.f20567t = z7;
        this.f20568u = z8;
    }

    private final void A7(final int i8, final int i9, final boolean z7, final boolean z8) {
        AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Yt
            @Override // java.lang.Runnable
            public final void run() {
                this.f20345o.v7(i8, i9, z7, z8);
            }
        });
    }

    private final void B7(String str, Map map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        AbstractC1497Kq.f16649f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Xt
            @Override // java.lang.Runnable
            public final void run() {
                this.f20155o.w7(hashMap);
            }
        });
    }

    @Override // D2.Y0
    public final void N6(InterfaceC0489b1 interfaceC0489b1) {
        synchronized (this.f20566s) {
            this.f20570w = interfaceC0489b1;
        }
    }

    @Override // D2.Y0
    public final float b() {
        float f8;
        synchronized (this.f20566s) {
            f8 = this.f20561B;
        }
        return f8;
    }

    @Override // D2.Y0
    public final float c() {
        float f8;
        synchronized (this.f20566s) {
            f8 = this.f20560A;
        }
        return f8;
    }

    @Override // D2.Y0
    public final int e() {
        int i8;
        synchronized (this.f20566s) {
            i8 = this.f20569v;
        }
        return i8;
    }

    @Override // D2.Y0
    public final InterfaceC0489b1 f() {
        InterfaceC0489b1 interfaceC0489b1;
        synchronized (this.f20566s) {
            interfaceC0489b1 = this.f20570w;
        }
        return interfaceC0489b1;
    }

    @Override // D2.Y0
    public final float g() {
        float f8;
        synchronized (this.f20566s) {
            f8 = this.f20573z;
        }
        return f8;
    }

    @Override // D2.Y0
    public final void i() {
        B7("pause", null);
    }

    @Override // D2.Y0
    public final void j() {
        B7("play", null);
    }

    @Override // D2.Y0
    public final void k0(boolean z7) {
        B7(true != z7 ? "unmute" : "mute", null);
    }

    @Override // D2.Y0
    public final void l() {
        B7("stop", null);
    }

    @Override // D2.Y0
    public final boolean o() {
        boolean z7;
        Object obj = this.f20566s;
        boolean p8 = p();
        synchronized (obj) {
            z7 = false;
            if (!p8) {
                try {
                    if (this.f20563D && this.f20568u) {
                        z7 = true;
                    }
                } finally {
                }
            }
        }
        return z7;
    }

    @Override // D2.Y0
    public final boolean p() {
        boolean z7;
        synchronized (this.f20566s) {
            try {
                z7 = false;
                if (this.f20567t && this.f20562C) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    @Override // D2.Y0
    public final boolean q() {
        boolean z7;
        synchronized (this.f20566s) {
            z7 = this.f20572y;
        }
        return z7;
    }

    public final void u7(float f8, float f9, int i8, boolean z7, float f10) {
        boolean z8;
        boolean z9;
        int i9;
        synchronized (this.f20566s) {
            try {
                z8 = true;
                if (f9 == this.f20573z && f10 == this.f20561B) {
                    z8 = false;
                }
                this.f20573z = f9;
                if (!((Boolean) D2.A.c().a(AbstractC3184kf.Gc)).booleanValue()) {
                    this.f20560A = f8;
                }
                z9 = this.f20572y;
                this.f20572y = z7;
                i9 = this.f20569v;
                this.f20569v = i8;
                float f11 = this.f20561B;
                this.f20561B = f10;
                if (Math.abs(f10 - f11) > 1.0E-4f) {
                    this.f20565o.M().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            try {
                C1307Fh c1307Fh = this.f20564E;
                if (c1307Fh != null) {
                    c1307Fh.b();
                }
            } catch (RemoteException e8) {
                H2.p.i("#007 Could not call remote method.", e8);
            }
        }
        A7(i9, i8, z9, z7);
    }

    final /* synthetic */ void v7(int i8, int i9, boolean z7, boolean z8) {
        int i10;
        boolean z9;
        boolean z10;
        InterfaceC0489b1 interfaceC0489b1;
        InterfaceC0489b1 interfaceC0489b12;
        InterfaceC0489b1 interfaceC0489b13;
        synchronized (this.f20566s) {
            try {
                boolean z11 = this.f20571x;
                if (z11 || i9 != 1) {
                    i10 = i9;
                    z9 = false;
                } else {
                    i9 = 1;
                    i10 = 1;
                    z9 = true;
                }
                boolean z12 = i8 != i9;
                if (z12 && i10 == 1) {
                    z10 = true;
                    i10 = 1;
                } else {
                    z10 = false;
                }
                boolean z13 = z12 && i10 == 2;
                boolean z14 = z12 && i10 == 3;
                this.f20571x = z11 || z9;
                if (z9) {
                    try {
                        InterfaceC0489b1 interfaceC0489b14 = this.f20570w;
                        if (interfaceC0489b14 != null) {
                            interfaceC0489b14.f();
                        }
                    } catch (RemoteException e8) {
                        H2.p.i("#007 Could not call remote method.", e8);
                    }
                }
                if (z10 && (interfaceC0489b13 = this.f20570w) != null) {
                    interfaceC0489b13.e();
                }
                if (z13 && (interfaceC0489b12 = this.f20570w) != null) {
                    interfaceC0489b12.g();
                }
                if (z14) {
                    InterfaceC0489b1 interfaceC0489b15 = this.f20570w;
                    if (interfaceC0489b15 != null) {
                        interfaceC0489b15.b();
                    }
                    this.f20565o.w();
                }
                if (z7 != z8 && (interfaceC0489b1 = this.f20570w) != null) {
                    interfaceC0489b1.C0(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void w7(Map map) {
        this.f20565o.D0("pubVideoCmd", map);
    }

    public final void x() {
        boolean z7;
        int i8;
        synchronized (this.f20566s) {
            z7 = this.f20572y;
            i8 = this.f20569v;
            this.f20569v = 3;
        }
        A7(i8, 3, z7, z7);
    }

    public final void x7(D2.Q1 q12) {
        Object obj = this.f20566s;
        boolean z7 = q12.f1156o;
        boolean z8 = q12.f1157s;
        boolean z9 = q12.f1158t;
        synchronized (obj) {
            this.f20562C = z8;
            this.f20563D = z9;
        }
        B7("initialState", f3.f.c("muteStart", true != z7 ? "0" : "1", "customControlsRequested", true != z8 ? "0" : "1", "clickToExpandRequested", true != z9 ? "0" : "1"));
    }

    public final void y7(float f8) {
        synchronized (this.f20566s) {
            this.f20560A = f8;
        }
    }

    public final void z7(C1307Fh c1307Fh) {
        synchronized (this.f20566s) {
            this.f20564E = c1307Fh;
        }
    }
}
