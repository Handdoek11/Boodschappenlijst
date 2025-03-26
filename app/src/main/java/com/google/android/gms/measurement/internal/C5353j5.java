package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import f3.InterfaceC5781e;
import j$.util.Objects;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5353j5 extends E5 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f31017d;

    /* renamed from: e, reason: collision with root package name */
    public final A2 f31018e;

    /* renamed from: f, reason: collision with root package name */
    public final A2 f31019f;

    /* renamed from: g, reason: collision with root package name */
    public final A2 f31020g;

    /* renamed from: h, reason: collision with root package name */
    public final A2 f31021h;

    /* renamed from: i, reason: collision with root package name */
    public final A2 f31022i;

    /* renamed from: j, reason: collision with root package name */
    public final A2 f31023j;

    C5353j5(H5 h52) {
        super(h52);
        this.f31017d = new HashMap();
        C5461z2 f8 = f();
        Objects.requireNonNull(f8);
        this.f31018e = new A2(f8, "last_delete_stale", 0L);
        C5461z2 f9 = f();
        Objects.requireNonNull(f9);
        this.f31019f = new A2(f9, "last_delete_stale_batch", 0L);
        C5461z2 f10 = f();
        Objects.requireNonNull(f10);
        this.f31020g = new A2(f10, "backoff", 0L);
        C5461z2 f11 = f();
        Objects.requireNonNull(f11);
        this.f31021h = new A2(f11, "last_upload", 0L);
        C5461z2 f12 = f();
        Objects.requireNonNull(f12);
        this.f31022i = new A2(f12, "last_upload_attempt", 0L);
        C5461z2 f13 = f();
        Objects.requireNonNull(f13);
        this.f31023j = new A2(f13, "midnight_offset", 0L);
    }

    private final Pair w(String str) {
        C5346i5 c5346i5;
        AdvertisingIdClient.Info info;
        l();
        long b8 = zzb().b();
        C5346i5 c5346i52 = (C5346i5) this.f31017d.get(str);
        if (c5346i52 != null && b8 < c5346i52.f30997c) {
            return new Pair(c5346i52.f30995a, Boolean.valueOf(c5346i52.f30996b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long A7 = a().A(str) + b8;
        try {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            } catch (PackageManager.NameNotFoundException unused) {
                if (c5346i52 != null && b8 < c5346i52.f30997c + a().y(str, G.f30428c)) {
                    return new Pair(c5346i52.f30995a, Boolean.valueOf(c5346i52.f30996b));
                }
                info = null;
            }
        } catch (Exception e8) {
            h().D().b("Unable to get advertising id", e8);
            c5346i5 = new C5346i5("", false, A7);
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = info.getId();
        c5346i5 = id != null ? new C5346i5(id, info.isLimitAdTrackingEnabled(), A7) : new C5346i5("", info.isLimitAdTrackingEnabled(), A7);
        this.f31017d.put(str, c5346i5);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(c5346i5.f30995a, Boolean.valueOf(c5346i5.f30996b));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5354k o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5353j5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    final Pair x(String str, A3 a32) {
        return a32.y() ? w(str) : new Pair("", Boolean.FALSE);
    }

    final String y(String str, boolean z7) {
        l();
        String str2 = z7 ? (String) w(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest T02 = d6.T0();
        if (T02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, T02.digest(str2.getBytes())));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
