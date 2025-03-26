package io.ktor.client.plugins;

import J6.r;

/* loaded from: classes2.dex */
public final class SendCountExceedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendCountExceedException(String str) {
        super(str);
        r.e(str, "message");
    }
}
