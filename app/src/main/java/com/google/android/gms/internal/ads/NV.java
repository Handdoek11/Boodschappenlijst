package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NV implements InterfaceC4692yT {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17542a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C4358vM f17543b;

    public NV(C4358vM c4358vM) {
        this.f17543b = c4358vM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4692yT
    public final C4801zT a(String str, JSONObject jSONObject) {
        C4801zT c4801zT;
        synchronized (this) {
            try {
                c4801zT = (C4801zT) this.f17542a.get(str);
                if (c4801zT == null) {
                    c4801zT = new C4801zT(this.f17543b.c(str, jSONObject), new BinderC4257uU(), str);
                    this.f17542a.put(str, c4801zT);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4801zT;
    }
}
