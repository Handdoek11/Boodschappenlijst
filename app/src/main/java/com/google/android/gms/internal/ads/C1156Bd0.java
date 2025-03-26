package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1156Bd0 extends AbstractC1444Jd0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f13824b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13825c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13826d;

    /* synthetic */ C1156Bd0(String str, boolean z7, int i8, InterfaceC4597xd0 interfaceC4597xd0, InterfaceC4706yd0 interfaceC4706yd0, int i9, AbstractC1120Ad0 abstractC1120Ad0) {
        this.f13824b = str;
        this.f13825c = i8;
        this.f13826d = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1444Jd0
    public final InterfaceC4597xd0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1444Jd0
    public final InterfaceC4706yd0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1444Jd0
    public final String c() {
        return this.f13824b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1444Jd0
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1444Jd0
    public final int e() {
        return this.f13825c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1444Jd0) {
            AbstractC1444Jd0 abstractC1444Jd0 = (AbstractC1444Jd0) obj;
            if (this.f13824b.equals(abstractC1444Jd0.c())) {
                abstractC1444Jd0.d();
                int i8 = this.f13825c;
                int e8 = abstractC1444Jd0.e();
                if (i8 == 0) {
                    throw null;
                }
                if (i8 == e8) {
                    abstractC1444Jd0.a();
                    abstractC1444Jd0.b();
                    int i9 = this.f13826d;
                    int f8 = abstractC1444Jd0.f();
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

    @Override // com.google.android.gms.internal.ads.AbstractC1444Jd0
    public final int f() {
        return this.f13826d;
    }

    public final int hashCode() {
        int hashCode = this.f13824b.hashCode() ^ 1000003;
        int i8 = this.f13825c;
        if (i8 == 0) {
            throw null;
        }
        int i9 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i8;
        if (this.f13826d != 0) {
            return (i9 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i8 = this.f13825c;
        String str = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.f13826d == 1 ? "READ_AND_WRITE" : "null";
        return "FileComplianceOptions{fileOwner=" + this.f13824b + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }
}
