package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class V extends W {

    /* renamed from: s, reason: collision with root package name */
    private static final V f29842s = new V();

    private V() {
        super("");
    }

    @Override // com.google.android.gms.internal.play_billing.W
    public final int a(W w7) {
        return w7 == this ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.play_billing.W
    final void c(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((W) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.W
    final void f(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.play_billing.W
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
