package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.p3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4994p3 extends AbstractC4945j3 {
    C4994p3(C5009r3 c5009r3, String str, Double d8, boolean z7) {
        super(c5009r3, str, d8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.AbstractC4945j3
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Double h(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
