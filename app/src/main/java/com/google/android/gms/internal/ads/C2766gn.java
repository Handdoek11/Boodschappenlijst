package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2766gn extends NativeAd.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f22444a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private String f22445b;

    public C2766gn(InterfaceC1693Qg interfaceC1693Qg) {
        try {
            this.f22445b = interfaceC1693Qg.g();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            this.f22445b = "";
        }
        try {
            for (Object obj : interfaceC1693Qg.e()) {
                InterfaceC1938Xg t7 = obj instanceof IBinder ? AbstractBinderC1903Wg.t7((IBinder) obj) : null;
                if (t7 != null) {
                    this.f22444a.add(new C2875hn(t7));
                }
            }
        } catch (RemoteException e9) {
            H2.p.e("", e9);
        }
    }
}
