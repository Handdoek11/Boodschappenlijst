package D2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC2752gg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC4275ug;

/* renamed from: D2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0552x {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC0518l0 f1361a;

    static {
        InterfaceC0518l0 interfaceC0518l0 = null;
        try {
            Object newInstance = C0549w.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    interfaceC0518l0 = queryLocalInterface instanceof InterfaceC0518l0 ? (InterfaceC0518l0) queryLocalInterface : new C0512j0(iBinder);
                }
            } else {
                H2.p.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            H2.p.g("Failed to instantiate ClientApi class.");
        }
        f1361a = interfaceC0518l0;
    }

    AbstractC0552x() {
    }

    private final Object e() {
        InterfaceC0518l0 interfaceC0518l0 = f1361a;
        if (interfaceC0518l0 == null) {
            H2.p.g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(interfaceC0518l0);
        } catch (RemoteException e8) {
            H2.p.h("Cannot invoke local loader using ClientApi class.", e8);
            return null;
        }
    }

    private final Object f() {
        try {
            return c();
        } catch (RemoteException e8) {
            H2.p.h("Cannot invoke remote loader.", e8);
            return null;
        }
    }

    protected abstract Object a();

    protected abstract Object b(InterfaceC0518l0 interfaceC0518l0);

    protected abstract Object c();

    public final Object d(Context context, boolean z7) {
        boolean z8;
        Object e8;
        if (!z7) {
            C0555y.b();
            if (!H2.g.w(context, 12451000)) {
                H2.p.b("Google Play Services is not available.");
                z7 = true;
            }
        }
        boolean z9 = false;
        boolean z10 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        AbstractC3184kf.a(context);
        if (((Boolean) AbstractC2752gg.f22414a.e()).booleanValue()) {
            z8 = false;
        } else if (((Boolean) AbstractC2752gg.f22415b.e()).booleanValue()) {
            z8 = true;
            z9 = true;
        } else {
            z9 = z7 | z10;
            z8 = false;
        }
        if (z9) {
            e8 = e();
            if (e8 == null && !z8) {
                e8 = f();
            }
        } else {
            Object f8 = f();
            if (f8 == null) {
                if (C0555y.e().nextInt(((Long) AbstractC4275ug.f27084a.e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    C0555y.b().r(context, C0555y.c().f2914o, "gmob-apps", bundle, true);
                }
            }
            e8 = f8 == null ? e() : f8;
        }
        return e8 == null ? a() : e8;
    }
}
