package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import z2.AbstractC7068c;

/* renamed from: com.google.android.gms.internal.ads.Rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1728Rg extends AbstractC7068c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1693Qg f18684a;

    /* renamed from: b, reason: collision with root package name */
    private final List f18685b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f18686c;

    public C1728Rg(InterfaceC1693Qg interfaceC1693Qg) {
        IBinder iBinder;
        this.f18684a = interfaceC1693Qg;
        try {
            this.f18686c = interfaceC1693Qg.g();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            this.f18686c = "";
        }
        try {
            for (Object obj : interfaceC1693Qg.e()) {
                InterfaceC1938Xg interfaceC1938Xg = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    interfaceC1938Xg = queryLocalInterface instanceof InterfaceC1938Xg ? (InterfaceC1938Xg) queryLocalInterface : new C1868Vg(iBinder);
                }
                if (interfaceC1938Xg != null) {
                    this.f18685b.add(new C1973Yg(interfaceC1938Xg));
                }
            }
        } catch (RemoteException e9) {
            H2.p.e("", e9);
        }
    }
}
