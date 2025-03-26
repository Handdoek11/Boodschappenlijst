package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.eg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2535eg0 implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ CharSequence f21870o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ C2970ig0 f21871s;

    C2535eg0(C2970ig0 c2970ig0, CharSequence charSequence) {
        this.f21870o = charSequence;
        this.f21871s = c2970ig0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f21871s.g(this.f21870o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        AbstractC1483Kf0.b(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
