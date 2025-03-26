package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Uf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1832Uf0 implements Serializable, InterfaceC1797Tf0 {

    /* renamed from: o, reason: collision with root package name */
    private final List f19429o;

    @Override // com.google.android.gms.internal.ads.InterfaceC1797Tf0
    public final boolean a(Object obj) {
        for (int i8 = 0; i8 < this.f19429o.size(); i8++) {
            if (!((InterfaceC1797Tf0) this.f19429o.get(i8)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1832Uf0) {
            return this.f19429o.equals(((C1832Uf0) obj).f19429o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19429o.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z7 = true;
        for (Object obj : this.f19429o) {
            if (!z7) {
                sb.append(',');
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
