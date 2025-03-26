package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.eW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2518eW implements InterfaceC4692yT {

    /* renamed from: a, reason: collision with root package name */
    private final JW f21828a;

    /* renamed from: b, reason: collision with root package name */
    private final C4358vM f21829b;

    C2518eW(JW jw, C4358vM c4358vM) {
        this.f21828a = jw;
        this.f21829b = c4358vM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4692yT
    public final C4801zT a(String str, JSONObject jSONObject) {
        InterfaceC1171Bm interfaceC1171Bm;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23728M1)).booleanValue()) {
            try {
                interfaceC1171Bm = this.f21829b.b(str);
            } catch (RemoteException e8) {
                H2.p.e("Coundn't create RTB adapter: ", e8);
                interfaceC1171Bm = null;
            }
        } else {
            interfaceC1171Bm = this.f21828a.a(str);
        }
        if (interfaceC1171Bm == null) {
            return null;
        }
        return new C4801zT(interfaceC1171Bm, new BinderC4148tU(), str);
    }
}
