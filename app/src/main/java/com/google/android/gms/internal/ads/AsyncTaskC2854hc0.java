package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC2854hc0 extends AbstractAsyncTaskC2419dc0 {
    public AsyncTaskC2854hc0(C1964Yb0 c1964Yb0, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(c1964Yb0, hashSet, jSONObject, j8);
    }

    private final void c(String str) {
        C4048sb0 a8 = C4048sb0.a();
        if (a8 != null) {
            for (C2200bb0 c2200bb0 : a8.c()) {
                if (this.f21618c.contains(c2200bb0.h())) {
                    c2200bb0.g().d(str, this.f21620e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC2527ec0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f21619d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC2527ec0, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
