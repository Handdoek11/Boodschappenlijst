package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.fH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2610fH0 implements InterfaceC2071aJ0, InterfaceC4240uG0 {

    /* renamed from: b, reason: collision with root package name */
    private final Uri f21981b;

    /* renamed from: c, reason: collision with root package name */
    private final Cu0 f21982c;

    /* renamed from: d, reason: collision with root package name */
    private final YG0 f21983d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4207u0 f21984e;

    /* renamed from: f, reason: collision with root package name */
    private final C4344vE f21985f;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f21987h;

    /* renamed from: j, reason: collision with root package name */
    private long f21989j;

    /* renamed from: l, reason: collision with root package name */
    private Y0 f21991l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21992m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ C3153kH0 f21993n;

    /* renamed from: g, reason: collision with root package name */
    private final O0 f21986g = new O0();

    /* renamed from: i, reason: collision with root package name */
    private boolean f21988i = true;

    /* renamed from: a, reason: collision with root package name */
    private final long f21980a = C4458wG0.a();

    /* renamed from: k, reason: collision with root package name */
    private C4393vk0 f21990k = i(0);

    public C2610fH0(C3153kH0 c3153kH0, Uri uri, InterfaceC1344Gh0 interfaceC1344Gh0, YG0 yg0, InterfaceC4207u0 interfaceC4207u0, C4344vE c4344vE) {
        this.f21993n = c3153kH0;
        this.f21981b = uri;
        this.f21982c = new Cu0(interfaceC1344Gh0);
        this.f21983d = yg0;
        this.f21984e = interfaceC4207u0;
        this.f21985f = c4344vE;
    }

    static /* bridge */ /* synthetic */ void h(C2610fH0 c2610fH0, long j8, long j9) {
        c2610fH0.f21986g.f17813a = j8;
        c2610fH0.f21989j = j9;
        c2610fH0.f21988i = true;
        c2610fH0.f21992m = false;
    }

    private final C4393vk0 i(long j8) {
        C4173tj0 c4173tj0 = new C4173tj0();
        c4173tj0.d(this.f21981b);
        c4173tj0.c(j8);
        c4173tj0.a(6);
        c4173tj0.b(C3153kH0.f23532e0);
        return c4173tj0.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4240uG0
    public final void c(UQ uq) {
        long max = !this.f21992m ? this.f21989j : Math.max(C3153kH0.S(this.f21993n, true), this.f21989j);
        int r8 = uq.r();
        Y0 y02 = this.f21991l;
        y02.getClass();
        y02.a(uq, r8);
        y02.b(max, 1, r8, 0, null);
        this.f21992m = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[LOOP:0: B:3:0x0004->B:136:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ec A[EDGE_INSN: B:137:0x01ec->B:95:0x01ec BREAK  A[LOOP:1: B:82:0x01a9->B:140:0x01a9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:16:0x003c, B:20:0x0047, B:23:0x005c, B:24:0x0062, B:32:0x0097, B:34:0x00a2, B:36:0x00ae, B:38:0x00b8, B:40:0x00c4, B:42:0x00ce, B:44:0x00da, B:46:0x00e4, B:48:0x00f6, B:50:0x0100, B:51:0x0106, B:59:0x0135, B:60:0x013c, B:62:0x0149, B:64:0x0151, B:66:0x016e, B:54:0x0110, B:57:0x0126, B:28:0x006e, B:31:0x0087), top: B:127:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:16:0x003c, B:20:0x0047, B:23:0x005c, B:24:0x0062, B:32:0x0097, B:34:0x00a2, B:36:0x00ae, B:38:0x00b8, B:40:0x00c4, B:42:0x00ce, B:44:0x00da, B:46:0x00e4, B:48:0x00f6, B:50:0x0100, B:51:0x0106, B:59:0x0135, B:60:0x013c, B:62:0x0149, B:64:0x0151, B:66:0x016e, B:54:0x0110, B:57:0x0126, B:28:0x006e, B:31:0x0087), top: B:127:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:16:0x003c, B:20:0x0047, B:23:0x005c, B:24:0x0062, B:32:0x0097, B:34:0x00a2, B:36:0x00ae, B:38:0x00b8, B:40:0x00c4, B:42:0x00ce, B:44:0x00da, B:46:0x00e4, B:48:0x00f6, B:50:0x0100, B:51:0x0106, B:59:0x0135, B:60:0x013c, B:62:0x0149, B:64:0x0151, B:66:0x016e, B:54:0x0110, B:57:0x0126, B:28:0x006e, B:31:0x0087), top: B:127:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:16:0x003c, B:20:0x0047, B:23:0x005c, B:24:0x0062, B:32:0x0097, B:34:0x00a2, B:36:0x00ae, B:38:0x00b8, B:40:0x00c4, B:42:0x00ce, B:44:0x00da, B:46:0x00e4, B:48:0x00f6, B:50:0x0100, B:51:0x0106, B:59:0x0135, B:60:0x013c, B:62:0x0149, B:64:0x0151, B:66:0x016e, B:54:0x0110, B:57:0x0126, B:28:0x006e, B:31:0x0087), top: B:127:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:16:0x003c, B:20:0x0047, B:23:0x005c, B:24:0x0062, B:32:0x0097, B:34:0x00a2, B:36:0x00ae, B:38:0x00b8, B:40:0x00c4, B:42:0x00ce, B:44:0x00da, B:46:0x00e4, B:48:0x00f6, B:50:0x0100, B:51:0x0106, B:59:0x0135, B:60:0x013c, B:62:0x0149, B:64:0x0151, B:66:0x016e, B:54:0x0110, B:57:0x0126, B:28:0x006e, B:31:0x0087), top: B:127:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:16:0x003c, B:20:0x0047, B:23:0x005c, B:24:0x0062, B:32:0x0097, B:34:0x00a2, B:36:0x00ae, B:38:0x00b8, B:40:0x00c4, B:42:0x00ce, B:44:0x00da, B:46:0x00e4, B:48:0x00f6, B:50:0x0100, B:51:0x0106, B:59:0x0135, B:60:0x013c, B:62:0x0149, B:64:0x0151, B:66:0x016e, B:54:0x0110, B:57:0x0126, B:28:0x006e, B:31:0x0087), top: B:127:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149 A[Catch: all -> 0x0043, TryCatch #6 {all -> 0x0043, blocks: (B:6:0x000b, B:16:0x003c, B:20:0x0047, B:23:0x005c, B:24:0x0062, B:32:0x0097, B:34:0x00a2, B:36:0x00ae, B:38:0x00b8, B:40:0x00c4, B:42:0x00ce, B:44:0x00da, B:46:0x00e4, B:48:0x00f6, B:50:0x0100, B:51:0x0106, B:59:0x0135, B:60:0x013c, B:62:0x0149, B:64:0x0151, B:66:0x016e, B:54:0x0110, B:57:0x0126, B:28:0x006e, B:31:0x0087), top: B:127:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189 A[Catch: all -> 0x018f, TryCatch #8 {all -> 0x018f, blocks: (B:68:0x017e, B:70:0x0189, B:73:0x0193, B:75:0x0197), top: B:131:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0197 A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #8 {all -> 0x018f, blocks: (B:68:0x017e, B:70:0x0189, B:73:0x0193, B:75:0x0197), top: B:131:0x017e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2071aJ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2610fH0.e():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2071aJ0
    public final void g() {
        this.f21987h = true;
    }
}
