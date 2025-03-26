package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4504wl0 implements InterfaceC1344Gh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27541a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27542b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1344Gh0 f27543c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1344Gh0 f27544d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC1344Gh0 f27545e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC1344Gh0 f27546f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC1344Gh0 f27547g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC1344Gh0 f27548h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC1344Gh0 f27549i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC1344Gh0 f27550j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC1344Gh0 f27551k;

    public C4504wl0(Context context, InterfaceC1344Gh0 interfaceC1344Gh0) {
        this.f27541a = context.getApplicationContext();
        this.f27543c = interfaceC1344Gh0;
    }

    private final InterfaceC1344Gh0 g() {
        if (this.f27545e == null) {
            C1408Id0 c1408Id0 = new C1408Id0(this.f27541a);
            this.f27545e = c1408Id0;
            i(c1408Id0);
        }
        return this.f27545e;
    }

    private final void i(InterfaceC1344Gh0 interfaceC1344Gh0) {
        for (int i8 = 0; i8 < this.f27542b.size(); i8++) {
            interfaceC1344Gh0.f((Wu0) this.f27542b.get(i8));
        }
    }

    private static final void j(InterfaceC1344Gh0 interfaceC1344Gh0, Wu0 wu0) {
        if (interfaceC1344Gh0 != null) {
            interfaceC1344Gh0.f(wu0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        InterfaceC1344Gh0 interfaceC1344Gh0 = this.f27551k;
        interfaceC1344Gh0.getClass();
        return interfaceC1344Gh0.C(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        InterfaceC1344Gh0 interfaceC1344Gh0 = this.f27551k;
        if (interfaceC1344Gh0 == null) {
            return null;
        }
        return interfaceC1344Gh0.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0, com.google.android.gms.internal.ads.Ds0
    public final Map b() {
        InterfaceC1344Gh0 interfaceC1344Gh0 = this.f27551k;
        return interfaceC1344Gh0 == null ? Collections.emptyMap() : interfaceC1344Gh0.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        InterfaceC1344Gh0 interfaceC1344Gh0 = this.f27551k;
        if (interfaceC1344Gh0 != null) {
            try {
                interfaceC1344Gh0.d();
            } finally {
                this.f27551k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        InterfaceC1344Gh0 interfaceC1344Gh0;
        AbstractC3796qC.f(this.f27551k == null);
        String scheme = c4393vk0.f27331a.getScheme();
        Uri uri = c4393vk0.f27331a;
        int i8 = AbstractC2301cW.f21206a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = c4393vk0.f27331a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f27544d == null) {
                    Cp0 cp0 = new Cp0();
                    this.f27544d = cp0;
                    i(cp0);
                }
                this.f27551k = this.f27544d;
            } else {
                this.f27551k = g();
            }
        } else if ("asset".equals(scheme)) {
            this.f27551k = g();
        } else if ("content".equals(scheme)) {
            if (this.f27546f == null) {
                C2644fg0 c2644fg0 = new C2644fg0(this.f27541a);
                this.f27546f = c2644fg0;
                i(c2644fg0);
            }
            this.f27551k = this.f27546f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f27547g == null) {
                try {
                    InterfaceC1344Gh0 interfaceC1344Gh02 = (InterfaceC1344Gh0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.f27547g = interfaceC1344Gh02;
                    i(interfaceC1344Gh02);
                } catch (ClassNotFoundException unused) {
                    HL.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating RTMP extension", e8);
                }
                if (this.f27547g == null) {
                    this.f27547g = this.f27543c;
                }
            }
            this.f27551k = this.f27547g;
        } else if ("udp".equals(scheme)) {
            if (this.f27548h == null) {
                Mv0 mv0 = new Mv0(2000);
                this.f27548h = mv0;
                i(mv0);
            }
            this.f27551k = this.f27548h;
        } else if ("data".equals(scheme)) {
            if (this.f27549i == null) {
                C1270Eg0 c1270Eg0 = new C1270Eg0();
                this.f27549i = c1270Eg0;
                i(c1270Eg0);
            }
            this.f27551k = this.f27549i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f27550j == null) {
                    C2454du0 c2454du0 = new C2454du0(this.f27541a);
                    this.f27550j = c2454du0;
                    i(c2454du0);
                }
                interfaceC1344Gh0 = this.f27550j;
            } else {
                interfaceC1344Gh0 = this.f27543c;
            }
            this.f27551k = interfaceC1344Gh0;
        }
        return this.f27551k.e(c4393vk0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void f(Wu0 wu0) {
        wu0.getClass();
        this.f27543c.f(wu0);
        this.f27542b.add(wu0);
        j(this.f27544d, wu0);
        j(this.f27545e, wu0);
        j(this.f27546f, wu0);
        j(this.f27547g, wu0);
        j(this.f27548h, wu0);
        j(this.f27549i, wu0);
        j(this.f27550j, wu0);
    }
}
