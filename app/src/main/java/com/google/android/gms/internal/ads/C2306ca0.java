package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import f3.InterfaceC5781e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ca0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2306ca0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4040sV f21223a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21224b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21225c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21226d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f21227e;

    /* renamed from: f, reason: collision with root package name */
    private final D60 f21228f;

    /* renamed from: g, reason: collision with root package name */
    private final E60 f21229g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5781e f21230h;

    /* renamed from: i, reason: collision with root package name */
    private final N9 f21231i;

    public C2306ca0(C4040sV c4040sV, H2.a aVar, String str, String str2, Context context, D60 d60, E60 e60, InterfaceC5781e interfaceC5781e, N9 n9) {
        this.f21223a = c4040sV;
        this.f21224b = aVar.f2914o;
        this.f21225c = str;
        this.f21226d = str2;
        this.f21227e = context;
        this.f21228f = d60;
        this.f21229g = e60;
        this.f21230h = interfaceC5781e;
        this.f21231i = n9;
    }

    public static final List f(int i8, int i9, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_mpe@", "2." + i9));
        }
        return arrayList;
    }

    public static final List g(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List h(List list, long j8) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((String) it.next(), "@gw_ttr@", Long.toString(j8, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(String str) {
        return TextUtils.isEmpty(str) ? "" : H2.m.k() ? "fakeForAdDebugLog" : str;
    }

    private static String j(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List c(C60 c60, C3785q60 c3785q60, List list) {
        return d(c60, c3785q60, false, "", "", list);
    }

    public final List d(C60 c60, C3785q60 c3785q60, boolean z7, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z8 = true;
            String j8 = j(j(j((String) it.next(), "@gw_adlocid@", c60.f14100a.f28044a.f16768f), "@gw_adnetrefresh@", true != z7 ? "0" : "1"), "@gw_sdkver@", this.f21224b);
            if (c3785q60 != null) {
                j8 = AbstractC2020Zp.c(j(j(j(j8, "@gw_qdata@", c3785q60.f25826y), "@gw_adnetid@", c3785q60.f25824x), "@gw_allocid@", c3785q60.f25822w), this.f21227e, c3785q60.f25774W, c3785q60.f25823w0);
            }
            String j9 = j(j(j(j(j8, "@gw_adnetstatus@", this.f21223a.g()), "@gw_ttr@", Long.toString(this.f21223a.a(), 10)), "@gw_seqnum@", this.f21225c), "@gw_sessid@", this.f21226d);
            boolean z9 = false;
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23666E3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z9 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z10 = !isEmpty;
            if (z9) {
                z8 = z10;
            } else {
                if (!isEmpty) {
                }
                arrayList.add(j9);
            }
            if (this.f21231i.f(Uri.parse(j9))) {
                Uri.Builder buildUpon = Uri.parse(j9).buildUpon();
                if (z9) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z8) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                j9 = buildUpon.build().toString();
            }
            arrayList.add(j9);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[LOOP:0: B:13:0x0060->B:15:0x0066, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List e(com.google.android.gms.internal.ads.C3785q60 r11, java.util.List r12, com.google.android.gms.internal.ads.InterfaceC1460Jo r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            f3.e r1 = r10.f21230h
            long r1 = r1.a()
            java.lang.String r3 = r13.a()     // Catch: android.os.RemoteException -> Lb1
            int r13 = r13.zzb()     // Catch: android.os.RemoteException -> Lb1
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb1
            com.google.android.gms.internal.ads.bf r4 = com.google.android.gms.internal.ads.AbstractC3184kf.f23674F3
            com.google.android.gms.internal.ads.if r5 = D2.A.c()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.E60 r4 = r10.f21229g
            if (r4 != 0) goto L32
            com.google.android.gms.internal.ads.Qf0 r4 = com.google.android.gms.internal.ads.AbstractC1692Qf0.c()
            goto L3c
        L32:
            com.google.android.gms.internal.ads.D60 r4 = r4.f14643a
        L34:
            com.google.android.gms.internal.ads.Qf0 r4 = com.google.android.gms.internal.ads.AbstractC1692Qf0.d(r4)
            goto L3c
        L39:
            com.google.android.gms.internal.ads.D60 r4 = r10.f21228f
            goto L34
        L3c:
            com.google.android.gms.internal.ads.aa0 r5 = new com.google.android.gms.internal.ads.aa0
            r5.<init>()
            com.google.android.gms.internal.ads.Qf0 r5 = r4.a(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.b(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.ba0 r7 = new com.google.android.gms.internal.ads.ba0
            r7.<init>()
            com.google.android.gms.internal.ads.Qf0 r4 = r4.a(r7)
            java.lang.Object r4 = r4.b(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L60:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Lb0
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = j(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = j(r6, r7, r13)
            java.lang.String r7 = r10.f21224b
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = j(r6, r8, r7)
            android.content.Context r7 = r10.f21227e
            boolean r8 = r11.f25774W
            java.util.Map r9 = r11.f25823w0
            java.lang.String r6 = com.google.android.gms.internal.ads.AbstractC2020Zp.c(r6, r7, r8, r9)
            r0.add(r6)
            goto L60
        Lb0:
            return r0
        Lb1:
            r11 = move-exception
            java.lang.String r12 = "Unable to determine award type and amount."
            H2.p.e(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2306ca0.e(com.google.android.gms.internal.ads.q60, java.util.List, com.google.android.gms.internal.ads.Jo):java.util.List");
    }
}
