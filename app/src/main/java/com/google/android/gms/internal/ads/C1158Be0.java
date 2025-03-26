package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Be0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1158Be0 extends AbstractC2642ff0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f13827a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13828b;

    /* synthetic */ C1158Be0(int i8, String str, AbstractC1122Ae0 abstractC1122Ae0) {
        this.f13827a = i8;
        this.f13828b = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2642ff0
    public final int a() {
        return this.f13827a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2642ff0
    public final String b() {
        return this.f13828b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2642ff0) {
            AbstractC2642ff0 abstractC2642ff0 = (AbstractC2642ff0) obj;
            if (this.f13827a == abstractC2642ff0.a() && ((str = this.f13828b) != null ? str.equals(abstractC2642ff0.b()) : abstractC2642ff0.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13828b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f13827a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.f13827a + ", sessionToken=" + this.f13828b + "}";
    }
}
