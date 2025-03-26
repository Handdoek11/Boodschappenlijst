package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2219bl {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f20924a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC1980Yk f20925b = new C2110al();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC1875Vk f20926c = new InterfaceC1875Vk() { // from class: com.google.android.gms.internal.ads.Zk
        @Override // com.google.android.gms.internal.ads.InterfaceC1875Vk
        public final Object a(JSONObject jSONObject) {
            return AbstractC2219bl.a(jSONObject);
        }
    };

    static /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f20924a));
    }
}
