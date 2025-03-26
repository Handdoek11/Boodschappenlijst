package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class C10 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14064a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f14065b;

    /* renamed from: c, reason: collision with root package name */
    private final L60 f14066c;

    /* renamed from: d, reason: collision with root package name */
    private final H2.a f14067d;

    C10(Context context, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, L60 l60, H2.a aVar) {
        this.f14064a = context;
        this.f14065b = interfaceExecutorServiceC3522nk0;
        this.f14066c = l60;
        this.f14067d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.D10 a() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10.a():com.google.android.gms.internal.ads.D10");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f14065b.p0(new Callable() { // from class: com.google.android.gms.internal.ads.B10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13717o.a();
            }
        });
    }
}
