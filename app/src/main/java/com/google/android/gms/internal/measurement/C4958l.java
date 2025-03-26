package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4958l implements InterfaceC5013s {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5013s f29390o;

    /* renamed from: s, reason: collision with root package name */
    private final String f29391s;

    public C4958l(String str) {
        this.f29390o = InterfaceC5013s.f29548h;
        this.f29391s = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s a() {
        return new C4958l(this.f29391s, this.f29390o.a());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Double b() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final String c() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4958l)) {
            return false;
        }
        C4958l c4958l = (C4958l) obj;
        return this.f29391s.equals(c4958l.f29391s) && this.f29390o.equals(c4958l.f29390o);
    }

    public final InterfaceC5013s f() {
        return this.f29390o;
    }

    public final String g() {
        return this.f29391s;
    }

    public final int hashCode() {
        return (this.f29391s.hashCode() * 31) + this.f29390o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s j(String str, Z2 z22, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C4958l(String str, InterfaceC5013s interfaceC5013s) {
        this.f29390o = interfaceC5013s;
        this.f29391s = str;
    }
}
