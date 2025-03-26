package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ve0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4381ve0 extends AbstractC1374He0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f27314a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27315b;

    /* synthetic */ C4381ve0(String str, String str2, AbstractC4272ue0 abstractC4272ue0) {
        this.f27314a = str;
        this.f27315b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1374He0
    public final String a() {
        return this.f27315b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1374He0
    public final String b() {
        return this.f27314a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1374He0) {
            AbstractC1374He0 abstractC1374He0 = (AbstractC1374He0) obj;
            String str = this.f27314a;
            if (str != null ? str.equals(abstractC1374He0.b()) : abstractC1374He0.b() == null) {
                String str2 = this.f27315b;
                if (str2 != null ? str2.equals(abstractC1374He0.a()) : abstractC1374He0.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27314a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f27315b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f27314a + ", appId=" + this.f27315b + "}";
    }
}
