package com.google.android.gms.common.api.internal;

import X2.C0754b;
import Z2.AbstractC0777p;
import com.google.android.gms.common.C1105d;

/* loaded from: classes.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    private final C0754b f13363a;

    /* renamed from: b, reason: collision with root package name */
    private final C1105d f13364b;

    /* synthetic */ t(C0754b c0754b, C1105d c1105d, X2.o oVar) {
        this.f13363a = c0754b;
        this.f13364b = c1105d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof t)) {
            t tVar = (t) obj;
            if (AbstractC0777p.a(this.f13363a, tVar.f13363a) && AbstractC0777p.a(this.f13364b, tVar.f13364b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0777p.b(this.f13363a, this.f13364b);
    }

    public final String toString() {
        return AbstractC0777p.c(this).a("key", this.f13363a).a("feature", this.f13364b).toString();
    }
}
