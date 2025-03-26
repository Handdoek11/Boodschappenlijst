package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4933i0 extends AbstractC4999q0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f29328c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29329d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC5014s0 f29330e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC5006r0 f29331f;

    @Override // com.google.android.gms.internal.measurement.AbstractC4999q0
    public final InterfaceC4915g0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4999q0
    public final InterfaceC4906f0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4999q0
    public final EnumC5014s0 c() {
        return this.f29330e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4999q0
    public final EnumC5006r0 d() {
        return this.f29331f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4999q0
    public final String e() {
        return this.f29328c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4999q0) {
            AbstractC4999q0 abstractC4999q0 = (AbstractC4999q0) obj;
            if (this.f29328c.equals(abstractC4999q0.e()) && this.f29329d == abstractC4999q0.f() && this.f29330e.equals(abstractC4999q0.c())) {
                abstractC4999q0.a();
                abstractC4999q0.b();
                if (this.f29331f.equals(abstractC4999q0.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4999q0
    public final boolean f() {
        return this.f29329d;
    }

    public final int hashCode() {
        return ((((((this.f29328c.hashCode() ^ 1000003) * 1000003) ^ (this.f29329d ? 1231 : 1237)) * 1000003) ^ this.f29330e.hashCode()) * 583896283) ^ this.f29331f.hashCode();
    }

    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.f29328c + ", hasDifferentDmaOwner=" + this.f29329d + ", fileChecks=" + String.valueOf(this.f29330e) + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + String.valueOf(this.f29331f) + "}";
    }

    private C4933i0(String str, boolean z7, EnumC5014s0 enumC5014s0, InterfaceC4915g0 interfaceC4915g0, InterfaceC4906f0 interfaceC4906f0, EnumC5006r0 enumC5006r0) {
        this.f29328c = str;
        this.f29329d = z7;
        this.f29330e = enumC5014s0;
        this.f29331f = enumC5006r0;
    }
}
