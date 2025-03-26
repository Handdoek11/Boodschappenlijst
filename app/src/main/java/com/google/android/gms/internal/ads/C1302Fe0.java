package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fe0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1302Fe0 extends AbstractC2968if0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15183a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15184b;

    /* synthetic */ C1302Fe0(String str, String str2, AbstractC1266Ee0 abstractC1266Ee0) {
        this.f15183a = str;
        this.f15184b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2968if0
    public final String a() {
        return this.f15184b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2968if0
    public final String b() {
        return this.f15183a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2968if0) {
            AbstractC2968if0 abstractC2968if0 = (AbstractC2968if0) obj;
            String str = this.f15183a;
            if (str != null ? str.equals(abstractC2968if0.b()) : abstractC2968if0.b() == null) {
                String str2 = this.f15184b;
                if (str2 != null ? str2.equals(abstractC2968if0.a()) : abstractC2968if0.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15183a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f15184b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f15183a + ", appId=" + this.f15184b + "}";
    }
}
