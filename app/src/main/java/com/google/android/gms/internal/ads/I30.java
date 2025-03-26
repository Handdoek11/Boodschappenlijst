package com.google.android.gms.internal.ads;

import D2.C0555y;
import G2.AbstractC0608p0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class I30 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f15851a;

    public I30(Map map) {
        this.f15851a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", C0555y.b().n(this.f15851a));
        } catch (JSONException e8) {
            AbstractC0608p0.k("Could not encode video decoder properties: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
