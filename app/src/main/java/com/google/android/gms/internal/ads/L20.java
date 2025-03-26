package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class L20 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16739a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f16740b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f16741c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16742d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f16743e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16744f;

    /* renamed from: g, reason: collision with root package name */
    private final C4077sq f16745g;

    L20(C4077sq c4077sq, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i8, boolean z7, boolean z8) {
        this.f16745g = c4077sq;
        this.f16739a = context;
        this.f16740b = scheduledExecutorService;
        this.f16741c = executor;
        this.f16742d = i8;
        this.f16743e = z7;
        this.f16744f = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.M20 a(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.de0 r0 = new com.google.android.gms.internal.ads.de0
            r0.<init>()
            boolean r1 = r7.f16743e
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.f23923j3
            com.google.android.gms.internal.ads.if r2 = D2.A.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.f16743e
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.AbstractC3184kf.f23932k3
            com.google.android.gms.internal.ads.if r2 = D2.A.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.f16739a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.he0 r1 = com.google.android.gms.internal.ads.C2858he0.k(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            j$.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.getId()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            j$.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.f16739a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.AbstractC3184kf.f23977p3     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.if r4 = D2.A.c()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.f16744f     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.de0 r0 = r1.j(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.Bq r2 = C2.v.s()
            r2.x(r0, r1)
            com.google.android.gms.internal.ads.de0 r0 = new com.google.android.gms.internal.ads.de0
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.M20 r1 = new com.google.android.gms.internal.ads.M20
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L20.a(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.M20");
    }

    final /* synthetic */ M20 b(Throwable th) {
        C0555y.b();
        ContentResolver contentResolver = this.f16739a.getContentResolver();
        return new M20(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new C2423de0());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return (Sj0) AbstractC2326ck0.e((Sj0) AbstractC2326ck0.o((Sj0) AbstractC2326ck0.m(Sj0.D(this.f16745g.a(this.f16739a, this.f16742d)), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.J20
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return this.f16092a.a((AdvertisingIdClient.Info) obj);
            }
        }, this.f16741c), ((Long) D2.A.c().a(AbstractC3184kf.f23876e1)).longValue(), TimeUnit.MILLISECONDS, this.f16740b), Throwable.class, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.K20
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return this.f16506a.b((Throwable) obj);
            }
        }, this.f16741c);
    }
}
