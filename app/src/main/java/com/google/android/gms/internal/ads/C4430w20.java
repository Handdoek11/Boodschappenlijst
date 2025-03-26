package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.w20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4430w20 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f27428a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f27429b;

    public C4430w20(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context) {
        this.f27428a = interfaceExecutorServiceC3522nk0;
        this.f27429b = context;
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ com.google.android.gms.internal.ads.C4103t20 a() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4430w20.a():com.google.android.gms.internal.ads.t20");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f27428a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.u20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f26989o.a();
            }
        });
    }
}
