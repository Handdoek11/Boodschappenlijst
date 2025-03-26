package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.rN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3923rN {
    public static Bundle a(Pair... pairArr) {
        Bundle bundle = new Bundle();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23931k2)).booleanValue()) {
            for (int i8 = 0; i8 < 2; i8++) {
                Pair pair = pairArr[i8];
                if (!TextUtils.isEmpty((CharSequence) pair.first) && ((Long) pair.second).longValue() > 0) {
                    bundle.putLong((String) pair.first, ((Long) pair.second).longValue());
                }
            }
        }
        return bundle;
    }
}
