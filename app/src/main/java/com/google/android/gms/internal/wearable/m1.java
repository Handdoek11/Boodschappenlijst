package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
final class m1 extends s1 {

    /* renamed from: b, reason: collision with root package name */
    private final String f30204b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30205c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30206d;

    /* synthetic */ m1(String str, boolean z7, int i8, InterfaceC5273u0 interfaceC5273u0, Q0 q02, int i9, l1 l1Var) {
        this.f30204b = str;
        this.f30205c = i8;
        this.f30206d = i9;
    }

    @Override // com.google.android.gms.internal.wearable.s1
    public final InterfaceC5273u0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.wearable.s1
    public final Q0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.wearable.s1
    public final String c() {
        return this.f30204b;
    }

    @Override // com.google.android.gms.internal.wearable.s1
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.wearable.s1
    public final int e() {
        return this.f30205c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            if (this.f30204b.equals(s1Var.c())) {
                s1Var.d();
                int i8 = this.f30205c;
                int e8 = s1Var.e();
                if (i8 == 0) {
                    throw null;
                }
                if (i8 == e8) {
                    s1Var.a();
                    s1Var.b();
                    int i9 = this.f30206d;
                    int f8 = s1Var.f();
                    if (i9 == 0) {
                        throw null;
                    }
                    if (f8 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.wearable.s1
    public final int f() {
        return this.f30206d;
    }

    public final int hashCode() {
        int hashCode = this.f30204b.hashCode() ^ 1000003;
        int i8 = this.f30205c;
        if (i8 == 0) {
            throw null;
        }
        int i9 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i8;
        if (this.f30206d != 0) {
            return (i9 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i8 = this.f30205c;
        String str = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.f30206d == 1 ? "READ_AND_WRITE" : "null";
        return "FileComplianceOptions{fileOwner=" + this.f30204b + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }
}
