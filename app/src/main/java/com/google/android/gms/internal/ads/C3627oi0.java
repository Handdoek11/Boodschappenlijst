package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.oi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3627oi0 extends AbstractC4058sg0 {

    /* renamed from: t, reason: collision with root package name */
    final Iterator f25257t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Set f25258u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ Set f25259v;

    C3627oi0(C3736pi0 c3736pi0, Set set, Set set2) {
        this.f25258u = set;
        this.f25259v = set2;
        this.f25257t = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4058sg0
    protected final Object zza() {
        while (this.f25257t.hasNext()) {
            Iterator it = this.f25257t;
            Set set = this.f25259v;
            Object next = it.next();
            if (set.contains(next)) {
                return next;
            }
        }
        a();
        return null;
    }
}
