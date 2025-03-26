package com.google.android.gms.internal.measurement;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5002q3 extends AbstractC4945j3 {
    C5002q3(C5009r3 c5009r3, String str, Boolean bool, boolean z7) {
        super(c5009r3, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4945j3
    final /* synthetic */ Object h(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (I2.f28892c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (I2.f28893d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
