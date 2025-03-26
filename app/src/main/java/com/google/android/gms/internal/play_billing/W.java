package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes2.dex */
abstract class W implements Comparable, Serializable {

    /* renamed from: o, reason: collision with root package name */
    final Comparable f29849o = "";

    W(Comparable comparable) {
    }

    public abstract int a(W w7);

    abstract void c(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof W) {
            try {
                if (a((W) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    abstract void f(StringBuilder sb);

    public abstract int hashCode();
}
