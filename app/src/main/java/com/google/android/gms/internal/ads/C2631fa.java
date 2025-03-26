package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2631fa {

    /* renamed from: a, reason: collision with root package name */
    private List f22057a = Collections.emptyList();

    public final List a() {
        List list = this.f22057a;
        this.f22057a = Collections.emptyList();
        return list;
    }

    public final void b(List list) {
        this.f22057a = new ArrayList(list);
    }
}
