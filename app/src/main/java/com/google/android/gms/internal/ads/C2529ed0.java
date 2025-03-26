package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.adadapted.android.sdk.constants.Config;
import com.adadapted.android.sdk.core.ad.AdActionType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ed0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2529ed0 implements InterfaceC4268uc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21852a;

    /* renamed from: b, reason: collision with root package name */
    private final C2638fd0 f21853b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3726pd0 f21854c;

    /* renamed from: d, reason: collision with root package name */
    private final C3941rc0 f21855d;

    C2529ed0(Object obj, C2638fd0 c2638fd0, InterfaceC3726pd0 interfaceC3726pd0, C3941rc0 c3941rc0) {
        this.f21852a = obj;
        this.f21853b = c2638fd0;
        this.f21854c = interfaceC3726pd0;
        this.f21855d = c3941rc0;
    }

    private static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        T8 b02 = U8.b0();
        b02.E(5);
        b02.C(AbstractC3542nu0.H(bArr, 0, bArr.length));
        return Base64.encodeToString(((U8) b02.x()).m(), 11);
    }

    private final synchronized byte[] j(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e8) {
            this.f21855d.c(2007, System.currentTimeMillis() - currentTimeMillis, e8);
            return null;
        }
        return (byte[]) this.f21852a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f21852a, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4268uc0
    public final synchronized String a(Context context, String str) {
        Map zzb;
        zzb = this.f21854c.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put(Config.AD_ID_PARAM, null);
        return i(j(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4268uc0
    public final synchronized void b(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put(Config.AD_ID_PARAM, null);
            hashMap.put("evt", motionEvent);
            this.f21852a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f21852a, hashMap);
            this.f21855d.d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e8) {
            throw new zzfpf(2005, e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4268uc0
    public final synchronized String c(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.f21854c.zza();
        zza.put("f", AdActionType.CONTENT);
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put(Config.AD_ID_PARAM, null);
        zza.put("view", view);
        zza.put("act", activity);
        return i(j(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4268uc0
    public final synchronized String d(Context context, String str, View view, Activity activity) {
        Map a8;
        a8 = this.f21854c.a();
        a8.put("f", "v");
        a8.put("ctx", context);
        a8.put(Config.AD_ID_PARAM, null);
        a8.put("view", view);
        a8.put("act", activity);
        return i(j(null, a8));
    }

    public final synchronized int e() {
        try {
        } catch (Exception e8) {
            throw new zzfpf(2006, e8);
        }
        return ((Integer) this.f21852a.getClass().getDeclaredMethod("lcs", null).invoke(this.f21852a, null)).intValue();
    }

    final C2638fd0 f() {
        return this.f21853b;
    }

    public final synchronized void g() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f21852a.getClass().getDeclaredMethod("close", null).invoke(this.f21852a, null);
            this.f21855d.d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e8) {
            throw new zzfpf(2003, e8);
        }
    }

    final synchronized boolean h() {
        try {
        } catch (Exception e8) {
            throw new zzfpf(2001, e8);
        }
        return ((Boolean) this.f21852a.getClass().getDeclaredMethod("init", null).invoke(this.f21852a, null)).booleanValue();
    }
}
