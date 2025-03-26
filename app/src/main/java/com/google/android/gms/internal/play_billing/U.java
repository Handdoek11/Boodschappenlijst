package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class U extends W {

    /* renamed from: s, reason: collision with root package name */
    private static final U f29837s = new U();

    private U() {
        super("");
    }

    @Override // com.google.android.gms.internal.play_billing.W
    public final int a(W w7) {
        return w7 == this ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.play_billing.W
    final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((W) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.W
    final void f(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // com.google.android.gms.internal.play_billing.W
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
