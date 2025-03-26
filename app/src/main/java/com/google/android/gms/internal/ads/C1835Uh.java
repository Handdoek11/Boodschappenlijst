package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.ArrayList;
import java.util.List;
import z2.AbstractC7069d;
import z2.AbstractC7072g;

/* renamed from: com.google.android.gms.internal.ads.Uh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1835Uh extends AbstractC7072g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1800Th f19431a;

    /* renamed from: c, reason: collision with root package name */
    private final C1973Yg f19433c;

    /* renamed from: b, reason: collision with root package name */
    private final List f19432b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final w2.w f19434d = new w2.w();

    /* renamed from: e, reason: collision with root package name */
    private final List f19435e = new ArrayList();

    public C1835Uh(InterfaceC1800Th interfaceC1800Th) {
        InterfaceC1938Xg interfaceC1938Xg;
        IBinder iBinder;
        this.f19431a = interfaceC1800Th;
        C1973Yg c1973Yg = null;
        try {
            List x7 = interfaceC1800Th.x();
            if (x7 != null) {
                for (Object obj : x7) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        interfaceC1938Xg = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        interfaceC1938Xg = queryLocalInterface instanceof InterfaceC1938Xg ? (InterfaceC1938Xg) queryLocalInterface : new C1868Vg(iBinder);
                    }
                    if (interfaceC1938Xg != null) {
                        this.f19432b.add(new C1973Yg(interfaceC1938Xg));
                    }
                }
            }
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
        try {
            List u7 = this.f19431a.u();
            if (u7 != null) {
                for (Object obj2 : u7) {
                    D2.D0 t7 = obj2 instanceof IBinder ? D2.C0.t7((IBinder) obj2) : null;
                    if (t7 != null) {
                        this.f19435e.add(new D2.E0(t7));
                    }
                }
            }
        } catch (RemoteException e9) {
            H2.p.e("", e9);
        }
        try {
            InterfaceC1938Xg i8 = this.f19431a.i();
            if (i8 != null) {
                c1973Yg = new C1973Yg(i8);
            }
        } catch (RemoteException e10) {
            H2.p.e("", e10);
        }
        this.f19433c = c1973Yg;
        try {
            if (this.f19431a.f() != null) {
                new C1728Rg(this.f19431a.f());
            }
        } catch (RemoteException e11) {
            H2.p.e("", e11);
        }
    }

    @Override // z2.AbstractC7072g
    public final w2.w a() {
        try {
            if (this.f19431a.e() != null) {
                this.f19434d.c(this.f19431a.e());
            }
        } catch (RemoteException e8) {
            H2.p.e("Exception occurred while getting video controller", e8);
        }
        return this.f19434d;
    }

    @Override // z2.AbstractC7072g
    public final AbstractC7069d b() {
        return this.f19433c;
    }

    @Override // z2.AbstractC7072g
    public final Double c() {
        try {
            double b8 = this.f19431a.b();
            if (b8 == -1.0d) {
                return null;
            }
            return Double.valueOf(b8);
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // z2.AbstractC7072g
    public final Object d() {
        try {
            InterfaceC5852a j8 = this.f19431a.j();
            if (j8 != null) {
                return BinderC5853b.J0(j8);
            }
            return null;
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // z2.AbstractC7072g
    public final String e() {
        try {
            return this.f19431a.l();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // z2.AbstractC7072g
    public final String f() {
        try {
            return this.f19431a.o();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // z2.AbstractC7072g
    public final String g() {
        try {
            return this.f19431a.p();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // z2.AbstractC7072g
    public final String h() {
        try {
            return this.f19431a.q();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // z2.AbstractC7072g
    public final String i() {
        try {
            return this.f19431a.s();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // z2.AbstractC7072g
    public final String j() {
        try {
            return this.f19431a.t();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }

    @Override // z2.AbstractC7072g
    public final List k() {
        return this.f19432b;
    }
}
