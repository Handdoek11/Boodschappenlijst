package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* renamed from: com.google.android.gms.internal.ads.zl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC4830zl extends AbstractBinderC1206Cl {
    @Override // com.google.android.gms.internal.ads.InterfaceC1242Dl
    public final InterfaceC1171Bm C(String str) {
        return new BinderC1632Om((RtbAdapter) Class.forName(str, false, AbstractC1315Fm.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1242Dl
    public final boolean Z(String str) {
        try {
            return J2.a.class.isAssignableFrom(Class.forName(str, false, BinderC4830zl.class.getClassLoader()));
        } catch (Throwable unused) {
            H2.p.g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1242Dl
    public final boolean n(String str) {
        try {
            return K2.a.class.isAssignableFrom(Class.forName(str, false, BinderC4830zl.class.getClassLoader()));
        } catch (Throwable unused) {
            H2.p.g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1242Dl
    public final InterfaceC1350Gl v(String str) {
        BinderC2546em binderC2546em;
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC4830zl.class.getClassLoader());
                if (J2.f.class.isAssignableFrom(cls)) {
                    return new BinderC2546em((J2.f) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (J2.a.class.isAssignableFrom(cls)) {
                    return new BinderC2546em((J2.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                H2.p.g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                H2.p.b("Reflection failed, retrying using direct instantiation");
                if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        binderC2546em = new BinderC2546em(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                binderC2546em = new BinderC2546em(new AdMobAdapter());
                return binderC2546em;
            }
        } catch (Throwable th) {
            H2.p.h("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }
}
