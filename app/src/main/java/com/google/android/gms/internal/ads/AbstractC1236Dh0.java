package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Dh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1236Dh0 {
    static Object a(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void b(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean c(Collection collection, Iterator it) {
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= collection.add(it.next());
        }
        return z7;
    }
}
