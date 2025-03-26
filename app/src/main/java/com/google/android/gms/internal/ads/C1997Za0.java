package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Za0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1997Za0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3286lb0 f20500a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f20501b;

    /* renamed from: c, reason: collision with root package name */
    private final List f20502c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map f20503d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f20504e;

    /* renamed from: f, reason: collision with root package name */
    private final String f20505f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC2091ab0 f20506g;

    private C1997Za0(C3286lb0 c3286lb0, WebView webView, String str, List list, String str2, String str3, EnumC2091ab0 enumC2091ab0) {
        this.f20500a = c3286lb0;
        this.f20501b = webView;
        this.f20506g = enumC2091ab0;
        this.f20505f = str2;
        this.f20504e = str3;
    }

    public static C1997Za0 b(C3286lb0 c3286lb0, WebView webView, String str, String str2) {
        if (str2 != null) {
            AbstractC1789Tb0.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C1997Za0(c3286lb0, webView, null, null, str, str2, EnumC2091ab0.HTML);
    }

    public static C1997Za0 c(C3286lb0 c3286lb0, WebView webView, String str, String str2) {
        AbstractC1789Tb0.d("", 256, "CustomReferenceData is greater than 256 characters");
        return new C1997Za0(c3286lb0, webView, null, null, str, "", EnumC2091ab0.JAVASCRIPT);
    }

    public final WebView a() {
        return this.f20501b;
    }

    public final EnumC2091ab0 d() {
        return this.f20506g;
    }

    public final C3286lb0 e() {
        return this.f20500a;
    }

    public final String f() {
        return this.f20505f;
    }

    public final String g() {
        return this.f20504e;
    }

    public final List h() {
        return DesugarCollections.unmodifiableList(this.f20502c);
    }

    public final Map i() {
        return DesugarCollections.unmodifiableMap(this.f20503d);
    }
}
