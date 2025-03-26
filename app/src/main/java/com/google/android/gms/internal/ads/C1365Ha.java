package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.Ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365Ha extends AbstractCallableC2524eb {
    public C1365Ha(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9) {
        super(c3610oa, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", c2918i8, i8, 24);
    }

    private final void c() {
        AdvertisingIdClient h8 = this.f21837o.h();
        if (h8 == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = h8.getInfo();
            String id = info.getId();
            int i8 = AbstractC3936ra.f26195b;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID fromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.putLong(fromString.getMostSignificantBits());
                wrap.putLong(fromString.getLeastSignificantBits());
                id = Y8.a(bArr, true);
            }
            if (id != null) {
                synchronized (this.f21840u) {
                    this.f21840u.B0(id);
                    this.f21840u.A0(info.isLimitAdTrackingEnabled());
                    this.f21840u.e0(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        if (this.f21837o.q()) {
            c();
            return;
        }
        synchronized (this.f21840u) {
            this.f21840u.B0((String) this.f21841v.invoke(null, this.f21837o.b()));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    public final Void b() {
        if (this.f21837o.r()) {
            super.b();
            return null;
        }
        if (this.f21837o.q()) {
            c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
