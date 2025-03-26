package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC3070jc0 extends AbstractAsyncTaskC2419dc0 {
    public AsyncTaskC3070jc0(C1964Yb0 c1964Yb0, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(c1964Yb0, hashSet, jSONObject, j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC2527ec0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C4048sb0 a8;
        if (!TextUtils.isEmpty(str) && (a8 = C4048sb0.a()) != null) {
            for (C2200bb0 c2200bb0 : a8.c()) {
                if (this.f21618c.contains(c2200bb0.h())) {
                    c2200bb0.g().h(str, this.f21620e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (AbstractC1649Pb0.g(this.f21619d, this.f21851b.a())) {
            return null;
        }
        this.f21851b.e(this.f21619d);
        return this.f21619d.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractAsyncTaskC2527ec0, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
