package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5223z implements C0 {
    AbstractC5223z() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0) {
            return a().equals(((C0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
