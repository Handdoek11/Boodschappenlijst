package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.Td0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1793Td0 extends AbstractC1548Md0 {

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC3296lg0 f19159o;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC3296lg0 f19160s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC1758Sd0 f19161t;

    /* renamed from: u, reason: collision with root package name */
    private HttpURLConnection f19162u;

    C1793Td0(InterfaceC3296lg0 interfaceC3296lg0, InterfaceC3296lg0 interfaceC3296lg02, InterfaceC1758Sd0 interfaceC1758Sd0) {
        this.f19159o = interfaceC3296lg0;
        this.f19160s = interfaceC3296lg02;
        this.f19161t = interfaceC1758Sd0;
    }

    static /* synthetic */ Integer e() {
        return -1;
    }

    static /* synthetic */ Integer f() {
        return -1;
    }

    public static void k(HttpURLConnection httpURLConnection) {
        AbstractC1583Nd0.a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k(this.f19162u);
    }

    public HttpURLConnection i() {
        AbstractC1583Nd0.b(((Integer) this.f19159o.zza()).intValue(), ((Integer) this.f19160s.zza()).intValue());
        InterfaceC1758Sd0 interfaceC1758Sd0 = this.f19161t;
        interfaceC1758Sd0.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) interfaceC1758Sd0.zza();
        this.f19162u = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection j(InterfaceC1758Sd0 interfaceC1758Sd0, final int i8, final int i9) {
        this.f19159o = new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.Qd0
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                return Integer.valueOf(i8);
            }
        };
        this.f19160s = new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.Rd0
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                return Integer.valueOf(i9);
            }
        };
        this.f19161t = interfaceC1758Sd0;
        return i();
    }

    C1793Td0() {
        this(new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.Od0
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                return C1793Td0.e();
            }
        }, new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.Pd0
            @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
            public final Object zza() {
                return C1793Td0.f();
            }
        }, null);
    }
}
