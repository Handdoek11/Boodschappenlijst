package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Fs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1321Fs {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f15216a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private long f15217b;

    C1321Fs() {
    }

    final long a() {
        Iterator it = this.f15216a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Bo0) it.next()).b().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f15217b = Math.max(this.f15217b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f15217b;
    }

    final void b(Bo0 bo0) {
        this.f15216a.add(bo0);
    }
}
