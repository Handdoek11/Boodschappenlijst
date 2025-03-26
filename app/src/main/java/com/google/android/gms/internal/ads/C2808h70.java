package com.google.android.gms.internal.ads;

import D2.AbstractBinderC0535r0;
import D2.C0542t1;
import D2.InterfaceC0538s0;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.h70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2808h70 {

    /* renamed from: d, reason: collision with root package name */
    private static C2808h70 f22494d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f22495a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0538s0 f22496b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f22497c = new AtomicReference();

    C2808h70(Context context, InterfaceC0538s0 interfaceC0538s0) {
        this.f22495a = context;
        this.f22496b = interfaceC0538s0;
    }

    static InterfaceC0538s0 a(Context context) {
        try {
            return AbstractBinderC0535r0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            H2.p.e("Failed to retrieve lite SDK info.", e8);
            return null;
        }
    }

    public static C2808h70 d(Context context) {
        synchronized (C2808h70.class) {
            try {
                C2808h70 c2808h70 = f22494d;
                if (c2808h70 != null) {
                    return c2808h70;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) AbstractC3404mg.f24547b.e()).longValue();
                InterfaceC0538s0 interfaceC0538s0 = null;
                if (longValue > 0 && longValue <= 244410203) {
                    interfaceC0538s0 = a(applicationContext);
                }
                C2808h70 c2808h702 = new C2808h70(applicationContext, interfaceC0538s0);
                f22494d = c2808h702;
                return c2808h702;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final C0542t1 g() {
        InterfaceC0538s0 interfaceC0538s0 = this.f22496b;
        if (interfaceC0538s0 != null) {
            try {
                return interfaceC0538s0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final InterfaceC1242Dl b() {
        return (InterfaceC1242Dl) this.f22497c.get();
    }

    public final H2.a c(int i8, boolean z7, int i9) {
        C0542t1 g8;
        C2.v.t();
        boolean f8 = G2.D0.f(this.f22495a);
        H2.a aVar = new H2.a(244410000, i9, true, f8);
        return (((Boolean) AbstractC3404mg.f24548c.e()).booleanValue() && (g8 = g()) != null) ? new H2.a(244410000, g8.A0(), true, f8) : aVar;
    }

    public final String e() {
        C0542t1 g8 = g();
        if (g8 != null) {
            return g8.B0();
        }
        return null;
    }

    public final void f(InterfaceC1242Dl interfaceC1242Dl) {
        InterfaceC1242Dl adapterCreator;
        if (!((Boolean) AbstractC3404mg.f24546a.e()).booleanValue()) {
            AbstractC2699g70.a(this.f22497c, null, interfaceC1242Dl);
            return;
        }
        InterfaceC0538s0 interfaceC0538s0 = this.f22496b;
        if (interfaceC0538s0 == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = interfaceC0538s0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.f22497c;
        if (adapterCreator != null) {
            interfaceC1242Dl = adapterCreator;
        }
        AbstractC2699g70.a(atomicReference, null, interfaceC1242Dl);
    }
}
