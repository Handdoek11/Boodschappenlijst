package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    private String f15032a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f15033b;

    /* renamed from: c, reason: collision with root package name */
    private final C2688g2 f15034c = new C2688g2();

    /* renamed from: d, reason: collision with root package name */
    private final List f15035d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC4169th0 f15036e;

    /* renamed from: f, reason: collision with root package name */
    private final C3017j4 f15037f;

    /* renamed from: g, reason: collision with root package name */
    private final C3348m6 f15038g;

    public F1() {
        AbstractC4169th0.w();
        this.f15035d = Collections.emptyList();
        this.f15036e = AbstractC4169th0.w();
        this.f15037f = new C3017j4();
        this.f15038g = C3348m6.f24454d;
    }

    public final F1 a(String str) {
        this.f15032a = str;
        return this;
    }

    public final F1 b(Uri uri) {
        this.f15033b = uri;
        return this;
    }

    public final E7 c() {
        C3128k5 c3128k5;
        Uri uri = this.f15033b;
        if (uri != null) {
            c3128k5 = new C3128k5(uri, null, null, null, this.f15035d, null, this.f15036e, null, -9223372036854775807L, null);
        } else {
            c3128k5 = null;
        }
        String str = this.f15032a;
        if (str == null) {
            str = "";
        }
        return new E7(str, new C2799h3(this.f15034c, null), c3128k5, new J4(this.f15037f, null), M9.f17264z, this.f15038g, null);
    }
}
