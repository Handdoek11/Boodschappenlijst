package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2792h implements InterfaceC4390vj {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1741Rq f22466a;

    public C2792h(InterfaceC1741Rq interfaceC1741Rq) {
        this.f22466a = interfaceC1741Rq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4390vj
    public final InterfaceC1909Wj a(Context context, Pz0 pz0, InterfaceC3903rB0 interfaceC3903rB0, InterfaceC1847Ur interfaceC1847Ur, Executor executor, List list, long j8) {
        try {
            try {
                ((InterfaceC4390vj) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC1741Rq.class).newInstance(this.f22466a)).a(context, pz0, interfaceC3903rB0, interfaceC1847Ur, executor, list, 0L);
                return null;
            } catch (Exception e8) {
                e = e8;
                if (e instanceof zzbz) {
                    throw ((zzbz) e);
                }
                throw new zzbz(e, -9223372036854775807L);
            }
        } catch (Exception e9) {
            e = e9;
        }
    }
}
