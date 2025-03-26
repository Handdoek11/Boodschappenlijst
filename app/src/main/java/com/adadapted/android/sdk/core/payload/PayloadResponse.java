package com.adadapted.android.sdk.core.payload;

import J6.AbstractC0650j;
import J6.r;
import g7.b;
import g7.g;
import java.util.List;
import k7.AbstractC6149r0;
import k7.C0;
import k7.C6125f;

@g
/* loaded from: classes.dex */
public final class PayloadResponse {
    private final List<Payload> payloads;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b[] $childSerializers = {new C6125f(Payload$$serializer.INSTANCE)};

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return PayloadResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PayloadResponse(int i8, List list, C0 c02) {
        if (1 != (i8 & 1)) {
            AbstractC6149r0.a(i8, 1, PayloadResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.payloads = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayloadResponse copy$default(PayloadResponse payloadResponse, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = payloadResponse.payloads;
        }
        return payloadResponse.copy(list);
    }

    public final List<Payload> component1() {
        return this.payloads;
    }

    public final PayloadResponse copy(List<Payload> list) {
        r.e(list, "payloads");
        return new PayloadResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PayloadResponse) && r.a(this.payloads, ((PayloadResponse) obj).payloads);
    }

    public final List<Payload> getPayloads() {
        return this.payloads;
    }

    public int hashCode() {
        return this.payloads.hashCode();
    }

    public String toString() {
        return "PayloadResponse(payloads=" + this.payloads + ")";
    }

    public PayloadResponse(List<Payload> list) {
        r.e(list, "payloads");
        this.payloads = list;
    }
}
