package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes.dex */
final class V2 extends AbstractC5033u3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29037a;

    /* renamed from: b, reason: collision with root package name */
    private final b4.k f29038b;

    V2(Context context, b4.k kVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f29037a = context;
        this.f29038b = kVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5033u3
    final Context a() {
        return this.f29037a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5033u3
    final b4.k b() {
        return this.f29038b;
    }

    public final boolean equals(Object obj) {
        b4.k kVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5033u3) {
            AbstractC5033u3 abstractC5033u3 = (AbstractC5033u3) obj;
            if (this.f29037a.equals(abstractC5033u3.a()) && ((kVar = this.f29038b) != null ? kVar.equals(abstractC5033u3.b()) : abstractC5033u3.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f29037a.hashCode() ^ 1000003) * 1000003;
        b4.k kVar = this.f29038b;
        return hashCode ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f29037a) + ", hermeticFileOverrides=" + String.valueOf(this.f29038b) + "}";
    }
}
