package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.nD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3472nD0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f24902a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f24903b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3799qD0 f24904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3472nD0(C3799qD0 c3799qD0, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f24904c = c3799qD0;
        this.f24902a = contentResolver;
        this.f24903b = uri;
    }

    public final void a() {
        this.f24902a.registerContentObserver(this.f24903b, false, this);
    }

    public final void b() {
        this.f24902a.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        C3799qD0 c3799qD0 = this.f24904c;
        this.f24904c.j(C3254lD0.c(c3799qD0.f25871a, c3799qD0.f25878h, c3799qD0.f25877g));
    }
}
