package com.google.android.gms.internal.ads;

import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.Rg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1729Rg0 {
    static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
