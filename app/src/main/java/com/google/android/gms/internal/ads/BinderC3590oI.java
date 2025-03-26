package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.oI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC3590oI extends AbstractBinderC1798Tg {

    /* renamed from: o, reason: collision with root package name */
    private final HI f25143o;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC5852a f25144s;

    public BinderC3590oI(HI hi) {
        this.f25143o = hi;
    }

    private static float t7(InterfaceC5852a interfaceC5852a) {
        Drawable drawable;
        if (interfaceC5852a == null || (drawable = (Drawable) BinderC5853b.J0(interfaceC5852a)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final void Q3(C1307Fh c1307Fh) {
        if (this.f25143o.W() instanceof BinderC2024Zt) {
            ((BinderC2024Zt) this.f25143o.W()).z7(c1307Fh);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final void U(InterfaceC5852a interfaceC5852a) {
        this.f25144s = interfaceC5852a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final float b() {
        if (this.f25143o.O() != 0.0f) {
            return this.f25143o.O();
        }
        if (this.f25143o.W() != null) {
            try {
                return this.f25143o.W().b();
            } catch (RemoteException e8) {
                H2.p.e("Remote exception getting video controller aspect ratio.", e8);
                return 0.0f;
            }
        }
        InterfaceC5852a interfaceC5852a = this.f25144s;
        if (interfaceC5852a != null) {
            return t7(interfaceC5852a);
        }
        InterfaceC1938Xg Z7 = this.f25143o.Z();
        if (Z7 == null) {
            return 0.0f;
        }
        float d8 = (Z7.d() == -1 || Z7.a() == -1) ? 0.0f : Z7.d() / Z7.a();
        return d8 == 0.0f ? t7(Z7.c()) : d8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final float c() {
        if (this.f25143o.W() != null) {
            return this.f25143o.W().c();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final D2.Y0 e() {
        return this.f25143o.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final InterfaceC5852a f() {
        InterfaceC5852a interfaceC5852a = this.f25144s;
        if (interfaceC5852a != null) {
            return interfaceC5852a;
        }
        InterfaceC1938Xg Z7 = this.f25143o.Z();
        if (Z7 == null) {
            return null;
        }
        return Z7.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final float g() {
        if (this.f25143o.W() != null) {
            return this.f25143o.W().g();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final boolean i() {
        return this.f25143o.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1833Ug
    public final boolean j() {
        return this.f25143o.W() != null;
    }
}
