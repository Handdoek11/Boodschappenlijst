package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;

/* renamed from: com.google.android.gms.internal.ads.Fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1305Fg {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15185a;

    public C1305Fg(Context context) {
        this.f15185a = context;
    }

    public final void a(InterfaceC2018Zn interfaceC2018Zn) {
        try {
            ((C1341Gg) H2.s.b(this.f15185a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new H2.r() { // from class: com.google.android.gms.internal.ads.Eg
                @Override // H2.r
                public final Object a(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof C1341Gg ? (C1341Gg) queryLocalInterface : new C1341Gg(iBinder);
                }
            })).q2(interfaceC2018Zn);
        } catch (RemoteException e8) {
            H2.p.g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e8.getMessage())));
        } catch (zzr e9) {
            H2.p.g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e9.getMessage())));
        }
    }
}
