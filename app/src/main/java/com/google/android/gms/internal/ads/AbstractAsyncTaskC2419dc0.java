package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractAsyncTaskC2419dc0 extends AbstractAsyncTaskC2527ec0 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet f21618c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f21619d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f21620e;

    public AbstractAsyncTaskC2419dc0(C1964Yb0 c1964Yb0, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(c1964Yb0);
        this.f21618c = new HashSet(hashSet);
        this.f21619d = jSONObject;
        this.f21620e = j8;
    }
}
