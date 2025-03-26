package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* renamed from: com.google.android.gms.internal.ads.ec0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC2527ec0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private C2636fc0 f21850a;

    /* renamed from: b, reason: collision with root package name */
    protected final C1964Yb0 f21851b;

    public AbstractAsyncTaskC2527ec0(C1964Yb0 c1964Yb0) {
        this.f21851b = c1964Yb0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        C2636fc0 c2636fc0 = this.f21850a;
        if (c2636fc0 != null) {
            c2636fc0.a(this);
        }
    }

    public final void b(C2636fc0 c2636fc0) {
        this.f21850a = c2636fc0;
    }
}
