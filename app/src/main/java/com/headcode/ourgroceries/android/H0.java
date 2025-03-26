package com.headcode.ourgroceries.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import o0.AbstractC6278a;
import t5.AbstractC6803e;

/* loaded from: classes2.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f33476a;

    /* renamed from: b, reason: collision with root package name */
    private final C5587k6 f33477b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageManager f33478c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33479d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33481f = false;

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f33482g = new a();

    /* renamed from: e, reason: collision with root package name */
    private final Executor f33480e = Executors.newSingleThreadExecutor();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Uri data = intent.getData();
            if (data != null && "package".equals(data.getScheme()) && AbstractC6803e.w(data.getSchemeSpecificPart()).equals("com.headcode.ourgroceries.key")) {
                H0.this.e();
            }
        }
    }

    public H0(Context context, C5587k6 c5587k6) {
        this.f33476a = context;
        this.f33477b = c5587k6;
        this.f33478c = context.getPackageManager();
        this.f33479d = context.getPackageName();
        g();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        boolean f8 = f(this.f33478c, this.f33479d);
        StringBuilder sb = new StringBuilder();
        sb.append("keyCheck2");
        sb.append(f8 ? "SignatureMatch" : "SignatureNoMatch");
        AbstractC5673x.a(sb.toString());
        this.f33477b.r0(f8);
    }

    private boolean f(PackageManager packageManager, String str) {
        return this.f33481f || packageManager.checkSignatures(str, "com.headcode.ourgroceries.key") == 0;
    }

    private void g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        AbstractC6278a.k(this.f33476a, this.f33482g, intentFilter, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(boolean z7) {
        this.f33477b.r0(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        final boolean f8 = f(this.f33478c, this.f33479d);
        OurApplication.j().post(new Runnable() { // from class: com.headcode.ourgroceries.android.G0
            @Override // java.lang.Runnable
            public final void run() {
                this.f33451o.h(f8);
            }
        });
    }

    public void d() {
        this.f33480e.execute(new Runnable() { // from class: com.headcode.ourgroceries.android.F0
            @Override // java.lang.Runnable
            public final void run() {
                this.f33440o.i();
            }
        });
    }
}
