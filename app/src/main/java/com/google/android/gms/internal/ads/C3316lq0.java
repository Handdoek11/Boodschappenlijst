package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3316lq0 implements Jp0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3316lq0 f24388a = new C3316lq0();

    private C3316lq0() {
    }

    static void b() {
        C3096jp0.a().f(f24388a);
    }

    @Override // com.google.android.gms.internal.ads.Jp0
    public final /* bridge */ /* synthetic */ Object a(Ip0 ip0) {
        if (ip0.c() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ip0.e().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new C3098jq0(ip0, null);
    }

    @Override // com.google.android.gms.internal.ads.Jp0
    public final Class zza() {
        return InterfaceC2990iq0.class;
    }

    @Override // com.google.android.gms.internal.ads.Jp0
    public final Class zzb() {
        return InterfaceC2990iq0.class;
    }
}
