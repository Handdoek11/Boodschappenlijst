package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class L0 {
    static int a(Set set) {
        Iterator it = set.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i8 += next != null ? next.hashCode() : 0;
        }
        return i8;
    }
}
