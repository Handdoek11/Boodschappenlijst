package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4978n3 extends AbstractC4945j3 {
    C4978n3(C5009r3 c5009r3, String str, Long l8, boolean z7) {
        super(c5009r3, str, l8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC4945j3
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Long h(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
