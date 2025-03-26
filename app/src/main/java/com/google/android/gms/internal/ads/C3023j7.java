package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3023j7 {

    /* renamed from: a, reason: collision with root package name */
    long f23185a;

    /* renamed from: b, reason: collision with root package name */
    final String f23186b;

    /* renamed from: c, reason: collision with root package name */
    final String f23187c;

    /* renamed from: d, reason: collision with root package name */
    final long f23188d;

    /* renamed from: e, reason: collision with root package name */
    final long f23189e;

    /* renamed from: f, reason: collision with root package name */
    final long f23190f;

    /* renamed from: g, reason: collision with root package name */
    final long f23191g;

    /* renamed from: h, reason: collision with root package name */
    final List f23192h;

    /* JADX WARN: Illegal instructions before constructor call */
    C3023j7(String str, G6 g62) {
        String str2 = g62.f15268b;
        long j8 = g62.f15269c;
        long j9 = g62.f15270d;
        long j10 = g62.f15271e;
        long j11 = g62.f15272f;
        List list = g62.f15274h;
        if (list == null) {
            Map map = g62.f15273g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new O6((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j8, j9, j10, j11, list);
    }

    static C3023j7 a(C3132k7 c3132k7) {
        if (C3350m7.c(c3132k7) != 538247942) {
            throw new IOException();
        }
        String f8 = C3350m7.f(c3132k7);
        String f9 = C3350m7.f(c3132k7);
        long d8 = C3350m7.d(c3132k7);
        long d9 = C3350m7.d(c3132k7);
        long d10 = C3350m7.d(c3132k7);
        long d11 = C3350m7.d(c3132k7);
        int c8 = C3350m7.c(c3132k7);
        if (c8 < 0) {
            throw new IOException("readHeaderList size=" + c8);
        }
        List emptyList = c8 == 0 ? Collections.emptyList() : new ArrayList();
        for (int i8 = 0; i8 < c8; i8++) {
            emptyList.add(new O6(C3350m7.f(c3132k7).intern(), C3350m7.f(c3132k7).intern()));
        }
        return new C3023j7(f8, f9, d8, d9, d10, d11, emptyList);
    }

    private C3023j7(String str, String str2, long j8, long j9, long j10, long j11, List list) {
        this.f23186b = str;
        this.f23187c = true == "".equals(str2) ? null : str2;
        this.f23188d = j8;
        this.f23189e = j9;
        this.f23190f = j10;
        this.f23191g = j11;
        this.f23192h = list;
    }
}
