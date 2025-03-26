package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Ij, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419Ij implements P6 {

    /* renamed from: a, reason: collision with root package name */
    private volatile C4281uj f15987a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15988b;

    public C1419Ij(Context context) {
        this.f15988b = context;
    }

    static /* bridge */ /* synthetic */ void c(C1419Ij c1419Ij) {
        if (c1419Ij.f15987a == null) {
            return;
        }
        c1419Ij.f15987a.g();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.P6
    public final R6 a(U6 u62) {
        Parcelable.Creator<C4499wj> creator = C4499wj.CREATOR;
        Map q8 = u62.q();
        int size = q8.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i8 = 0;
        int i9 = 0;
        for (Map.Entry entry : q8.entrySet()) {
            strArr[i9] = (String) entry.getKey();
            strArr2[i9] = (String) entry.getValue();
            i9++;
        }
        C4499wj c4499wj = new C4499wj(u62.p(), strArr, strArr2);
        long b8 = C2.v.c().b();
        try {
            C1811Tq c1811Tq = new C1811Tq();
            this.f15987a = new C4281uj(this.f15988b, C2.v.x().b(), new C1347Gj(this, c1811Tq), new C1383Hj(this, c1811Tq));
            this.f15987a.q();
            C1275Ej c1275Ej = new C1275Ej(this, c4499wj);
            InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16644a;
            com.google.common.util.concurrent.d o8 = AbstractC2326ck0.o(AbstractC2326ck0.n(c1811Tq, c1275Ej, interfaceExecutorServiceC3522nk0), ((Integer) D2.A.c().a(AbstractC3184kf.f24054y4)).intValue(), TimeUnit.MILLISECONDS, AbstractC1497Kq.f16647d);
            o8.f(new RunnableC1311Fj(this), interfaceExecutorServiceC3522nk0);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o8.get();
            AbstractC0608p0.k("Http assets remote cache took " + (C2.v.c().b() - b8) + "ms");
            C4717yj c4717yj = (C4717yj) new C4400vo(parcelFileDescriptor).A0(C4717yj.CREATOR);
            if (c4717yj == null) {
                return null;
            }
            if (c4717yj.f28169o) {
                throw new zzapv(c4717yj.f28170s);
            }
            if (c4717yj.f28173v.length != c4717yj.f28174w.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = c4717yj.f28173v;
                if (i8 >= strArr3.length) {
                    return new R6(c4717yj.f28171t, c4717yj.f28172u, hashMap, c4717yj.f28175x, c4717yj.f28176y);
                }
                hashMap.put(strArr3[i8], c4717yj.f28174w[i8]);
                i8++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            AbstractC0608p0.k("Http assets remote cache took " + (C2.v.c().b() - b8) + "ms");
            return null;
        } catch (Throwable th) {
            AbstractC0608p0.k("Http assets remote cache took " + (C2.v.c().b() - b8) + "ms");
            throw th;
        }
    }
}
